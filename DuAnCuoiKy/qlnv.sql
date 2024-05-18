-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Máy chủ: 127.0.0.1
-- Thời gian đã tạo: Th5 18, 2024 lúc 04:04 PM
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
  `ma_nv` varchar(10) NOT NULL,
  `ngay_bat_dau` date NOT NULL,
  `ngya_ket_thuc` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Đang đổ dữ liệu cho bảng `hopdong`
--

INSERT INTO `hopdong` (`ma_nv`, `ngay_bat_dau`, `ngya_ket_thuc`) VALUES
('NV001', '2022-05-13', '2027-05-13'),
('NV002', '2022-05-13', '2027-05-13'),
('NV003', '2022-05-13', '2022-05-13'),
('NV003', '2022-05-13', '2027-05-13'),
('NV004', '2022-05-13', '2022-05-13'),
('NV005', '2022-05-13', '2027-05-13'),
('NV006', '2022-05-13', '2022-05-13'),
('NV006', '2022-05-13', '2027-05-13'),
('NV007', '2022-05-13', '2022-05-13'),
('NV007', '2022-05-13', '2027-05-13'),
('NV008', '2022-05-13', '2022-05-13'),
('NV009', '2022-05-13', '2027-05-13'),
('NV010', '2022-05-13', '2022-05-13'),
('NV011', '2022-05-13', '2022-05-13');

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
('NV001', 'Nguyễn Bình An', 123456789, 'Nam', '1993-05-13', 'Nhân viên', 'HANHCHINH', 'LNV01'),
('NV002', 'Phạm Minh An', 123456788, 'Nam', '1993-06-15', 'Nhân viên', 'HANHCHINH', 'LNV02'),
('NV003', 'Phan Mạnh Huy', 123456787, 'Nam', '1994-02-10', 'Nhân viên', 'HANHCHINH', 'LNV03'),
('NV004', 'Phan Ngọc Ánh', 123456786, 'Nữ', '1994-10-05', 'Quản lý', 'HANHCHINH', 'LQL04'),
('NV005', 'Nguyễn Ngọc Minh Huy', 123456785, 'Nam', '1993-05-19', 'Nhân viên', 'KYTHUAT', 'LNV06'),
('NV006', 'Nguyễn Kim Lộc', 123456784, 'Nữ', '1994-12-24', 'Nhân viên', 'KETOAN', 'LNV05'),
('NV007', 'Phạm Ngọc Bảo Loan', 123456783, 'Nữ', '1992-11-02', 'Quản lý', 'KETOAN', 'LQL05'),
('NV008', 'Nguyễn Kim Lân', 123456782, 'Nam', '1994-01-03', 'Nhân viên', 'KHINHDOANH', 'LNV03'),
('NV009', 'Phan Ngọc Mai', 123456781, 'Nữ', '1995-05-18', 'Nhân viên', 'KHINHDOANH', 'LNV01'),
('NV010', 'Nguyễn Bảo Hùng', 123456780, 'Nam', '1992-07-23', 'Quản lý', 'KHINHDOANH', 'LQL02'),
('NV011', 'Nguyễn Minh Kiên', 123456779, 'Nam', '1993-02-27', 'Nhân viên', 'KYTHUAT', 'LNV05');

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

INSERT INTO `ttnhanvien` (`ma_nv`, `noi_sinh`, `nguyen_quan`, `hk_thuong_tru`, `hk_tam_tru`, `sdt`, `ngay_vao_cty`, `ton_giao`, `quoc_tich`, `ngoai_ngu`, `hoc_van`) VALUES
('NV001', 'Hà Nội', 'Hà Nội', 'Hà Nội', 'Khánh Hòa', 123456789, '2022-05-13', 'Không', 'Việt Nam', 'B1.2', 'Đại học'),
('NV002', 'Hà Nội', 'Hà Nội', 'Thanh Hóa', 'Khánh Hòa', 123456789, '2022-05-13', 'Không', 'Việt Nam', 'C1', 'Đại học'),
('NV003', 'Hồ Chí Minh', 'Hồ Chí Minh', 'Củ Chi', 'Khánh Hòa', 123456789, '2022-05-13', 'Không', 'Việt Nam', 'B1', 'Cao đẳng'),
('NV003', 'Bình Định', 'Quy Nhơn', 'Quy Nhơn', 'Khánh Hòa', 123456789, '2022-05-13', 'Không', 'Việt Nam', 'B2.2', 'Đại học');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `users`
--

CREATE TABLE `users` (
  `id` int(11) NOT NULL,
  `user` varchar(100) NOT NULL,
  `pass` varchar(50) NOT NULL,
  `ho_ten` varchar(100) NOT NULL,
  `quyen` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Đang đổ dữ liệu cho bảng `users`
--

INSERT INTO `users` (`id`, `user`, `pass`, `ho_ten`, `quyen`) VALUES
(1, '', '123456', 'Võ Đại Hiệp', '1'),
(2, '', '123456', 'Người Dùng', '2');

--
-- Chỉ mục cho các bảng đã đổ
--

--
-- Chỉ mục cho bảng `hopdong`
--
ALTER TABLE `hopdong`
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
