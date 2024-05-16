package hiepvd.QuanLyNhanVien.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hiepvd.QuanLyNhanVien.models.Thuong;
import hiepvd.QuanLyNhanVien.repositories.ThuongRepository;

@Service
public class ThuongServiceImpl implements ThuongService{
	@Autowired ThuongRepository thuongRepository;
	
	@Override
	public List<Thuong> findAllThuong() {
		return thuongRepository.findAll();
	}

	@Override
	public Thuong findCustomerByID(String maThuong) {
		Optional<Thuong> opt =thuongRepository.findById(maThuong);
		if (opt.isPresent()) 
			return opt.get(); 
		else 
			return null;
	}

	@Override
	public void addThuong(Thuong t) {
		thuongRepository.save(t);	
	}

	@Override
	public void deleteThuong(String maThuong) {
		thuongRepository.deleteById(maThuong);
	}

}
