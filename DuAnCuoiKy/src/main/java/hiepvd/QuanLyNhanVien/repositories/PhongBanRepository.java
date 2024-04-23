package hiepvd.QuanLyNhanVien.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import hiepvd.QuanLyNhanVien.models.PhongBan;

@Repository
public interface PhongBanRepository extends JpaRepository<PhongBan, String> { 
	
}
