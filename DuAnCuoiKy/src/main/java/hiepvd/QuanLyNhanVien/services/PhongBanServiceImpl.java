package hiepvd.QuanLyNhanVien.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hiepvd.QuanLyNhanVien.models.PhongBan;
import hiepvd.QuanLyNhanVien.repositories.PhongBanRepository;

@Service
public class PhongBanServiceImpl implements PhongBanService{
	@Autowired PhongBanRepository phongBanRepository;
	
	@Override
	public List<PhongBan> getAllPhongBan() {
		return phongBanRepository.findAll();
	}

	@Override
	public Optional<PhongBan> getPhongBanById(String mapb) {
		return phongBanRepository.findById(mapb);
	}

	@Override
	public PhongBan savePhongBan(PhongBan phongBan) {
		return phongBanRepository.save(phongBan);
	}
	
	@Override
	public void deletePhongBan(String maphong) {
		phongBanRepository.deleteById(maphong);
	}
	
}
