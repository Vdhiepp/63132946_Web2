package hiepvd.QuanLyNhanVien.models;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity						
@Table(name = "nhanvien")	
public class NhanVien {
    @Id						
    @GeneratedValue(strategy = GenerationType.IDENTITY)  
    @Column(name = "maNV")	
    private int maNV;
    
    @Column(name = "hoNV")  
    private String hoNV;	 

    @Column(name = "tenNV")  
    private String tenNV;	

    @Column(name = "gioiTinh")  
    private String gioiTinh;	
    
    @Column(name = "chucVu")  
    private String chucVu;	
    
    @Column(name = "cccd")	
    private int cccd;
    
    @Column(name = "ngaySinh")	
    private Date ngaySinh;
    
    @Column(name = "maPhong")	
    private int maPhong;
    
    @Column(name = "maLuong")	
    private int maLuong;
    
    public NhanVien() {}

    public NhanVien(String hoNV, String tenNV, String gioiTinh, String chucVu, int cccd, Date ngaySinh) {
        this.hoNV = hoNV;
        this.tenNV = tenNV;
        this.gioiTinh = gioiTinh;
        this.chucVu = chucVu;
        this.cccd = cccd;
        this.ngaySinh = ngaySinh;
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

	public String getGioiTinh() {
		return gioiTinh;
	}

	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}

	public String getChucVu() {
		return chucVu;
	}

	public void setChucVu(String chucVu) {
		this.chucVu = chucVu;
	}

	public int getCccd() {
		return cccd;
	}

	public void setCccd(int cccd) {
		this.cccd = cccd;
	}

	public Date getNgaySinh() {
		return ngaySinh;
	}

	public void setNgaySinh(Date ngaySinh) {
		this.ngaySinh = ngaySinh;
	}

	public int getMaPhong() {
		return maPhong;
	}

	public void setMaPhong(int maPhong) {
		this.maPhong = maPhong;
	}

	public int getMaLuong() {
		return maLuong;
	}

	public void setMaLuong(int maLuong) {
		this.maLuong = maLuong;
	}

	// toString method (optional)
	@Override
	public String toString() {
		return "NhanVien{" + 
						"maNV=" + maNV + 
						", hoNV= '" + hoNV + '\'' +
						", tenNV= '" + tenNV + '\'' +
						", gioiTinh= '" + gioiTinh + '\'' +
						", chucVu= '" + chucVu + '\'' +
						", cccd= '" + cccd + '\'' +
						", ngaySinh= '" + ngaySinh + '\'' +
						", phongBan= '" + maPhong + '\'' +
						", tienLuong= '" + maLuong + '\'' +
						'}';
	}
	
}
