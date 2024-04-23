package hiepvd.QuanLyNhanVien.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity						
@Table(name = "phongban")
public class PhongBan {
	@Id						
    @GeneratedValue(strategy = GenerationType.IDENTITY)  
    @Column(name = "MaPhong")	
    private String MaPhong;
	
	@Column(name = "TenPhong")  
    private String TenPhong;	
	
	@Column(name = "TenTruongPhong")  
    private String TenTruongPhong;	 
	
	@Column(name = "DienThoaiPhong")	
    private int DienThoaiPhong;
	
	public PhongBan() {}
	
	public PhongBan(String MaPhong, String TenPhong, String TenTruongPhong, int DienThoaiPhong) {
        this.MaPhong = MaPhong;
        this.TenPhong = TenPhong;
        this.TenTruongPhong = TenTruongPhong;
        this.DienThoaiPhong = DienThoaiPhong;
    }

	public String getMaPhong() {
		return MaPhong;
	}

	public void setMaPhong(String maPhong) {
		MaPhong = maPhong;
	}

	public String getTenPhong() {
		return TenPhong;
	}

	public void setTenPhong(String tenPhong) {
		TenPhong = tenPhong;
	}

	public String getTenTruongPhong() {
		return TenTruongPhong;
	}

	public void setTenTruongPhong(String tenTruongPhong) {
		TenTruongPhong = tenTruongPhong;
	}

	public int getDienThoaiPhong() {
		return DienThoaiPhong;
	}

	public void setDienThoaiPhong(int dienThoaiPhong) {
		DienThoaiPhong = dienThoaiPhong;
	}
	
	
}
