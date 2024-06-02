package hiepvd.QuanLyNhanVien.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import hiepvd.QuanLyNhanVien.models.NhanVien;
import hiepvd.QuanLyNhanVien.repositories.NhanVienRepository;

@Service
public class NhanVienServiceImpl implements NhanVienService {
	@Autowired NhanVienRepository nhanVienRepository;
	static List<NhanVien> dsNhanVien;
	@Override
	public List<NhanVien> getAllNhanVien() {
		return nhanVienRepository.findAll();
	}

	@Override
	public Optional<NhanVien> getNhanVienById(String manv) {
		return nhanVienRepository.findById(manv);
	}

	@Override
	public NhanVien saveNhanVien(NhanVien nhanVien) {
		return nhanVienRepository.save(nhanVien);
	}


	@Override
	public void deleteNhanVien(String manv) {
		nhanVienRepository.deleteById(manv);
		
	}
	
	@Override
    public Page<NhanVien> getAllNhanViens(Pageable pageable) {
        return nhanVienRepository.findAll(pageable);
    }

	@Override
    public Page<NhanVien> searchNhanViensByTenNV(String tenNV, Pageable pageable) {
        return nhanVienRepository.findByTenNVContainingIgnoreCase(tenNV, pageable);
    }
	
}
