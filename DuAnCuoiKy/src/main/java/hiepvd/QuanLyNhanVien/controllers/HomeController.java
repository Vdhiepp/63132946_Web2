package hiepvd.QuanLyNhanVien.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import hiepvd.QuanLyNhanVien.models.NhanVien;
import hiepvd.QuanLyNhanVien.services.NhanVienService;

@Controller
public class HomeController {
	@GetMapping("/home")
	public String index() {
		return "index.html";
	}
	
	@GetMapping("/login")
	public String login() {
		return "login.html";
	}
				
	@Autowired
    private NhanVienService nhanVienService;

	@GetMapping("/hienThi")
	public String hienThi() {
		return "themNV.html";
	}
	
	@GetMapping("/themNV")
	public String themNV() {
		return "themNV.html";
	}
		
    @PostMapping("/themNV")
    public String themNhanVien(@RequestParam String maNV, 
                               @RequestParam String hoNV, 
                               @RequestParam String tenNV, 
                               @RequestParam String gioiTinh, 
                               @RequestParam String diaChi,
                               @RequestParam String chucVu,
                               @RequestParam String trinhDo,
                               @RequestParam Float luongCoSo,
                               @RequestParam String maBac,
                               @RequestParam String maPhuCap,
                               @RequestParam String maThuong,
                               @RequestParam String maPhong,
                               @RequestParam Float luong) {
        
        NhanVien nhanVien = new NhanVien();
        nhanVien.setMaNV(maNV);
        nhanVien.setHoNV(hoNV);
        nhanVien.setTenNV(tenNV);
        nhanVien.setGioiTinh(gioiTinh);
        nhanVien.setDiaChi(diaChi);
        nhanVien.setChucVu(chucVu);
        nhanVien.setTrinhDo(trinhDo);
        nhanVien.setLuongCoSo(luongCoSo);
        nhanVien.setMaHSL(maBac);
        nhanVien.setMaPhuCap(maPhuCap);
        nhanVien.setMaThuong(maThuong);
        nhanVien.setMaPhong(maPhong);
        nhanVien.setLuong(luong);

        nhanVienService.addNhanVien(nhanVien);
        
        return "redirect:/danhsachNV"; // Redirect tới trang danh sách nhân viên sau khi thêm mới
    }
	
}
