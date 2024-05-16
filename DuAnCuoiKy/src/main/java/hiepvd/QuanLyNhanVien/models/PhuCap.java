package hiepvd.QuanLyNhanVien.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity						
@Table(name = "phucap")
public class PhuCap {
	@Id						
    @Column(name = "ma_phu_cap")	
    private String maPhuCap;
					
    @Column(name = "chi_tiet")	
    private String chiTiet;
    				
    @Column(name = "so_tien")	
    private Float soTien;
    
    public PhuCap() {}

	public PhuCap(String maPhuCap, String chiTiet, Float soTien) {
		super();
		this.maPhuCap = maPhuCap;
		this.chiTiet = chiTiet;
		this.soTien = soTien;
	}

	public String getMaPhuCap() {
		return maPhuCap;
	}

	public void setMaPhuCap(String maPhuCap) {
		this.maPhuCap = maPhuCap;
	}

	public String getChiTiet() {
		return chiTiet;
	}

	public void setChiTiet(String chiTiet) {
		this.chiTiet = chiTiet;
	}

	public Float getSoTien() {
		return soTien;
	}

	public void setSoTien(Float soTien) {
		this.soTien = soTien;
	}
    
    
}
