package hiepvd.QuanLyNhanVien.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import hiepvd.QuanLyNhanVien.models.NhanVien;

@Repository
public interface NhanVienRepository extends JpaRepository<NhanVien, String> {
	Page<NhanVien> findAll(Pageable pageable);
}
