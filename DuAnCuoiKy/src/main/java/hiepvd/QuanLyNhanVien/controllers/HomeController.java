package hiepvd.QuanLyNhanVien.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import hiepvd.QuanLyNhanVien.models.PhongBan;
import hiepvd.QuanLyNhanVien.services.PhongBanService;

@Controller
public class HomeController {
	@GetMapping("/")
	public String index() {
		return "index.html";
	}
	@GetMapping("/about")
	public String about() {
		return "about.html";
	}
	@GetMapping("/service")
	public String sevrice() {
		return "service.html";
	}
	
	
	@GetMapping("/mau")
	public String mau() {
		return "page-mau-HTML.html";
	}
	@Autowired PhongBanService phongBanService;
	@GetMapping("/phongBan/all")
	public String getAll(Model model) {
		List<PhongBan> dsKH = phongBanService.findAllPhongBan();
		model.addAttribute("dsPhongBan", dsKH);
		return "danhsachPB";
	}
}
