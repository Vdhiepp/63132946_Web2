package hiepvd.QuanLyNhanVien.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import hiepvd.QuanLyNhanVien.models.PhongBan;
import hiepvd.QuanLyNhanVien.services.PhongBanService;

@Controller
public class PhongBanController {
	@Autowired PhongBanService phongBanService;
	@GetMapping("/phongBan/all")
	public String getAll(Model model) {
		List<PhongBan> dsPB = phongBanService.getAllPhongBan();
		model.addAttribute("dsPhongBan", dsPB);
		return "danhsachPB";
	}
}
