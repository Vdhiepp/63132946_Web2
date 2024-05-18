package hiepvd.QuanLyNhanVien.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hiepvd.QuanLyNhanVien.models.HopDong;
import hiepvd.QuanLyNhanVien.repositories.HopDongRepository;

@Service
public class HopDongServiceImpl implements HopDongService{
	@Autowired HopDongRepository hopDongRepository;

	@Override
	public List<HopDong> getAllHopDong() {
		return hopDongRepository.findAll();
	}

	@Override
	public Optional<HopDong> getHopDongById(int id) {
		return hopDongRepository.findById(id);
	}

	@Override
	public HopDong saveHopDong(HopDong hopDong) {
		return hopDongRepository.save(hopDong);
	}

	@Override
	public void deleteHopDong(int id) {
		hopDongRepository.deleteById(id);
	}

}
