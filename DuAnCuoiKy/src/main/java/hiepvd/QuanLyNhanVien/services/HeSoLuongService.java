package hiepvd.QuanLyNhanVien.services;

import java.util.List;

import org.springframework.stereotype.Service;

import hiepvd.QuanLyNhanVien.models.HeSoLuong;

@Service
public interface HeSoLuongService {
	List<HeSoLuong> findAllHeSoLuong();
	HeSoLuong findCustomerByID(String maBac);
void addHeSoLuong(HeSoLuong hsl);
void deleteHeSoLuong(String maBac);
}
