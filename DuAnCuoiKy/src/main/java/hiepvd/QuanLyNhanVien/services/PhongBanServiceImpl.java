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
	public List<PhongBan> findAllPhongBan() {
		return phongBanRepository.findAll();
	}
	
	@Override
	public PhongBan findCustomerByID(String maphong) {
		Optional<PhongBan> opt =phongBanRepository.findById(maphong);
		if (opt.isPresent()) 
			return opt.get(); 
		else 
			return null;
	}

	@Override
	public void addPhongBan(PhongBan phongBan) {
		phongBanRepository.save(phongBan);
	}
	
	@Override
	public void deletePhongBan(String maphong) {
		phongBanRepository.deleteById(maphong);
	}

	
}
