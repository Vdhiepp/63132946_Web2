package hiepvd.QuanLyNhanVien.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import hiepvd.QuanLyNhanVien.models.HopDong;

@Service
public interface HopDongService {
	List<HopDong> getAllHopDong();
	Optional<HopDong> getHopDongById(int id);
	HopDong saveHopDong(HopDong hopDong);
	void deleteHopDong(int id); 
}
