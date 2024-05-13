package hiepvd.QuanLyNhanVien.services;

import java.util.List;

import org.springframework.stereotype.Service;

import hiepvd.QuanLyNhanVien.models.PhongBan;

@Service
public interface PhongBanService {
		List<PhongBan> findAllPhongBan();
		PhongBan findCustomerByID(String maphong);
	void addPhongBan(PhongBan phongBan);
	void deletePhongBan(String maphong);
}