package hiepvd.QuanLyNhanVien.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hiepvd.QuanLyNhanVien.models.Luong;
import hiepvd.QuanLyNhanVien.repositories.LuongRepository;

@Service
public class LuongServiceImpl implements LuongService{
	@Autowired LuongRepository luongRepository;
	
	@Override
	public List<Luong> getAllLuong() {
		return luongRepository.findAll();
	}

	@Override
	public Optional<Luong> getLuongById(String maluong) {
		return luongRepository.findById(maluong);
	}

	@Override
	public Luong saveLuong(Luong luong) {
		return luongRepository.save(luong);
	}

	@Override
	public void deleteLuong(String maluong) {
		luongRepository.deleteById(maluong);
	}

}
