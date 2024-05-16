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

	@Column(name = "ho_nv")
	private String hoNV;

	@Column(name = "ten_nv")
	private String tenNV;

	@Column(name = "gioi_tinh")
	private String gioiTinh;

	@Column(name = "ngay_sinh")
	private Date ngaySinh;

	@Column(name = "dia_chi")
	private String diaChi;

	@Column(name = "chuc_vu")
	private String chucVu;

	@Column(name = "ten_phong_ban")
	private String tenPhong;
	
	@Column(name = "trinh_do")
	private String trinhDo;

	@Column(name = "luong_co_so")
	private Float luongCoSo;

	@Column(name = "ma_bac")
	private String maHSL;
	
	@Column(name = "ma_phu_cap")
	private String maPhuCap;
	
	@Column(name = "ma_thuong")
	private String maThuong;
	
	@Column(name = "ma_phong")
	private String maPhong;

	@Column(name = "tien_luong")
	private Float luong;

	public NhanVien() {
	}

	public NhanVien(String maNV, String hoNV, String tenNV, String gioiTinh, Date ngaySinh, String diaChi,
			String chucVu, String tenPhong, String trinhDo, Float luongCoSo, String maHSL, String maPhuCap,
			String maThuong, String maPhong, Float luong) {
		super();
		this.maNV = maNV;
		this.hoNV = hoNV;
		this.tenNV = tenNV;
		this.gioiTinh = gioiTinh;
		this.ngaySinh = ngaySinh;
		this.diaChi = diaChi;
		this.chucVu = chucVu;
		this.tenPhong = tenPhong;
		this.trinhDo = trinhDo;
		this.luongCoSo = luongCoSo;
		this.maHSL = maHSL;
		this.maPhuCap = maPhuCap;
		this.maThuong = maThuong;
		this.maPhong = maPhong;
		this.luong = luong;
	}

	public String getMaNV() {
		return maNV;
	}

	public void setMaNV(String maNV) {
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

	public Date getNgaySinh() {
		return ngaySinh;
	}

	public void setNgaySinh(Date ngaySinh) {
		this.ngaySinh = ngaySinh;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public String getChucVu() {
		return chucVu;
	}

	public void setChucVu(String chucVu) {
		this.chucVu = chucVu;
	}

	public String getTenPhong() {
		return tenPhong;
	}

	public void setTenPhong(String tenPhong) {
		this.tenPhong = tenPhong;
	}

	public String getTrinhDo() {
		return trinhDo;
	}

	public void setTrinhDo(String trinhDo) {
		this.trinhDo = trinhDo;
	}

	public Float getLuongCoSo() {
		return luongCoSo;
	}

	public void setLuongCoSo(Float luongCoSo) {
		this.luongCoSo = luongCoSo;
	}

	public String getMaHSL() {
		return maHSL;
	}

	public void setMaHSL(String maHSL) {
		this.maHSL = maHSL;
	}

	public String getMaPhuCap() {
		return maPhuCap;
	}

	public void setMaPhuCap(String maPhuCap) {
		this.maPhuCap = maPhuCap;
	}

	public String getMaThuong() {
		return maThuong;
	}

	public void setMaThuong(String maThuong) {
		this.maThuong = maThuong;
	}

	public String getMaPhong() {
		return maPhong;
	}

	public void setMaPhong(String maPhong) {
		this.maPhong = maPhong;
	}

	public Float getLuong() {
		return luong;
	}

	public void setLuong(Float luong) {
		this.luong = luong;
	}
	
}
