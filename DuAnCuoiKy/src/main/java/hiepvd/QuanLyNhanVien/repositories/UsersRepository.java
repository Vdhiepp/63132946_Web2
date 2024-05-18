package hiepvd.QuanLyNhanVien.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import hiepvd.QuanLyNhanVien.models.Users;

@Repository
public interface UsersRepository extends JpaRepository<Users, Integer> {
	List<Users> findByUserName(String userName);
	List<Users> findByQuyen(String quyen);
}
