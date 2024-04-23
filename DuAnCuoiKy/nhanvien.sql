-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Máy chủ: 127.0.0.1
-- Thời gian đã tạo: Th4 23, 2024 lúc 10:01 AM
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
-- Cấu trúc bảng cho bảng `nhanvien`
--

CREATE TABLE `nhanvien` (
  `MaNV` varchar(10) NOT NULL,
  `HoNV` varchar(100) NOT NULL,
  `TenNV` varchar(100) NOT NULL,
  `GioiTinh` varchar(10) NOT NULL,
  `NgaySinh` date NOT NULL,
  `DiaChi` varchar(255) NOT NULL,
  `ChucVu` varchar(100) NOT NULL,
  `TrinhDo` varchar(100) NOT NULL,
  `MaHSL` varchar(10) NOT NULL,
  `MaPhuCap` varchar(10) NOT NULL,
  `MaThuong` varchar(10) NOT NULL,
  `MaPhong` varchar(10) NOT NULL,
  `BHXH` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Đang đổ dữ liệu cho bảng `nhanvien`
--

INSERT INTO `nhanvien` (`MaNV`, `HoNV`, `TenNV`, `GioiTinh`, `NgaySinh`, `DiaChi`, `ChucVu`, `TrinhDo`, `MaHSL`, `MaPhuCap`, `MaThuong`, `MaPhong`, `BHXH`) VALUES
('NV001', 'Nguyễn Ngọc', 'Nam', 'Nam', '1999-04-03', '49 NGÔ GIA TỰ, TP.NHA TRANG, KHÁNH HÒA', 'Nhân viên', 'Cao Đẳng', 'A32BAC1', 'NGOAIGIO', 'HOANTHANH', 'HANHCHINH', '250000'),
('NV002', 'Võ Ngọc', 'Mai', 'Nữ', '1998-12-03', 'Vĩnh Nguyên, Nha Trang, Khánh Hòa', 'Nhân viên', 'Đại học', 'A31BAC6', 'NGOAIGIO', 'HOANTHANH', 'KETOAN', '250000'),
('NV003', 'Nguyễn Lê Ngọc', 'Hằng', 'Nữ', '1999-01-01', '438 Ngô Đến, Ngọc Hiệp, Nha Trang, Khánh Hòa', 'Nhân viên', 'Cao đẳng', 'A32BAC3', 'NGOAIGIO', 'XUATSAC', 'HANHCHINH', '250000');

--
-- Chỉ mục cho các bảng đã đổ
--

--
-- Chỉ mục cho bảng `nhanvien`
--
ALTER TABLE `nhanvien`
  ADD PRIMARY KEY (`MaNV`),
  ADD KEY `fk_nhanvien_hsl` (`MaHSL`),
  ADD KEY `fk_nhanvien_phucap` (`MaPhuCap`),
  ADD KEY `fk_nhanvien_thuong` (`MaThuong`),
  ADD KEY `fk_nhanvien_phongban` (`MaPhong`);

--
-- Các ràng buộc cho các bảng đã đổ
--

--
-- Các ràng buộc cho bảng `nhanvien`
--
ALTER TABLE `nhanvien`
  ADD CONSTRAINT `fk_nhanvien_hsl` FOREIGN KEY (`MaHSL`) REFERENCES `hsl` (`MaHSL`),
  ADD CONSTRAINT `fk_nhanvien_phongban` FOREIGN KEY (`MaPhong`) REFERENCES `phongban` (`MaPhong`),
  ADD CONSTRAINT `fk_nhanvien_phucap` FOREIGN KEY (`MaPhuCap`) REFERENCES `phucap` (`MaPhuCap`),
  ADD CONSTRAINT `fk_nhanvien_thuong` FOREIGN KEY (`MaThuong`) REFERENCES `thuong` (`MaThuong`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
