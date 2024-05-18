package hiepvd.QuanLyNhanVien.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import hiepvd.QuanLyNhanVien.models.Luong;

@Repository
public interface LuongRepository extends JpaRepository<Luong, String> {

}
