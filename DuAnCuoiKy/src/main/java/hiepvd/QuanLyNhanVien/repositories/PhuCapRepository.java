package hiepvd.QuanLyNhanVien.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import hiepvd.QuanLyNhanVien.models.PhuCap;

@Repository
public interface PhuCapRepository extends JpaRepository<PhuCap, String> {

}
