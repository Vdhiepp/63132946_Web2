package hiepvd.QuanLyNhanVien.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "users")
public class Users {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name = "user_name")
	private String userName;
	
	@Column(name = "pass_word")
	private String pass;
	
	@Column(name = "ho_ten")
	private String hoTen;
	
	@Column(name = "quyen")
	private String quyen;
	
	public Users() {
		
	}

	public Users(int id, String userName, String pass, String hoTen, String quyen) {
		super();
		this.id = id;
		this.userName = userName;
		this.pass = pass;
		this.hoTen = hoTen;
		this.quyen = quyen;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public String getQuyen() {
		return quyen;
	}

	public void setQuyen(String quyen) {
		this.quyen = quyen;
	}
	
	
}
