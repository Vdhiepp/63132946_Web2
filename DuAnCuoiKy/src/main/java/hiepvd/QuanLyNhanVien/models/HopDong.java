package hiepvd.QuanLyNhanVien.models;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "hopdong")
public class HopDong {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "ma_nv")
	private String maNV;

	@Column(name = "ngay_bat_dau")
	private Date ngayStart;

	@Column(name = "ngay_ket_thuc")
	private Date ngayEnd;

	public HopDong() {
		
	}

	public HopDong(int id, String maNV, Date ngayStart, Date ngayEnd) {
		super();
		this.id = id;
		this.maNV = maNV;
		this.ngayStart = ngayStart;
		this.ngayEnd = ngayEnd;
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

	public Date getNgayStart() {
		return ngayStart;
	}

	public void setNgayStart(Date ngayStart) {
		this.ngayStart = ngayStart;
	}

	public Date getNgayEnd() {
		return ngayEnd;
	}

	public void setNgayEnd(Date ngayEnd) {
		this.ngayEnd = ngayEnd;
	}
	
}
