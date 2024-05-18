package hiepvd.QuanLyNhanVien.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import hiepvd.QuanLyNhanVien.models.Luong;

@Service
public interface LuongService {
	List<Luong> getAllLuong();
	Optional<Luong> getLuongById(String maluong);
	Luong saveLuong(Luong luong);
	void deleteLuong(String maluong);

}
