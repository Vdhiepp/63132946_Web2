package hiepvd.QuanLyNhanVien.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import hiepvd.QuanLyNhanVien.models.HeSoLuong;

@Repository
public interface HeSoLuongRepository extends JpaRepository<HeSoLuong, String> {

}
