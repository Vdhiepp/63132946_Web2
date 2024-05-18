package hiepvd.QuanLyNhanVien.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import hiepvd.QuanLyNhanVien.models.NhanVien;
import hiepvd.QuanLyNhanVien.services.NhanVienService;
import hiepvd.QuanLyNhanVien.services.PhongBanService;


@Controller
public class NhanVienController {
	@Autowired NhanVienService nhanVienService; 
	@Autowired PhongBanService phongBanService; 
	@GetMapping("/nhanVien")
	public String getAllNhanViens(@RequestParam(defaultValue = "0") int page, Model model) {
        Pageable pageable = PageRequest.of(page, 10); 
        Page<NhanVien> dsNhanVien = nhanVienService.getAllNhanViens(pageable);
        model.addAttribute("dsNhanVien", dsNhanVien);
        return "danhsachNV";
    }

}
