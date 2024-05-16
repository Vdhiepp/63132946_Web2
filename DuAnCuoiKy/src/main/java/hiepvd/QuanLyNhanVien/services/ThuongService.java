package hiepvd.QuanLyNhanVien.services;

import java.util.List;

import org.springframework.stereotype.Service;

import hiepvd.QuanLyNhanVien.models.Thuong;

@Service
public interface ThuongService {
	List<Thuong> findAllThuong();
	Thuong findCustomerByID(String maThuong);
void addThuong(Thuong t);
void deleteThuong(String maThuong);
}
