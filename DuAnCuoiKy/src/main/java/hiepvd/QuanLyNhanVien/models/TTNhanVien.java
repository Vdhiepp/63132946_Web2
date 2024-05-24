package hiepvd.QuanLyNhanVien.models;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "ttnhanvien")
public class TTNhanVien {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "ma_nv")
	private String maNV;

	@Column(name = "noi_sinh")
	private String noiSinh;
	
	@Column(name = "nguyen_quan")
	private String nguyenQuan;

	@Column(name = "hk_thuong_tru")
	private String hkThuong;
	
	@Column(name = "hk_tam_tru")
	private String hkTam;
	
	@Column(name = "sdt")
	private int sdt;
	
	@Column(name = "ngay_vao_cty")
	private Date ngayVao;
	
	@Column(name = "ton_giao")
	private String tonGiao;
	
	@Column(name = "quoc_tich")
	private String quocTich;
	
	@Column(name = "ngoai_ngu")
	private String ngoaiNgu;
	
	@Column(name = "hoc_van")
	private String hocVan;

	public TTNhanVien() {
		super();
	}

	public TTNhanVien(int id, String maNV, String noiSinh, String nguyenQuan, String hkThuong, String hkTam, int sdt,
			Date ngayVao, String tonGiao, String quocTich, String ngoaiNgu, String hocVan) {
		super();
		this.id = id;
		this.maNV = maNV;
		this.noiSinh = noiSinh;
		this.nguyenQuan = nguyenQuan;
		this.hkThuong = hkThuong;
		this.hkTam = hkTam;
		this.sdt = sdt;
		this.ngayVao = ngayVao;
		this.tonGiao = tonGiao;
		this.quocTich = quocTich;
		this.ngoaiNgu = ngoaiNgu;
		this.hocVan = hocVan;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMaNV() {
		return maNV;
	}

	public void setMaNV(String maNV) {
		this.maNV = maNV;
	}

	public String getNoiSinh() {
		return noiSinh;
	}

	public void setNoiSinh(String noiSinh) {
		this.noiSinh = noiSinh;
	}

	public String getNguyenQuan() {
		return nguyenQuan;
	}

	public void setNguyenQuan(String nguyenQuan) {
		this.nguyenQuan = nguyenQuan;
	}

	public String getHkThuong() {
		return hkThuong;
	}

	public void setHkThuong(String hkThuong) {
		this.hkThuong = hkThuong;
	}

	public String getHkTam() {
		return hkTam;
	}

	public void setHkTam(String hkTam) {
		this.hkTam = hkTam;
	}

	public int getSdt() {
		return sdt;
	}

	public void setSdt(int sdt) {
		this.sdt = sdt;
	}

	public Date getNgayVao() {
		return ngayVao;
	}

	public void setNgayVao(Date ngayVao) {
		this.ngayVao = ngayVao;
	}

	public String getTonGiao() {
		return tonGiao;
	}

	public void setTonGiao(String tonGiao) {
		this.tonGiao = tonGiao;
	}

	public String getQuocTich() {
		return quocTich;
	}

	public void setQuocTich(String quocTich) {
		this.quocTich = quocTich;
	}

	public String getNgoaiNgu() {
		return ngoaiNgu;
	}

	public void setNgoaiNgu(String ngoaiNgu) {
		this.ngoaiNgu = ngoaiNgu;
	}

	public String getHocVan() {
		return hocVan;
	}

	public void setHocVan(String hocVan) {
		this.hocVan = hocVan;
	}
	
}
