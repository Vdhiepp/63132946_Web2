package hiepvd.QuanLyNhanVien.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import hiepvd.QuanLyNhanVien.models.PhongBan;

@Service
public interface PhongBanService {
	List<PhongBan> getAllPhongBan();
	Optional<PhongBan> getPhongBanById(String mapb);
	PhongBan savePhongBan(PhongBan phongBan);
	void deletePhongBan(String maphong);
}
