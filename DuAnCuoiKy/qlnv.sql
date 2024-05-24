-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Máy chủ: 127.0.0.1
-- Thời gian đã tạo: Th5 24, 2024 lúc 04:49 AM
-- Phiên bản máy phục vụ: 10.4.32-MariaDB
-- Phiên bản PHP: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Cơ sở dữ liệu: `qlnv`
--

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `hopdong`
--

CREATE TABLE `hopdong` (
  `id` int(11) NOT NULL,
  `ma_nv` varchar(10) NOT NULL,
  `ngay_bat_dau` date NOT NULL,
  `ngya_ket_thuc` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Đang đổ dữ liệu cho bảng `hopdong`
--

INSERT INTO `hopdong` (`id`, `ma_nv`, `ngay_bat_dau`, `ngya_ket_thuc`) VALUES
(1, 'NV001', '2022-05-13', '2027-05-13'),
(2, 'NV002', '2022-05-13', '2027-05-13'),
(3, 'NV003', '2022-05-13', '2022-05-13'),
(4, 'NV003', '2022-05-13', '2027-05-13'),
(5, 'NV004', '2022-05-13', '2022-05-13'),
(6, 'NV005', '2022-05-13', '2027-05-13'),
(7, 'NV006', '2022-05-13', '2022-05-13'),
(8, 'NV006', '2022-05-13', '2027-05-13'),
(9, 'NV007', '2022-05-13', '2022-05-13'),
(10, 'NV007', '2022-05-13', '2027-05-13'),
(11, 'NV008', '2022-05-13', '2022-05-13'),
(12, 'NV009', '2022-05-13', '2027-05-13'),
(13, 'NV010', '2022-05-13', '2022-05-13'),
(14, 'NV011', '2022-05-13', '2022-05-13');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `luong`
--

CREATE TABLE `luong` (
  `ma_luong` varchar(10) NOT NULL,
  `luong_co_ban` int(11) NOT NULL,
  `he_so_luong` float NOT NULL,
  `phu_cap` int(11) NOT NULL,
  `so_ngay_lam` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Đang đổ dữ liệu cho bảng `luong`
--

INSERT INTO `luong` (`ma_luong`, `luong_co_ban`, `he_so_luong`, `phu_cap`, `so_ngay_lam`) VALUES
('LNV01', 3500000, 1.82, 250000, 25),
('LNV02', 3500000, 1.82, 300000, 26),
('LNV03', 3500000, 1.82, 350000, 27),
('LNV04', 3500000, 1.82, 400000, 28),
('LNV05', 3500000, 1.82, 450000, 29),
('LNV06', 3500000, 1.82, 500000, 30),
('LQL01', 4500000, 2.24, 300000, 26),
('LQL02', 4500000, 2.24, 350000, 27),
('LQL03', 4500000, 2.24, 400000, 28),
('LQL04', 4500000, 2.24, 450000, 29),
('LQL05', 4500000, 2.24, 500000, 30);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `nhanvien`
--

CREATE TABLE `nhanvien` (
  `ma_nv` varchar(10) NOT NULL,
  `ten_nv` varchar(100) NOT NULL,
  `cmnd` int(11) NOT NULL,
  `gioi_tinh` varchar(10) NOT NULL,
  `ngay_sinh` date NOT NULL,
  `chuc_vu` varchar(100) NOT NULL,
  `ma_phong` varchar(10) NOT NULL,
  `ma_luong` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Đang đổ dữ liệu cho bảng `nhanvien`
--

INSERT INTO `nhanvien` (`ma_nv`, `ten_nv`, `cmnd`, `gioi_tinh`, `ngay_sinh`, `chuc_vu`, `ma_phong`, `ma_luong`) VALUES
('NV001', 'Nguyễn Bình An', 123456799, 'Nam', '1993-05-13', 'Nhân viên', 'NHANSU', 'LNV01'),
('NV002', 'Phạm Minh An', 123456788, 'Nam', '1993-06-15', 'Nhân viên', 'HANHCHINH', 'LNV02'),
('NV003', 'Phan Mạnh Huy', 123456787, 'Nam', '1994-02-10', 'Nhân viên', 'HANHCHINH', 'LNV03'),
('NV004', 'Phan Ngọc Ánh', 123456786, 'Nữ', '1994-10-05', 'Quản lý', 'HANHCHINH', 'LQL04'),
('NV005', 'Nguyễn Ngọc Minh Huy', 123456785, 'Nam', '1993-05-19', 'Nhân viên', 'KYTHUAT', 'LNV06'),
('NV006', 'Nguyễn Kim Lộc', 123456784, 'Nữ', '1994-12-24', 'Nhân viên', 'KETOAN', 'LNV05'),
('NV007', 'Phạm Ngọc Bảo Loan', 123456783, 'Nữ', '1992-11-02', 'Quản lý', 'KETOAN', 'LQL05'),
('NV008', 'Nguyễn Kim Lân', 123456782, 'Nam', '1994-01-03', 'Nhân viên', 'KHINHDOANH', 'LNV03'),
('NV009', 'Phan Ngọc Mai', 123456781, 'Nữ', '1995-05-18', 'Nhân viên', 'KHINHDOANH', 'LNV01'),
('NV010', 'Nguyễn Bảo Hùng', 123456780, 'Nam', '1992-07-23', 'Quản lý', 'KHINHDOANH', 'LQL02'),
('NV011', 'Nguyễn Minh Kiên', 123456779, 'Nam', '1993-02-27', 'Nhân viên', 'KYTHUAT', 'LNV05'),
('NV012', 'Lã Thúy Anh', 123456712, 'Nữ', '1993-05-11', 'Nhân viên', 'QUANHE', 'LNV05'),
('NV013', 'Nguyễn Lê Kim Anh', 123456734, 'Nữ', '1993-06-10', 'Quản lý', 'QUANHE', 'LQL03'),
('NV014', 'Ngô Tấn Cảnh', 123456731, 'Nam', '1993-12-15', 'Nhân viên', 'KYTHUAT', 'LNV02'),
('NV015', 'Ngô Nhật Hạ', 123456754, 'Nữ', '1993-01-30', 'Nhân viên', 'MARKETING', 'LNV03'),
('NV016', 'Đinh Thị Mỹ Linh', 123456756, 'Nữ', '1994-02-14', 'Nhân viên', 'NHANSU', 'LNV05'),
('NV017', 'Văn Nhật Lâm', 123456700, 'Nam', '1993-11-12', 'Quản lý', 'QUANLY', 'LQL02'),
('NV018', 'Nguyễn Thị Ngọc Ngà', 123456711, 'Nữ', '1995-05-21', 'Nhân viên', 'MARKETING', 'LNV02'),
('NV019', 'Nguyễn Dương Hoàng Vy', 123456644, 'Nữ', '1994-12-12', 'Nhân viên', 'QUANHE', 'LNV06'),
('NV020', 'Lâm Tưởng Quân', 123456733, 'Nam', '1992-01-11', 'Quản lý', 'NGHIENCUU', 'LQL01'),
('NV021', 'Nguyễn Hồng Thanh', 123456543, 'Nam', '1992-10-23', 'Nhân viên', 'HANHCHINH', 'LNV04'),
('NV022', 'Nguyễn Văn Hùng', 123456431, 'Nam', '1993-12-30', 'Nhân viên', 'HANHCHINH', 'LNV05'),
('NV023', 'Võ Anh Vũ', 123467859, 'Nam', '1995-06-24', 'Nhân viên', 'HANHCHINH', 'LNV01'),
('NV024', 'Tô Văn Hoài', 123547976, 'Nam', '1995-08-22', 'Nhân viên', 'HANHCHINH', 'LNV02'),
('NV025', 'Ngô Thành Phú', 124367945, 'Nam', '1995-09-02', 'Nhân viên', 'HANHCHINH', 'LNV05'),
('NV026', 'Mai Tấn Tài', 126758945, 'Nam', '1994-05-14', 'Nhân viên', 'KETOAN', 'LNV03'),
('NV027', 'Mai Quỳnh Trang', 367859634, 'Nữ', '1995-02-03', 'Nhân viên', 'KHINHDOANH', 'LNV03'),
('NV028', 'Phạm Gia Lộc', 789665246, 'Nam', '1994-06-27', 'Nhân viên', 'KHINHDOANH', 'LNV04'),
('NV029', 'Lương Tiến Vinh', 456378935, 'Nam', '1993-04-04', 'Nhân viên', 'KHINHDOANH', 'LNV05'),
('NV030', 'Đỗ Ngân Hà', 364874536, 'Nữ', '1995-03-16', 'Nhân viên', 'KHINHDOANH', 'LNV06'),
('NV031', 'Hoàng Quang Đăng', 657846379, 'Nam', '1994-02-02', 'Nhân viên', 'KHINHDOANH', 'LNV03'),
('NV032', 'Châu Đăng Khoa', 284756409, 'Nam', '1995-09-24', 'Nhân viên', 'KYTHUAT', 'LNV02'),
('NV033', 'Vũ Trung Hậu', 657845367, 'Nam', '1995-03-13', 'Nhân viên', 'KYTHUAT', 'LNV04'),
('NV034', 'Nguyễn Minh Thịnh', 222567356, 'Nam', '1995-03-12', 'Nhân viên', 'KETOAN', 'LNV05'),
('NV035', 'Phạm Văn Thông', 673478562, 'Nam', '1995-06-14', 'Nhân viên', 'MARKETING', 'LNV04'),
('NV036', 'Trương Văn Đạt', 223567486, 'Nam', '1005-03-12', 'Nhân viên', 'MARKETING', 'LNV03'),
('NV037', 'Đỗ Viết Nam', 223657895, 'Nam', '1993-04-20', 'Nhân viên', 'MARKETING', 'LNV06'),
('NV038', 'Phạm Xuân Thái', 274637892, 'Nam', '1994-05-29', 'Nhân viên', 'NGHIENCUU', 'LNV04'),
('NV039', 'Lê Thị Bích Trâm', 278463902, 'Nữ', '1993-03-24', 'Nhân viên', 'NGHIENCUU', 'LNV02'),
('NV040', 'Ngô Hoài Uyên Uyên', 227485647, 'Nữ', '1993-07-17', 'Nhân viên', 'NGHIENCUU', 'LNV03'),
('NV041', 'Mai Thị Trúc Tâm', 263745689, 'Nữ', '1995-03-22', 'Nhân viên', 'NGHIENCUU', 'LNV04'),
('NV042', 'Trần Thị Quế Chi', 235467341, 'Nữ', '1995-08-30', 'Nhân viên', 'QUANHE', 'LNV04'),
('NV043', 'Bùi Thị Xuân Hảo', 362784567, 'Nữ', '1993-04-05', 'Nhân viên', 'QUANHE', 'LNV02'),
('NV044', 'Cao Thái Lộc Hòa', 367487352, 'Nam', '1992-11-29', 'Nhân viên', 'QUANHE', 'LNV05'),
('NV045', 'Nguyễn Lê Thành Nhân', 264758947, 'Nam', '1992-01-01', 'Nhân viên', 'QUANHE', 'LNV06'),
('NV046', 'Nguyễn Hữu Xuân Trí', 546738964, 'Nam', '1993-12-31', 'Nhân viên', 'QUANLY', 'LNV03'),
('NV047', 'Trịnh Minh Quân', 164735268, 'Nam', '1994-10-31', 'Nhân viên', 'QUANLY', 'LNV02'),
('NV048', 'Trần Võ Anh Huy', 36478654, 'Nam', '1992-06-15', 'Nhân viên', 'NHANSU', 'LNV03'),
('NV049', 'Hồ Thị Thanh Huyền', 453672845, 'Nữ', '1992-09-01', 'Nhân viên', 'NHANSU', 'LNV06'),
('NV050', 'Phạm Thị Thanh Hiền', 225725375, 'Nữ', '1998-05-27', 'Quản lý', 'NHANSU', 'LQL05');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `phongban`
--

CREATE TABLE `phongban` (
  `ma_phong` varchar(10) NOT NULL,
  `ten_phong` varchar(100) NOT NULL,
  `ten_truong_phong` varchar(100) NOT NULL,
  `sdt_phong` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Đang đổ dữ liệu cho bảng `phongban`
--

INSERT INTO `phongban` (`ma_phong`, `ten_phong`, `ten_truong_phong`, `sdt_phong`) VALUES
('HANHCHINH', 'Phòng hành chính', 'Nguyễn Xuân Minh', 123456789),
('KETOAN', 'Phòng kế toán tài chính', 'Nguyễn Thảo Nhi', 112345678),
('KHINHDOANH', 'Phòng kinh doanh', 'Huỳnh Ngọc Phước', 123456789),
('KYTHUAT', 'Phòng kỹ thuật - công nghệ', 'Nguyễn Linh Lan', 123456789),
('MARKETING', 'Phòng marketing', 'Nguyễn Hải', 123456789),
('NGHIENCUU', 'Phòng nghiên cứu thị trường', 'Lại Văn Minh', 123456789),
('NHANSU', 'Phòng nhân sự', 'Lê Minh Khôi', 123456789),
('QUANHE', 'Phòng quan hệ quốc tế', 'Nguyễn Anh Thư', 123456789),
('QUANLY', 'Phòng quản lý', 'Võ Minh Thịnh', 123456789);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `ttnhanvien`
--

CREATE TABLE `ttnhanvien` (
  `id` int(11) NOT NULL,
  `ma_nv` varchar(10) NOT NULL,
  `noi_sinh` varchar(100) NOT NULL,
  `nguyen_quan` varchar(100) NOT NULL,
  `hk_thuong_tru` varchar(100) NOT NULL,
  `hk_tam_tru` varchar(100) NOT NULL,
  `sdt` int(11) NOT NULL,
  `ngay_vao_cty` date NOT NULL,
  `ton_giao` varchar(100) NOT NULL,
  `quoc_tich` varchar(100) NOT NULL,
  `ngoai_ngu` varchar(100) NOT NULL,
  `hoc_van` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Đang đổ dữ liệu cho bảng `ttnhanvien`
--

INSERT INTO `ttnhanvien` (`id`, `ma_nv`, `noi_sinh`, `nguyen_quan`, `hk_thuong_tru`, `hk_tam_tru`, `sdt`, `ngay_vao_cty`, `ton_giao`, `quoc_tich`, `ngoai_ngu`, `hoc_van`) VALUES
(1, 'NV001', 'Hà Nội', 'Hà Nội', 'Hà Nội', 'Khánh Hòa', 123456789, '2022-05-13', 'Không', 'Việt Nam', 'B1.2', 'Đại học'),
(2, 'NV002', 'Hà Nội', 'Hà Nội', 'Thanh Hóa', 'Khánh Hòa', 123456789, '2022-05-13', 'Không', 'Việt Nam', 'C1', 'Đại học'),
(3, 'NV003', 'Hồ Chí Minh', 'Hồ Chí Minh', 'Củ Chi', 'Khánh Hòa', 123456789, '2022-05-13', 'Không', 'Việt Nam', 'B1', 'Cao đẳng'),
(4, 'NV004', 'Bình Định', 'Quy Nhơn', 'Quy Nhơn', 'Khánh Hòa', 123456789, '2022-05-13', 'Không', 'Việt Nam', 'B2.2', 'Đại học'),
(5, 'NV005', 'Thanh Hóa', 'Hà Nội', 'Thanh Hóa', 'Khánh Hòa', 123456789, '2022-05-13', 'Không', 'Việt Nam', 'B1.1', 'Đại Học'),
(6, 'NV006', 'Hà Nội', 'Hà Nội', 'Hà Nội', 'Khánh Hòa', 123456789, '2022-05-13', 'Không', 'Việt Nam', 'B1.2', 'Đại học'),
(7, 'NV007', 'Cà Mau', 'Cà Mau', 'Cà Mau', 'Khánh Hòa', 123456789, '2022-05-13', 'Không', 'Việt Nam', 'A2.2', 'Cao đẳng'),
(8, 'NV008', 'Hà Nội', 'Hà Nội', 'Hà Nội', 'Quảng Nam', 987654321, '2022-05-14', 'Có', 'Việt Nam', 'B1', 'Đại học'),
(9, 'NV009', 'TP.HCM', 'TP.HCM', 'TP.HCM', 'Bình Định', 456123789, '2022-05-15', 'Không', 'Việt Nam', 'A2', 'Trung học'),
(10, 'NV010', 'Hải Phòng', 'Hải Phòng', 'Hải Phòng', 'Thanh Hóa', 369852147, '2022-05-16', 'Có', 'Việt Nam', 'A1', 'Trung học'),
(11, 'NV011', 'Đà Nẵng', 'Đà Nẵng', 'Đà Nẵng', 'Nghệ An', 147258369, '2022-05-17', 'Không', 'Việt Nam', 'B2', 'Đại học'),
(12, 'NV012', 'Cần Thơ', 'Cần Thơ', 'Cần Thơ', 'Hà Tĩnh', 258369147, '2022-05-18', 'Có', 'Việt Nam', 'C1', 'Cao đẳng'),
(13, 'NV013', 'Hải Dương', 'Hải Dương', 'Hải Dương', 'Quảng Bình', 369147258, '2022-05-19', 'Không', 'Việt Nam', 'A2.1', 'Trung học'),
(14, 'NV014', 'Hưng Yên', 'Hưng Yên', 'Hưng Yên', 'Quảng Trị', 147369258, '2022-05-20', 'Có', 'Việt Nam', 'B1.2', 'Đại học'),
(15, 'NV015', 'Thái Bình', 'Thái Bình', 'Thái Bình', 'Thừa Thiên Huế', 369147258, '2022-05-21', 'Không', 'Việt Nam', 'A2', 'Trung học'),
(16, 'NV016', 'Hà Nam', 'Hà Nam', 'Hà Nam', 'Kon Tum', 147369258, '2022-05-22', 'Có', 'Việt Nam', 'B1', 'Trung học'),
(17, 'NV017', 'Nam Định', 'Nam Định', 'Nam Định', 'Quảng Ngãi', 369258147, '2022-05-23', 'Không', 'Việt Nam', 'A2', 'Trung học'),
(18, 'NV018', 'Bắc Ninh', 'Bắc Ninh', 'Bắc Ninh', 'Bình Định', 258147369, '2022-05-24', 'Có', 'Việt Nam', 'C', 'Đại học'),
(19, 'NV019', 'Quảng Ninh', 'Quảng Ninh', 'Quảng Ninh', 'Phú Yên', 147258369, '2022-05-25', 'Không', 'Việt Nam', 'B2.1', 'Cao đẳng'),
(20, 'NV020', 'Thái Nguyên', 'Thái Nguyên', 'Thái Nguyên', 'Đắk Lắk', 369258147, '2022-05-26', 'Có', 'Việt Nam', 'A1', 'Trung học'),
(21, 'NV021', 'Vĩnh Phúc', 'Vĩnh Phúc', 'Vĩnh Phúc', 'Lâm Đồng', 258369147, '2022-05-27', 'Không', 'Việt Nam', 'A2.2', 'Trung học'),
(22, 'NV022', 'Bắc Giang', 'Bắc Giang', 'Bắc Giang', 'Ninh Thuận', 147369258, '2022-05-28', 'Có', 'Việt Nam', 'B1', 'Đại học'),
(23, 'NV023', 'Tuyên Quang', 'Tuyên Quang', 'Tuyên Quang', 'Gia Lai', 369147258, '2022-05-29', 'Không', 'Việt Nam', 'C', 'Cao đẳng'),
(24, 'NV024', 'Lào Cai', 'Lào Cai', 'Lào Cai', 'Bến Tre', 147369258, '2022-05-30', 'Có', 'Việt Nam', 'A2.1', 'Trung học'),
(25, 'NV025', 'Ninh Bình', 'Ninh Bình', 'Ninh Bình', 'Vĩnh Long', 369258147, '2022-05-31', 'Không', 'Việt Nam', 'B2', 'Trung học'),
(26, 'NV026', 'Lạng Sơn', 'Lạng Sơn', 'Lạng Sơn', 'Cà Mau', 258147369, '2022-06-01', 'Có', 'Việt Nam', 'A1', 'Đại học'),
(27, 'NV027', 'Bắc Kạn', 'Bắc Kạn', 'Bắc Kạn', 'Khánh Hòa', 147258369, '2022-06-02', 'Không', 'Việt Nam', 'A2', 'Cao đẳng'),
(28, 'NV028', 'Hà Giang', 'Hà Giang', 'Hà Giang', 'Long An', 369147258, '2022-06-03', 'Có', 'Việt Nam', 'B1.2', 'Trung học'),
(29, 'NV029', 'Yên Bái', 'Yên Bái', 'Yên Bái', 'Tiền Giang', 147369258, '2022-06-04', 'Không', 'Việt Nam', 'A2', 'Đại học'),
(30, 'NV030', 'Phú Thọ', 'Phú Thọ', 'Phú Thọ', 'An Giang', 369258147, '2022-06-05', 'Có', 'Việt Nam', 'C', 'Cao đẳng'),
(31, 'NV031', 'Hòa Bình', 'Hòa Bình', 'Hòa Bình', 'Bà Rịa - Vũng Tàu', 258147369, '2022-06-06', 'Không', 'Việt Nam', 'B2.1', 'Trung học'),
(32, 'NV032', 'Bạc Liêu', 'Bạc Liêu', 'Bạc Liêu', 'Bắc Giang', 147369258, '2022-06-07', 'Có', 'Việt Nam', 'A1', 'Đại học'),
(33, 'NV033', 'Bà Rịa - Vũng Tàu', 'Bà Rịa - Vũng Tàu', 'Bà Rịa - Vũng Tàu', 'Bến Tre', 369258147, '2022-06-08', 'Không', 'Việt Nam', 'B2', 'Cao đẳng'),
(34, 'NV034', 'Bắc Kạn', 'Bắc Kạn', 'Bắc Kạn', 'Bình Định', 258147369, '2022-06-09', 'Có', 'Việt Nam', 'C', 'Trung học'),
(35, 'NV035', 'Bắc Giang', 'Bắc Giang', 'Bắc Giang', 'Bình Dương', 147369258, '2022-06-10', 'Không', 'Việt Nam', 'A2', 'Đại học'),
(36, 'NV036', 'Bắc Ninh', 'Bắc Ninh', 'Bắc Ninh', 'Cà Mau', 369147258, '2022-06-11', 'Có', 'Việt Nam', 'A1', 'Cao đẳng'),
(37, 'NV037', 'Bến Tre', 'Bến Tre', 'Bến Tre', 'Cao Bằng', 147369258, '2022-06-12', 'Không', 'Việt Nam', 'B1', 'Trung học'),
(38, 'NV038', 'Bình Định', 'Bình Định', 'Bình Định', 'Đắk Lắk', 369258147, '2022-06-13', 'Có', 'Việt Nam', 'B2.1', 'Đại học'),
(39, 'NV039', 'Bình Dương', 'Bình Dương', 'Bình Dương', 'Đồng Nai', 258369147, '2022-06-14', 'Không', 'Việt Nam', 'C', 'Trung học'),
(40, 'NV040', 'Bình Phước', 'Bình Phước', 'Bình Phước', 'Gia Lai', 147369258, '2022-06-15', 'Có', 'Việt Nam', 'A2.1', 'Cao đẳng'),
(41, 'NV041', 'Cà Mau', 'Cà Mau', 'Cà Mau', 'Hà Giang', 369147258, '2022-06-16', 'Không', 'Việt Nam', 'B1.2', 'Đại học'),
(42, 'NV042', 'Cao Bằng', 'Cao Bằng', 'Cao Bằng', 'Hà Nam', 147369258, '2022-06-17', 'Có', 'Việt Nam', 'A2', 'Trung học'),
(43, 'NV043', 'Đắk Lắk', 'Đắk Lắk', 'Đắk Lắk', 'Hà Tĩnh', 369258147, '2022-06-18', 'Không', 'Việt Nam', 'C', 'Cao đẳng'),
(44, 'NV044', 'Đắk Nông', 'Đắk Nông', 'Đắk Nông', 'Hải Dương', 258147369, '2022-06-19', 'Có', 'Việt Nam', 'A1', 'Trung học'),
(45, 'NV045', 'Điện Biên', 'Điện Biên', 'Điện Biên', 'Hải Phòng', 147369258, '2022-06-20', 'Không', 'Việt Nam', 'A2.2', 'Đại học'),
(46, 'NV046', 'Đồng Nai', 'Đồng Nai', 'Đồng Nai', 'Hậu Giang', 369147258, '2022-06-21', 'Có', 'Việt Nam', 'B1', 'Trung học'),
(47, 'NV047', 'Đồng Tháp', 'Đồng Tháp', 'Đồng Tháp', 'Hòa Bình', 147369258, '2022-06-22', 'Không', 'Việt Nam', 'B2', 'Cao đẳng'),
(48, 'NV048', 'Gia Lai', 'Gia Lai', 'Gia Lai', 'Hưng Yên', 369258147, '2022-06-23', 'Có', 'Việt Nam', 'C', 'Đại học'),
(49, 'NV049', 'Hà Giang', 'Hà Giang', 'Hà Giang', 'Khánh Hòa', 258369147, '2022-06-24', 'Không', 'Việt Nam', 'A2', 'Trung học'),
(50, 'NV050', 'Hà Nam', 'Hà Nam', 'Hà Nam', 'Kiên Giang', 147369258, '2022-06-25', 'Có', 'Việt Nam', 'A1', 'Cao đẳng');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `users`
--

CREATE TABLE `users` (
  `id` int(11) NOT NULL,
  `user_name` varchar(100) NOT NULL,
  `pass_word` varchar(50) NOT NULL,
  `ho_ten` varchar(100) NOT NULL,
  `quyen` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Đang đổ dữ liệu cho bảng `users`
--

INSERT INTO `users` (`id`, `user_name`, `pass_word`, `ho_ten`, `quyen`) VALUES
(1, 'admin', '123456', 'Võ Đại Hiệp', 'Admin'),
(2, 'nhanvien', '123456', 'Nhân Viên', 'Nhân viên');

--
-- Chỉ mục cho các bảng đã đổ
--

--
-- Chỉ mục cho bảng `hopdong`
--
ALTER TABLE `hopdong`
  ADD PRIMARY KEY (`id`),
  ADD KEY `fk_hopdong_nhanvien` (`ma_nv`);

--
-- Chỉ mục cho bảng `luong`
--
ALTER TABLE `luong`
  ADD PRIMARY KEY (`ma_luong`);

--
-- Chỉ mục cho bảng `nhanvien`
--
ALTER TABLE `nhanvien`
  ADD PRIMARY KEY (`ma_nv`),
  ADD KEY `fk_nhanvien_luong` (`ma_luong`),
  ADD KEY `fk_nhanvien_phongban` (`ma_phong`);

--
-- Chỉ mục cho bảng `phongban`
--
ALTER TABLE `phongban`
  ADD PRIMARY KEY (`ma_phong`);

--
-- Chỉ mục cho bảng `ttnhanvien`
--
ALTER TABLE `ttnhanvien`
  ADD PRIMARY KEY (`id`),
  ADD KEY `fk_ttnhanvien_nhanvien` (`ma_nv`);

--
-- Chỉ mục cho bảng `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT cho các bảng đã đổ
--

--
-- AUTO_INCREMENT cho bảng `hopdong`
--
ALTER TABLE `hopdong`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=15;

--
-- AUTO_INCREMENT cho bảng `ttnhanvien`
--
ALTER TABLE `ttnhanvien`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=123456790;

--
-- AUTO_INCREMENT cho bảng `users`
--
ALTER TABLE `users`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- Các ràng buộc cho các bảng đã đổ
--

--
-- Các ràng buộc cho bảng `hopdong`
--
ALTER TABLE `hopdong`
  ADD CONSTRAINT `fk_hopdong_nhanvien` FOREIGN KEY (`ma_nv`) REFERENCES `nhanvien` (`ma_nv`);

--
-- Các ràng buộc cho bảng `nhanvien`
--
ALTER TABLE `nhanvien`
  ADD CONSTRAINT `fk_nhanvien_luong` FOREIGN KEY (`ma_luong`) REFERENCES `luong` (`ma_luong`),
  ADD CONSTRAINT `fk_nhanvien_phongban` FOREIGN KEY (`ma_phong`) REFERENCES `phongban` (`ma_phong`);

--
-- Các ràng buộc cho bảng `ttnhanvien`
--
ALTER TABLE `ttnhanvien`
  ADD CONSTRAINT `fk_ttnhanvien_nhanvien` FOREIGN KEY (`ma_nv`) REFERENCES `nhanvien` (`ma_nv`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
