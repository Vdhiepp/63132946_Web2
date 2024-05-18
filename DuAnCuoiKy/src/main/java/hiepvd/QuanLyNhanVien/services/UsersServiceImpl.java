package hiepvd.QuanLyNhanVien.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hiepvd.QuanLyNhanVien.models.Users;
import hiepvd.QuanLyNhanVien.repositories.UsersRepository;

@Service
public class UsersServiceImpl implements UsersService{
	@Autowired UsersRepository usersRepository;

	@Override
	public List<Users> getAllUsers() {
		return usersRepository.findAll();
	}

	@Override
	public Optional<Users> getUsersById(int id) {
		return usersRepository.findById(id);
	}

	@Override
	public Users saveUser(Users users) {
		return usersRepository.save(users);
	}

	@Override
	public void deleteUsersById(int id) {
		usersRepository.deleteById(id);
	}

	@Override
	public List<Users> getUsersByUserName(String userName) {
		return usersRepository.findByUserName(userName);
	}

	@Override
	public List<Users> getUsersByQuyen(String quyen) {
		return usersRepository.findByQuyen(quyen);
	}

}
