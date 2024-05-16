package hiepvd.QuanLyNhanVien.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hiepvd.QuanLyNhanVien.models.HeSoLuong;
import hiepvd.QuanLyNhanVien.repositories.HeSoLuongRepository;

@Service
public class HeSoLuongServiceImpl implements HeSoLuongService {
	@Autowired HeSoLuongRepository heSoLuongRepository;
	
	@Override
	public List<HeSoLuong> findAllHeSoLuong() {
		return heSoLuongRepository.findAll();
	}
	
	@Override
	public HeSoLuong findCustomerByID(String maBac) {
		Optional<HeSoLuong> opt =heSoLuongRepository.findById(maBac);
		if (opt.isPresent()) 
			return opt.get(); 
		else 
			return null;
	}

	@Override
	public void addHeSoLuong(HeSoLuong heSoLuong) {
		heSoLuongRepository.save(heSoLuong);
		
	}

	@Override
	public void deleteHeSoLuong(String maBac) {
		heSoLuongRepository.deleteById(maBac);
		
	}
}
