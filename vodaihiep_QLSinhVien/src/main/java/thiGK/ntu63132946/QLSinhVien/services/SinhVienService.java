package thiGK.ntu63132946.QLSinhVien.services;

import org.springframework.stereotype.Service;
import thiGK.ntu63132946.QLSinhVien.models.SinhVien;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
@Service
public interface SinhVienService {
	public Page<SinhVien> findPaginated(Pageable pageable);
     
   
}