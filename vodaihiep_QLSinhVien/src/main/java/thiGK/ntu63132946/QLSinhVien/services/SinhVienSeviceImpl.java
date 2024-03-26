package thiGK.ntu63132946.QLSinhVien.services;

import org.springframework.stereotype.Service;

import thiGK.ntu63132946.QLSinhVien.models.SinhVien;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
@Service
public class SinhVienSeviceImpl implements SinhVienService {
	static List<SinhVien> dsSinhVien=  new ArrayList<SinhVien>();
	static {
					dsSinhVien.add(new SinhVien("0001", "Võ Đại Hiệp", "63CNTTCLC"));
					dsSinhVien.add(new SinhVien("0002", "Trần Văn Long", "63CNTTCLC"));
					dsSinhVien.add(new SinhVien("0003", "Phạm Thị Hoa", "63CNTTCLC"));
					dsSinhVien.add(new SinhVien("0004", "Trần Văn Minh", "63CNTTCLC"));
					dsSinhVien.add(new SinhVien("0005", "Nguyễn Mạnh Hùng", "63CNTTCLC"));
					dsSinhVien.add(new SinhVien("0006", "Bùi Minh Thiện", "63CNTTCLC"));
					dsSinhVien.add(new SinhVien("0007", "Võ Xuân Ninh", "63CNTTCLC"));
					dsSinhVien.add(new SinhVien("0008", "Nguyễn Long", "63CNTTCLC"));
					dsSinhVien.add(new SinhVien("0009", "Phan Minh Hải", "63CNTTCLC"));
					dsSinhVien.add(new SinhVien("0010", "Lê Xuân Ngọc", "63CNTTCLC"));
					dsSinhVien.add(new SinhVien("0011", "Nguyễn Chi Mai", "63CNTTCLC"));
					dsSinhVien.add(new SinhVien("0012", "Bùi Minh Khuê", "63CNTTCLC"));
	}

	@Override
	public Page<SinhVien> findPaginated(Pageable pageable) {
		int pageSize = pageable.getPageSize();
        int currentPage = pageable.getPageNumber();
        int startItem = currentPage * pageSize;
        List<SinhVien> list;

        if (dsSinhVien.size() < startItem) {
            list = Collections.emptyList();
        } else {
            int toIndex = Math.min(startItem + pageSize, dsSinhVien.size());
            list = dsSinhVien.subList(startItem, toIndex);
        }
        Page<SinhVien> sinhvienPage = new PageImpl<SinhVien>(list, PageRequest.of(currentPage, pageSize), dsSinhVien.size());
        return sinhvienPage;
	}

}