package hiepvd.QuanLyNhanVien.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import hiepvd.QuanLyNhanVien.models.TTNhanVien;

@Repository
public interface TTNhanVienRepository extends JpaRepository<TTNhanVien, Integer> {
	
}
