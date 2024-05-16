package hiepvd.QuanLyNhanVien.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import hiepvd.QuanLyNhanVien.models.NhanVien;

@Repository
public interface NhanVienRepository extends JpaRepository<NhanVien, String> {

}
