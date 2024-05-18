package hiepvd.QuanLyNhanVien.models;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "nhanvien")
public class NhanVien {
	@Id
	@Column(name = "ma_nv")
	private String maNV;

	@Column(name = "ten_nv")
	private String tenNV;

	@Column(name = "cmnd")
	private int cmnd;
	
	@Column(name = "gioi_tinh")
	private String gioiTinh;

	@Column(name = "ngay_sinh")
	private Date ngaySinh;

	@Column(name = "chuc_vu")
	private String chucVu;

	@Column(name = "ma_phong")
	private String maPhong;

	@Column(name = "ma_luong")
	private String maLuong;

	public NhanVien() {
		super();
	}

	public NhanVien(String maNV, String tenNV, int cmnd, String gioiTinh, Date ngaySinh, String chucVu, String maPhong,
			String maLuong) {
		super();
		this.maNV = maNV;
		this.tenNV = tenNV;
		this.cmnd = cmnd;
		this.gioiTinh = gioiTinh;
		this.ngaySinh = ngaySinh;
		this.chucVu = chucVu;
		this.maPhong = maPhong;
		this.maLuong = maLuong;
	}

	public String getMaNV() {
		return maNV;
	}

	public void setMaNV(String maNV) {
		this.maNV = maNV;
	}

	public String getTenNV() {
		return tenNV;
	}

	public void setTenNV(String tenNV) {
		this.tenNV = tenNV;
	}

	public int getCmnd() {
		return cmnd;
	}

	public void setCmnd(int cmnd) {
		this.cmnd = cmnd;
	}

	public String getGioiTinh() {
		return gioiTinh;
	}

	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}

	public Date getNgaySinh() {
		return ngaySinh;
	}

	public void setNgaySinh(Date ngaySinh) {
		this.ngaySinh = ngaySinh;
	}

	public String getChucVu() {
		return chucVu;
	}

	public void setChucVu(String chucVu) {
		this.chucVu = chucVu;
	}

	public String getMaPhong() {
		return maPhong;
	}

	public void setMaPhong(String maPhong) {
		this.maPhong = maPhong;
	}

	public String getMaLuong() {
		return maLuong;
	}

	public void setMaLuong(String maLuong) {
		this.maLuong = maLuong;
	}
	
}
