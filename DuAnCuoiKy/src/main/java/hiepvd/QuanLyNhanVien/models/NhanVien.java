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
    
    @Column(name = "tinh_do")  
    private String trinhDo;	
    
    @Column(name = "luong_co_so")  
    private Float luongCoSo;	
    
    @Column(name = "maPhong")	
    private String maPhong;
    
    @Column(name = "tien_luong")	
    private Float luong;
    
    public NhanVien() {}

    

}
