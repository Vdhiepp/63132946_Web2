package hiepvd.QuanLyNhanVien.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hiepvd.QuanLyNhanVien.models.PhuCap;
import hiepvd.QuanLyNhanVien.repositories.PhuCapRepository;

@Service
public class PhuCapServiceImpl implements PhuCapService{
	@Autowired PhuCapRepository phuCapRepository;

	@Override
	public List<PhuCap> findAllPhuCap() {
		return phuCapRepository.findAll();
	}

	@Override
	public PhuCap findCustomerByID(String maPhuCap) {
		Optional<PhuCap> opt =phuCapRepository.findById(maPhuCap);
		if (opt.isPresent()) 
			return opt.get(); 
		else 
			return null;
	}

	@Override
	public void addPhuCap(PhuCap pc) {
		phuCapRepository.save(pc);		
	}

	@Override
	public void deletePhuCap(String maPhuCap) {
		phuCapRepository.deleteById(maPhuCap);		
	}

}
