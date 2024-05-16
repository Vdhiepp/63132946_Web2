package hiepvd.QuanLyNhanVien.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import hiepvd.QuanLyNhanVien.models.NhanVien;
import hiepvd.QuanLyNhanVien.services.NhanVienService;

@Controller
public class NhanVienController {
	@Autowired NhanVienService nhanVienService;
	@GetMapping("/nhanVien/all")
	public String getAll(Model model) {
		List<NhanVien> dsNV = nhanVienService.findAllNhanVien();
		model.addAttribute("dsNhanVien", dsNV);
		return "danhsachNV";
	}
}
