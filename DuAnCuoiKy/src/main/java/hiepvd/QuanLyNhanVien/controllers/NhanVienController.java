package hiepvd.QuanLyNhanVien.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import hiepvd.QuanLyNhanVien.models.NhanVien;
import hiepvd.QuanLyNhanVien.models.PhongBan;
import hiepvd.QuanLyNhanVien.models.Luong;
import hiepvd.QuanLyNhanVien.services.NhanVienService;
import hiepvd.QuanLyNhanVien.services.PhongBanService;
import hiepvd.QuanLyNhanVien.services.LuongService;


@Controller
public class NhanVienController {
	@Autowired NhanVienService nhanVienService; 
	@Autowired PhongBanService phongBanService; 
	@Autowired LuongService luongService;
	
	@GetMapping("/nhanVien")
	public String getAllNhanViens(@RequestParam(defaultValue = "0") int page, Model model) {
        Pageable pageable = PageRequest.of(page, 10); 
        Page<NhanVien> dsNhanVien = nhanVienService.getAllNhanViens(pageable);
        model.addAttribute("dsNhanVien", dsNhanVien);
        return "danhsachNV";
    }
	
	@GetMapping("/themNV")
    public String themSanPhamForm(Model model) {
        model.addAttribute("nhanVien", new NhanVien());
        
        List<PhongBan> listPhongBan = phongBanService.getAllPhongBan();
        model.addAttribute("listPhongBan", listPhongBan);
        
        List<Luong> listLuong = luongService.getAllLuong();
        model.addAttribute("listLuong", listLuong);

        return "themNV";
    }

	@PostMapping("/themNV")
	public String themNhanVien(@ModelAttribute NhanVien nhanVien, BindingResult result, Model model) {
	    if (result.hasErrors()) {
	        model.addAttribute("listPhongBan", phongBanService.getAllPhongBan());
	        model.addAttribute("listLuong", luongService.getAllLuong());
	        return "themNV"; // Trả về trang form nếu có lỗi
	    }
	    
	    // Kiểm tra giá trị maPhong và maLuong
	    if (nhanVien.getMaPhong() == null || nhanVien.getMaPhong().isEmpty()) {
	        result.rejectValue("maPhong", "error.maPhong", "Phòng không được để trống");
	        model.addAttribute("listPhongBan", phongBanService.getAllPhongBan());
	        model.addAttribute("listLuong", luongService.getAllLuong());
	        return "themNV";
	    }

	    if (nhanVien.getMaLuong() == null || nhanVien.getMaLuong().isEmpty()) {
	        result.rejectValue("maLuong", "error.maLuong", "Lương không được để trống");
	        model.addAttribute("listPhongBan", phongBanService.getAllPhongBan());
	        model.addAttribute("listLuong", luongService.getAllLuong());
	        return "themNV";
	    }

	    nhanVienService.saveNhanVien(nhanVien);
	    return "redirect:/nhanVien";
	}

	@GetMapping("/suaNV/{maNV}")
    public String suaNhanVienForm(@PathVariable("maNV") String maNV, Model model) {
        Optional<NhanVien> optionalNhanVien = nhanVienService.getNhanVienById(maNV);
        if (optionalNhanVien.isPresent()) {
            model.addAttribute("nhanVien", optionalNhanVien.get());
            
            List<PhongBan> listPhongBan = phongBanService.getAllPhongBan();
            model.addAttribute("listPhongBan", listPhongBan);
            
            List<Luong> listLuong = luongService.getAllLuong();
            model.addAttribute("listLuong", listLuong);

            return "suaNV";
        } else {
            return "redirect:/nhanVien";
        }
    }

    @PostMapping("/suaNV")
    public String suaNhanVien(@RequestParam("maNV") String maNV, NhanVien nhanVien) {
    	nhanVien.setMaNV(maNV);
    	nhanVienService.saveNhanVien(nhanVien);
        return "redirect:/nhanVien";
    }

    @GetMapping("/xoaNV/{maNV}")
    public String xoaNhanVien(@PathVariable("maNV") String maNV) {
        nhanVienService.deleteNhanVien(maNV);
        return "redirect:/nhanVien";
    }

    @GetMapping("/chitietNV/{maNV}")
    public String chiTietNhanVien(@PathVariable("maNV") String maNV, Model model) {
        Optional<NhanVien> optionalNhanVien = nhanVienService.getNhanVienById(maNV);
        if (optionalNhanVien.isPresent()) {
            NhanVien nhanVien = optionalNhanVien.get();
            
            // Giả sử bạn có các service để lấy thông tin PhongBan và Luong
            Optional<PhongBan> optionalPhongBan = phongBanService.getPhongBanById(nhanVien.getMaPhong());
            Optional<Luong> optionalLuong = luongService.getLuongById(nhanVien.getMaLuong());

            model.addAttribute("nhanVien", nhanVien);
            model.addAttribute("phongBan", optionalPhongBan.orElse(null));
            model.addAttribute("luong", optionalLuong.orElse(null));
            
            return "chitietNV";
        } else {
            return "redirect:/nhanVien";
        }
    }




}
