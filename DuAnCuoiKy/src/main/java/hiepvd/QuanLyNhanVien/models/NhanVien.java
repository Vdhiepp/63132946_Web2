package hiepvd.QuanLyNhanVien.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity						// đánh dấu rằng đây là một entity
@Table(name = "nhanvien")	// chỉ định tên của bảng trong cơ sở dữ liệu.
public class NhanVien {
    @Id						
    @GeneratedValue(strategy = GenerationType.IDENTITY)  
    @Column(name = "maNV")	
    private int maNV;
    
    @Column(name = "hoNV")  
    private String hoNV;	 

    @Column(name = "tenNV")  
    private String tenNV;	

    @Column(name = "email")
    private String email;
    
    @Column(name = "sdt")	
    private int sdt;
    
    @Column(name = "diaChi")
    private String diaChi;
    
    public NhanVien() {}

    public NhanVien(String hoNV, String tenNV, String email, int sdt, String diaChi) {
        this.hoNV = hoNV;
        this.tenNV = tenNV;
        this.email = email;
        this.sdt = sdt;
        this.diaChi = diaChi;
    }

	public int getMaNV() {
		return maNV;
	}

	public void setMaNV(int maNV) {
		this.maNV = maNV;
	}

	public String getHoNV() {
		return hoNV;
	}

	public void setHoNV(String hoNV) {
		this.hoNV = hoNV;
	}

	public String getTenNV() {
		return tenNV;
	}

	public void setTenNV(String tenNV) {
		this.tenNV = tenNV;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getSdt() {
		return sdt;
	}

	public void setSdt(int sdt) {
		this.sdt = sdt;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	// toString method (optional)
	@Override
	public String toString() {
		return "NhanVien{" + 
						"maNV=" + maNV + 
						", hoNV= '" + hoNV + '\'' +
						", tenNV= '" + tenNV + '\'' +
						", email= '" + email + '\'' +
						", sdt= '" + sdt + '\'' +
						", diaChi= '" + diaChi + '\'' +
						'}';
	}
	
}
