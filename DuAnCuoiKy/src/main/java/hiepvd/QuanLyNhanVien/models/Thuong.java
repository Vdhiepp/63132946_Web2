package hiepvd.QuanLyNhanVien.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity						
@Table(name = "thuong")
public class Thuong {
	@Id						
    @Column(name = "ma_thuong")	
    private String maThuong;
					
    @Column(name = "so_tien")	
    private String soTien;
    
    public Thuong() {}

	public Thuong(String maThuong, String soTien) {
		super();
		this.maThuong = maThuong;
		this.soTien = soTien;
	}

	public String getMaThuong() {
		return maThuong;
	}

	public void setMaThuong(String maThuong) {
		this.maThuong = maThuong;
	}

	public String getSoTien() {
		return soTien;
	}

	public void setSoTien(String soTien) {
		this.soTien = soTien;
	}
    
}
