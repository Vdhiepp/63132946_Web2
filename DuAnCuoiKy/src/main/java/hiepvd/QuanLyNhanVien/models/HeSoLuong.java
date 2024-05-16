package hiepvd.QuanLyNhanVien.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity						
@Table(name = "hsl")
public class HeSoLuong {
	@Id						
    @Column(name = "ma_bac")	
    private String maHSL;
						
    @Column(name = "he_so")	
    private Float heSo;
    
    public HeSoLuong() {}

	public HeSoLuong(String maHSL, Float heSo) {
		super();
		this.maHSL = maHSL;
		this.heSo = heSo;
	}

	public String getMaHSL() {
		return maHSL;
	}

	public void setMaHSL(String maHSL) {
		this.maHSL = maHSL;
	}

	public Float getHeSo() {
		return heSo;
	}

	public void setHeSo(Float heSo) {
		this.heSo = heSo;
	}
    
}
