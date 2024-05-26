package hiepvd.QuanLyNhanVien.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import hiepvd.QuanLyNhanVien.models.TTNhanVien;

@Repository
public interface TTNhanVienRepository extends JpaRepository<TTNhanVien, Integer> {
	Optional<TTNhanVien> findByMaNV(String maNV);
}
