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
import hiepvd.QuanLyNhanVien.models.TTNhanVien;
import hiepvd.QuanLyNhanVien.services.NhanVienService;
import hiepvd.QuanLyNhanVien.services.PhongBanService;
import hiepvd.QuanLyNhanVien.services.LuongService;
import hiepvd.QuanLyNhanVien.services.TTNhanVienService;


@Controller
public class NhanVienController {
	@Autowired NhanVienService nhanVienService; 
	@Autowired PhongBanService phongBanService; 
	@Autowired LuongService luongService; 
	@Autowired TTNhanVienService ttNhanVienService; 
	
	@GetMapping("/nhanVien")
	public String getAllNhanViens(@RequestParam(defaultValue = "0") int page, Model model) {
        Pageable pageable = PageRequest.of(page, 10); 
        Page<NhanVien> dsNhanVien = nhanVienService.getAllNhanViens(pageable);
        model.addAttribute("dsNhanVien", dsNhanVien);
        return "danhsachNV";
    }
	
	@GetMapping("/themNV")
    public String themNhanVienForm(Model model) {
        model.addAttribute("nhanVien", new NhanVien());
        model.addAttribute("ttNhanVien", new TTNhanVien());
        
        List<PhongBan> listPhongBan = phongBanService.getAllPhongBan();
        model.addAttribute("listPhongBan", listPhongBan);
        
        List<Luong> listLuong = luongService.getAllLuong();
        model.addAttribute("listLuong", listLuong);

        return "themNV";
    }

	@PostMapping("/themNV")
	public String themNhanVien(@ModelAttribute NhanVien nhanVien, @ModelAttribute TTNhanVien ttNhanVien, BindingResult result, Model model) {
	    if (result.hasErrors()) {
	        model.addAttribute("listPhongBan", phongBanService.getAllPhongBan());
	        model.addAttribute("listLuong", luongService.getAllLuong());
	        return "themNV"; 
	    }
	    
	    // Kiểm tra giá trị maPhong và maLuong cho NhanVien
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
	    ttNhanVienService.saveTTNhanVien(ttNhanVien); 

	    return "redirect:/nhanVien";
	}


	@GetMapping("/suaNV/{maNV}")
	public String suaNhanVienForm(@PathVariable("maNV") String maNV, Model model) {
	    Optional<NhanVien> optionalNhanVien = nhanVienService.getNhanVienById(maNV);
	    if (optionalNhanVien.isPresent()) {
	        NhanVien nhanVien = optionalNhanVien.get();
	        model.addAttribute("nhanVien", nhanVien);
	        
	        // Fetch TTNhanVien entity by maNV
	        Optional<TTNhanVien> optionalTTNhanVien = ttNhanVienService.getTTNhanVienByMaNV(maNV);
	        if (optionalTTNhanVien.isPresent()) {
	            TTNhanVien ttNhanVien = optionalTTNhanVien.get();
	            model.addAttribute("ttNhanVien", ttNhanVien);
	        } else {
	            // Create a new TTNhanVien instance if not found
	            TTNhanVien newTTNhanVien = new TTNhanVien();
	            newTTNhanVien.setMaNV(maNV);
	            model.addAttribute("ttNhanVien", newTTNhanVien);
	        }
	        
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
	public String suaNhanVien(@RequestParam("maNV") String maNV, NhanVien nhanVien, TTNhanVien ttNhanVien) {
	    nhanVien.setMaNV(maNV);
	    nhanVienService.saveNhanVien(nhanVien);
	    
	    // Lưu hoặc cập nhật thông tin của TTNhanVien
	    ttNhanVien.setMaNV(maNV); // Đảm bảo rằng maNV đã được thiết lập cho TTNhanVien
	    ttNhanVienService.saveTTNhanVien(ttNhanVien);
	    
	    return "redirect:/nhanVien";
	}


    @GetMapping("/xoaNV/{maNV}")
    public String xoaNhanVien(@PathVariable("maNV") String maNV) {
        // Lấy thông tin TTNhanVien dựa trên mã nhân viên
        Optional<TTNhanVien> optionalTTNhanVien = ttNhanVienService.getTTNhanVienByMaNV(maNV);

        // Kiểm tra xem có thông tin TTNhanVien tương ứng không
        optionalTTNhanVien.ifPresent(ttNhanVien -> {
            // Nếu có, xóa thông tin TTNhanVien
            ttNhanVienService.deleteTTNhanVien(ttNhanVien);
        });

        // Xóa thông tin nhân viên từ bảng NhanVien
        nhanVienService.deleteNhanVien(maNV);
        
        return "redirect:/nhanVien";
    }

 
    @GetMapping("/chitietNV/{maNV}")
    public String chiTietNhanVien(@PathVariable("maNV") String maNV, Model model) {
        // Trích xuất phần số từ mã nhân viên
        String maNVSauKhiTrichXuat = maNV.substring(2); // Lấy phần số sau "NV"
        
        // Chuyển đổi sang kiểu Integer
        Integer maNhanVienInt = Integer.parseInt(maNVSauKhiTrichXuat);
        
        Optional<NhanVien> optionalNhanVien = nhanVienService.getNhanVienById(maNV);
        
        if (optionalNhanVien.isPresent()) {
            NhanVien nhanVien = optionalNhanVien.get();
            
            Optional<PhongBan> optionalPhongBan = phongBanService.getPhongBanById(nhanVien.getMaPhong());
            Optional<Luong> optionalLuong = luongService.getLuongById(nhanVien.getMaLuong());

            // Lấy thông tin TTNhanVien tương ứng với maNhanVienInt
            Optional<TTNhanVien> optionalTTNhanVien = ttNhanVienService.getTTNhanVienById(maNhanVienInt);
            
            model.addAttribute("nhanVien", nhanVien);
            model.addAttribute("phongBan", optionalPhongBan.orElse(null));
            model.addAttribute("luong", optionalLuong.orElse(null));
            model.addAttribute("ttNhanVien", optionalTTNhanVien.orElse(null)); // Thêm TTNhanVien vào model
            
            return "chitietNV";
        } else {
            return "redirect:/nhanVien";
        }
    }





}
