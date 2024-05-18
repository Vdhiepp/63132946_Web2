package hiepvd.QuanLyNhanVien.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import hiepvd.QuanLyNhanVien.models.HopDong;

@Repository
public interface HopDongRepository extends JpaRepository<HopDong, Integer> {

}
