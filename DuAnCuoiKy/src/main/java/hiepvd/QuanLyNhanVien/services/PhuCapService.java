package hiepvd.QuanLyNhanVien.services;

import java.util.List;

import org.springframework.stereotype.Service;

import hiepvd.QuanLyNhanVien.models.PhuCap;

@Service
public interface PhuCapService {
	List<PhuCap> findAllPhuCap();
	PhuCap findCustomerByID(String maPhuCap);
void addPhuCap(PhuCap pc);
void deletePhuCap(String maPhuCap);
}
