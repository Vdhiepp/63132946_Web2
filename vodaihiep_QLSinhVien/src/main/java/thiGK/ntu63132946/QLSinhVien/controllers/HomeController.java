package thiGK.ntu63132946.QLSinhVien.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	@GetMapping("/")
	public String Index() {
		return "index";
	}
	@GetMapping("/them")
	public String ThemMoi() {
		return "themMoi";
	}
}