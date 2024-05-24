package hiepvd.QuanLyNhanVien.services;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import hiepvd.QuanLyNhanVien.models.TTNhanVien;

@Service
public interface TTNhanVienService {
	List<TTNhanVien> getAllTTNhanVien();
	Optional<TTNhanVien> getTTNhanVienById(int id);
	TTNhanVien saveTTNhanVien(TTNhanVien ttNhanVien);
	void deleteTTNhanVien(int id);
	Page<TTNhanVien> getAllTTNhanViens(Pageable pageable);
}
