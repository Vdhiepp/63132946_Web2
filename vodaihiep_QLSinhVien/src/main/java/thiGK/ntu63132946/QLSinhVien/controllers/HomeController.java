package thiGK.ntu63132946.QLSinhVien.controllers;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import thiGK.ntu63132946.QLSinhVien.models.SinhVien;
import thiGK.ntu63132946.QLSinhVien.services.SinhVienService;

@Controller
public class HomeController {
	@GetMapping("/home")
	public String Index() {
		return "index";
	}
	
	@Autowired
	 private SinhVienService svService;
	 
	@GetMapping("/danhsachSV")
	public String listStudent(Model model,  
								@RequestParam("page") Optional<Integer> page,
								@RequestParam("size") Optional<Integer> size) {
		final int currentPage = page.orElse(1);
       final int pageSize = size.orElse(5);
       Page<SinhVien> svPage = svService.findPaginated(PageRequest.of(currentPage - 1, pageSize));
		model.addAttribute("dsSV", svPage);
		
		int totalPages = svPage.getTotalPages();
       if (totalPages > 0) {
           List<Integer> pageNumbers = IntStream.rangeClosed(1, totalPages)
               .boxed()
               .collect(Collectors.toList());
           model.addAttribute("pageNumbers", pageNumbers);
       }
       return "sinhvien_getAll_Paged";
	}
	
	@GetMapping("/themMoiSV")
	public String showForm(Model mm) {
        SinhVien sinhvienNull = new SinhVien();
        mm.addAttribute("svDTO", sinhvienNull);
        return "themMoi";
    }
	@PostMapping("/themMoiSV")
	public String submitForm(@ModelAttribute("svDTO") SinhVien sv) {
	    return "themOK";
	}
	
	@GetMapping("/timkiem")
	public String TimKiem() {
		return "TimKiem";
	}
	
}