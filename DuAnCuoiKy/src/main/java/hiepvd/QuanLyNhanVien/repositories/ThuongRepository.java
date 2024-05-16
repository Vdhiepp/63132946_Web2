package hiepvd.QuanLyNhanVien.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import hiepvd.QuanLyNhanVien.models.Thuong;

@Repository
public interface ThuongRepository extends JpaRepository<Thuong, String> {

}
