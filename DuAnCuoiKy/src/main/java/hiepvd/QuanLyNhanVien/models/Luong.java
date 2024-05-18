package hiepvd.QuanLyNhanVien.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "luong")
public class Luong {
	@Id
	@Column(name = "ma_luong")
	private String maLuong;

	@Column(name = "luong_co_ban")
	private int luongCoBan;

	@Column(name = "he_so_luong")
	private float hsl;
	
	@Column(name = "phu_cap")
	private int phuCap;
	
	@Column(name = "so_ngay_lam")
	private int soNgay;

	public Luong() {
		
	}

	public Luong(String maLuong, int luongCoBan, float hsl, int phuCap, int soNgay) {
		super();
		this.maLuong = maLuong;
		this.luongCoBan = luongCoBan;
		this.hsl = hsl;
		this.phuCap = phuCap;
		this.soNgay = soNgay;
	}

	public String getMaLuong() {
		return maLuong;
	}

	public void setMaNV(String maLuong) {
		this.maLuong = maLuong;
	}

	public int getLuongCoBan() {
		return luongCoBan;
	}

	public void setLuongCoBan(int luongCoBan) {
		this.luongCoBan = luongCoBan;
	}

	public float getHsl() {
		return hsl;
	}

	public void setHsl(float hsl) {
		this.hsl = hsl;
	}

	public int getPhuCap() {
		return phuCap;
	}

	public void setPhuCap(int phuCap) {
		this.phuCap = phuCap;
	}

	public int getSoNgay() {
		return soNgay;
	}

	public void setSoNgay(int soNgay) {
		this.soNgay = soNgay;
	}
	
}
