package hiepvd.QuanLyNhanVien.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hiepvd.QuanLyNhanVien.models.NhanVien;
import hiepvd.QuanLyNhanVien.repositories.NhanVienRepository;

@Service
public class NhanVienServiceImpl implements NhanVienService {
	@Autowired NhanVienRepository nhanVienRepository;

	@Override
	public List<NhanVien> findAllNhanVien() {
		return nhanVienRepository.findAll();
	}

	@Override
	public NhanVien findCustomerByID(String manv) {
		Optional<NhanVien> opt =nhanVienRepository.findById(manv);
		if (opt.isPresent()) 
			return opt.get(); 
		else 
			return null;
	}

	@Override
	public void addNhanVien(NhanVien nhanVien) {
		nhanVienRepository.save(nhanVien);
		
	}

	@Override
	public void deleteNhanVien(String manv) {
		nhanVienRepository.deleteById(manv);
		
	}

}
