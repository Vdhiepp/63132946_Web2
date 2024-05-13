package hiepvd.QuanLyNhanVien.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity						
@Table(name = "phongban")
public class PhongBan {
	@Id						
    @Column(name = "ma_phong")	
    private String maphong;
	
	@Column(name = "ten_phong")  
    private String tenphong;	
	
	@Column(name = "ten_truong_phong")  
    private String tentruongphong;	 
	
	@Column(name = "sdt_phong")	
    private int sdtphong;
	
	public PhongBan() {}
	
	public PhongBan(String MaPhong, String TenPhong, String TenTruongPhong, int DienThoaiPhong) {
        this.maphong = MaPhong;
        this.tenphong = TenPhong;
        this.tentruongphong = TenTruongPhong;
        this.sdtphong = DienThoaiPhong;
    }

	public String getMaphong() {
		return maphong;
	}

	public void setMaphong(String maphong) {
		this.maphong = maphong;
	}

	public String getTenphong() {
		return tenphong;
	}

	public void setTenphong(String tenphong) {
		this.tenphong = tenphong;
	}

	public String getTentruongphong() {
		return tentruongphong;
	}

	public void setTentruongphong(String tentruongphong) {
		this.tentruongphong = tentruongphong;
	}

	public int getSdtphong() {
		return sdtphong;
	}

	public void setSdtphong(int sdtphong) {
		this.sdtphong = sdtphong;
	}
	
}
