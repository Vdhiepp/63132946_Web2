package hiepvd.QuanLyNhanVien.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hiepvd.QuanLyNhanVien.models.TTNhanVien;
import hiepvd.QuanLyNhanVien.repositories.TTNhanVienRepository;

@Service
public class TTNhanVienServiceImpl implements TTNhanVienService{
	@Autowired TTNhanVienRepository ttNhanVienRepository;
	
	@Override
	public List<TTNhanVien> getAllTTNhanVien() {
		return ttNhanVienRepository.findAll();
	}

	@Override
	public Optional<TTNhanVien> getTTNhanVienById(int id) {
		return ttNhanVienRepository.findById(id);
	}

	@Override
	public TTNhanVien saveTTNhanVien(TTNhanVien ttNhanVien) {
		return ttNhanVienRepository.save(ttNhanVien);
	}

	@Override
	public void deleteTTNhanVien(int id) {
		ttNhanVienRepository.deleteById(id);
	}
	
	@Override
    public Optional<TTNhanVien> getTTNhanVienByMaNV(String maNV) {
        return ttNhanVienRepository.findFirstByMaNV(maNV);
    }

    @Override
    public void deleteTTNhanVien(TTNhanVien ttNhanVien) {
        ttNhanVienRepository.delete(ttNhanVien);
    }

}
