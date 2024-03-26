package thiGK.ntu63132946.QLSinhVien.models;

public class SinhVien {
	private String maSoSV;
	private String hoVaTen;
	private String lopHoc;

	public String getMaSoSV() {
		return maSoSV;
	}
	public void setMaSoSV(String maSoSV) {
		this.maSoSV = maSoSV;
	}
	public String getHoVaTen() {
		return hoVaTen;
	}
	public void setHoVaTen(String hoVaTen) {
		this.hoVaTen = hoVaTen;
	}
	public String getLopHoc() {
		return lopHoc;
	}
	public void setLopHoc(String lopHoc) {
		this.lopHoc = lopHoc;
	}
	public SinhVien(String maSoSV, String hoVaTen, String lopHoc) {
		this.maSoSV = maSoSV;
		this.hoVaTen = hoVaTen;
		this.lopHoc = lopHoc;
	}
}