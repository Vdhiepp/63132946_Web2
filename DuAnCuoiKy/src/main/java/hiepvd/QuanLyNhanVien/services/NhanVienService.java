package hiepvd.QuanLyNhanVien.services;

import java.util.List;

import org.springframework.stereotype.Service;

import hiepvd.QuanLyNhanVien.models.NhanVien;

@Service
public interface NhanVienService {
	List<NhanVien> findAllNhanVien();
	NhanVien findCustomerByID(String manv);
void addNhanVien(NhanVien nhanVien);
void deleteNhanVien(String manv);
	
}