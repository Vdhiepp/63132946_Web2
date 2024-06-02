package hiepvd.QuanLyNhanVien.services;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import hiepvd.QuanLyNhanVien.models.NhanVien;

@Service
public interface NhanVienService {
	List<NhanVien> getAllNhanVien();
	Optional<NhanVien> getNhanVienById(String manv);
	NhanVien saveNhanVien(NhanVien nhanVien);
	void deleteNhanVien(String manv);
	Page<NhanVien> getAllNhanViens(Pageable pageable);
	Page<NhanVien> searchNhanViensByTenNV(String tenNV, Pageable pageable);
}