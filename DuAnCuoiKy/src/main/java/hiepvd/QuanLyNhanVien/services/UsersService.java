package hiepvd.QuanLyNhanVien.services;

import java.util.List;
import java.util.Optional;

import hiepvd.QuanLyNhanVien.models.Users;

public interface UsersService {
	List<Users> getAllUsers();
	Optional<Users> getUsersById(int id);
	Users saveUser(Users users);
	void deleteUsersById(int id);
	List<Users> getUsersByUserName(String userName);
	List<Users> getUsersByQuyen(String quyen);

}
