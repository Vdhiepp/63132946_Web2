package hievd.DisplayListObject.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import hievd.DisplayListObject.models.SinhVien;

@Controller
public class SinhVienController {
		//Ta hard-code du lieu tai day de tien demo
		static List<SinhVien> dsSinhVien= new ArrayList<SinhVien>();
		static {
					dsSinhVien.add(new SinhVien("0001", "Võ Đại Hiệp"));
					dsSinhVien.add(new SinhVien("0002", "Nguyễn Minh Quân"));
					dsSinhVien.add(new SinhVien("0003", "Võ Hoài Nam"));
					dsSinhVien.add(new SinhVien("0004", "Đặng Ngọc Mai"));
					dsSinhVien.add(new SinhVien("0005", "Nguyễn Mạnh"));				
		}
		//Het phan hard-code
		@GetMapping("/danhsachSV")
		public String listStudent(ModelMap mm) {
			mm.addAttribute("dsSV", dsSinhVien);
			return "sinhvien_getAll";
		}
}
