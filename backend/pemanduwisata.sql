-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Waktu pembuatan: 14 Nov 2023 pada 17.45
-- Versi server: 10.4.21-MariaDB
-- Versi PHP: 8.1.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `pemanduwisata`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `Hotels`
--

CREATE TABLE `Hotels` (
  `id` int(11) NOT NULL,
  `date` datetime DEFAULT NULL,
  `kode_provinsi` int(10) DEFAULT NULL,
  `nama_provinsi` varchar(100) DEFAULT NULL,
  `bps_kode_kabupaten_kota` int(10) DEFAULT NULL,
  `bps_nama_kabupaten_kota` varchar(100) DEFAULT NULL,
  `nama_hotel` varchar(100) DEFAULT NULL,
  `banyak_kamar` int(5) DEFAULT NULL,
  `hotel_berbintang` tinyint(1) DEFAULT NULL,
  `ket` text DEFAULT NULL,
  `tahun` int(5) DEFAULT NULL,
  `createdAt` datetime NOT NULL,
  `updatedAt` datetime NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `Hotels`
--

INSERT INTO `Hotels` (`id`, `date`, `kode_provinsi`, `nama_provinsi`, `bps_kode_kabupaten_kota`, `bps_nama_kabupaten_kota`, `nama_hotel`, `banyak_kamar`, `hotel_berbintang`, `ket`, `tahun`, `createdAt`, `updatedAt`) VALUES
(1, '2023-11-14 16:15:53', 32, 'JAWA BARAT', 3214, 'KABUPATEN PURWAKARTA', 'HOTEL ALAM SARI WATES', 10, 1, NULL, 2019, '2023-11-14 16:15:53', '2023-11-14 16:15:53'),
(2, '2023-11-14 16:15:53', 32, 'JAWA BARAT', 3214, 'KABUPATEN PURWAKARTA', 'HOTEL ABAH', 20, 1, NULL, 2019, '2023-11-14 16:15:53', '2023-11-14 16:15:53'),
(3, '2023-11-14 16:15:53', 32, 'JAWA BARAT', 3214, 'KABUPATEN PURWAKARTA', 'HOTEL CIWANGI', 16, 1, NULL, 2019, '2023-11-14 16:15:53', '2023-11-14 16:15:53'),
(4, '2023-11-14 16:15:53', 32, 'JAWA BARAT', 3214, 'KABUPATEN PURWAKARTA', 'HOTEL CIBATU', 16, 1, NULL, 2019, '2023-11-14 16:15:53', '2023-11-14 16:15:53'),
(5, '2023-11-14 16:15:53', 32, 'JAWA BARAT', 3214, 'KABUPATEN PURWAKARTA', 'HOTEL HARRISON', 18, 1, NULL, 2019, '2023-11-14 16:15:53', '2023-11-14 16:15:53'),
(6, '2023-11-14 16:15:53', 32, 'JAWA BARAT', 3214, 'KABUPATEN PURWAKARTA', 'HOTEL FURI AYU', 50, 1, NULL, 2019, '2023-11-14 16:15:53', '2023-11-14 16:15:53'),
(7, '2023-11-14 16:15:53', 32, 'JAWA BARAT', 3214, 'KABUPATEN PURWAKARTA', 'HOTEL GRAND CIWARENG INN', 31, 1, NULL, 2019, '2023-11-14 16:15:53', '2023-11-14 16:15:53'),
(8, '2023-11-14 16:15:53', 32, 'JAWA BARAT', 3214, 'KABUPATEN PURWAKARTA', 'HOTEL GRAND SITU BULEUD', 36, 1, NULL, 2019, '2023-11-14 16:15:53', '2023-11-14 16:15:53'),
(9, '2023-11-14 16:15:53', 32, 'JAWA BARAT', 3214, 'KABUPATEN PURWAKARTA', 'HOTEL INTAN', 49, 1, NULL, 2019, '2023-11-14 16:15:53', '2023-11-14 16:15:53'),
(10, '2023-11-14 16:15:53', 32, 'JAWA BARAT', 3214, 'KABUPATEN PURWAKARTA', 'HOTEL KALEOSAN', 5, 1, NULL, 2019, '2023-11-14 16:15:53', '2023-11-14 16:15:53'),
(11, '2023-11-14 16:15:53', 32, 'JAWA BARAT', 3214, 'KABUPATEN PURWAKARTA', 'HOTEL KHALISTA', 16, 1, NULL, 2019, '2023-11-14 16:15:53', '2023-11-14 16:15:53'),
(12, '2023-11-14 16:15:53', 32, 'JAWA BARAT', 3214, 'KABUPATEN PURWAKARTA', 'HOTEL KHALSA INDAH', 30, 1, NULL, 2019, '2023-11-14 16:15:53', '2023-11-14 16:15:53'),
(13, '2023-11-14 16:15:53', 32, 'JAWA BARAT', 3214, 'KABUPATEN PURWAKARTA', 'HOTEL KUSUMA', 12, 1, NULL, 2019, '2023-11-14 16:15:53', '2023-11-14 16:15:53'),
(14, '2023-11-14 16:15:53', 32, 'JAWA BARAT', 3214, 'KABUPATEN PURWAKARTA', 'HOTEL LA DERA', 24, 1, NULL, 2019, '2023-11-14 16:15:53', '2023-11-14 16:15:53'),
(15, '2023-11-14 16:15:53', 32, 'JAWA BARAT', 3214, 'KABUPATEN PURWAKARTA', 'HOTEL MEGASARI', 14, 1, NULL, 2019, '2023-11-14 16:15:53', '2023-11-14 16:15:53'),
(16, '2023-11-14 16:15:53', 32, 'JAWA BARAT', 3214, 'KABUPATEN PURWAKARTA', 'HOTEL PASANGGRAHAN JATILUHUR', 111, 0, NULL, 2019, '2023-11-14 16:15:53', '2023-11-14 16:15:53'),
(17, '2023-11-14 16:15:53', 32, 'JAWA BARAT', 3214, 'KABUPATEN PURWAKARTA', 'HOTEL PERMATA', 30, 1, NULL, 2019, '2023-11-14 16:15:53', '2023-11-14 16:15:53'),
(18, '2023-11-14 16:15:53', 32, 'JAWA BARAT', 3214, 'KABUPATEN PURWAKARTA', 'HOTEL PLAZA BUKIT INDAH', 172, 0, NULL, 2019, '2023-11-14 16:15:53', '2023-11-14 16:15:53'),
(19, '2023-11-14 16:15:53', 32, 'JAWA BARAT', 3214, 'KABUPATEN PURWAKARTA', 'HOTEL PONDOK VETERAN', 30, 1, NULL, 2019, '2023-11-14 16:15:53', '2023-11-14 16:15:53'),
(20, '2023-11-14 16:15:53', 32, 'JAWA BARAT', 3214, 'KABUPATEN PURWAKARTA', 'HOTEL PRIANGAN', 24, 1, NULL, 2019, '2023-11-14 16:15:53', '2023-11-14 16:15:53'),
(21, '2023-11-14 16:15:53', 32, 'JAWA BARAT', 3214, 'KABUPATEN PURWAKARTA', 'HOTEL SALYDO', 15, 1, NULL, 2019, '2023-11-14 16:15:53', '2023-11-14 16:15:53'),
(22, '2023-11-14 16:15:53', 32, 'JAWA BARAT', 3214, 'KABUPATEN PURWAKARTA', 'HOTEL SEDERHANA', 7, 1, NULL, 2019, '2023-11-14 16:15:53', '2023-11-14 16:15:53'),
(23, '2023-11-14 16:15:53', 32, 'JAWA BARAT', 3214, 'KABUPATEN PURWAKARTA', 'HOTEL SENJA', 30, 1, NULL, 2019, '2023-11-14 16:15:53', '2023-11-14 16:15:53'),
(24, '2023-11-14 16:15:53', 32, 'JAWA BARAT', 3214, 'KABUPATEN PURWAKARTA', 'HOTEL VILLA PANORAMA INDAH', 25, 1, NULL, 2019, '2023-11-14 16:15:53', '2023-11-14 16:15:53'),
(25, '2023-11-14 16:15:53', 32, 'JAWA BARAT', 3214, 'KABUPATEN PURWAKARTA', 'HOTEL WISMA AYU', 50, 1, NULL, 2019, '2023-11-14 16:15:53', '2023-11-14 16:15:53'),
(26, '2023-11-14 16:15:53', 32, 'JAWA BARAT', 3214, 'KABUPATEN PURWAKARTA', 'HOTEL HARRVER', 126, 0, NULL, 2019, '2023-11-14 16:15:53', '2023-11-14 16:15:53'),
(27, '2023-11-14 16:15:53', 32, 'JAWA BARAT', 3214, 'KABUPATEN PURWAKARTA', 'HOLISTIK KAMPUNG ORGANIK GUEST HOUSE', 6, 1, NULL, 2019, '2023-11-14 16:15:53', '2023-11-14 16:15:53'),
(28, '2023-11-14 16:15:53', 32, 'JAWA BARAT', 3214, 'KABUPATEN PURWAKARTA', 'HOTEL PITALOKA', 15, 1, NULL, 2019, '2023-11-14 16:15:53', '2023-11-14 16:15:53'),
(29, '2023-11-14 16:15:53', 32, 'JAWA BARAT', 3214, 'KABUPATEN PURWAKARTA', 'PONDOKSALAM GUEST HOUSE', 6, 1, NULL, 2019, '2023-11-14 16:15:53', '2023-11-14 16:15:53'),
(30, '2023-11-14 16:15:53', 32, 'JAWA BARAT', 3214, 'KABUPATEN PURWAKARTA', 'GIRI TIRTA KAHURIPAN', 10, 1, NULL, 2019, '2023-11-14 16:15:53', '2023-11-14 16:15:53'),
(31, '2023-11-14 16:15:53', 32, 'JAWA BARAT', 3214, 'KABUPATEN PURWAKARTA', 'HOTEL GRAND PERMATA', 36, 1, NULL, 2019, '2023-11-14 16:15:53', '2023-11-14 16:15:53'),
(32, '2023-11-14 16:15:53', 32, 'JAWA BARAT', 3214, 'KABUPATEN PURWAKARTA', 'HOTEL MP', 15, 1, NULL, 2019, '2023-11-14 16:15:53', '2023-11-14 16:15:53'),
(33, '2023-11-14 16:15:53', 32, 'JAWA BARAT', 3214, 'KABUPATEN PURWAKARTA', 'START HOTEL', 21, 1, NULL, 2019, '2023-11-14 16:15:53', '2023-11-14 16:15:53'),
(34, '2023-11-14 16:15:53', 32, 'JAWA BARAT', 3214, 'KABUPATEN PURWAKARTA', 'VILLA HIDDEN VALLEY HILLS', 21, 1, NULL, 2019, '2023-11-14 16:15:53', '2023-11-14 16:15:53');

-- --------------------------------------------------------

--
-- Struktur dari tabel `Wisata`
--

CREATE TABLE `Wisata` (
  `id` int(11) NOT NULL,
  `date` datetime DEFAULT NULL,
  `kode_provinsi` int(10) DEFAULT NULL,
  `nama_provinsi` varchar(100) DEFAULT NULL,
  `bps_kode_kabupaten_kota` int(10) DEFAULT NULL,
  `bps_nama_kabupaten_kota` varchar(100) DEFAULT NULL,
  `alam` varchar(100) DEFAULT NULL,
  `budaya` varchar(100) DEFAULT NULL,
  `buatan` varchar(100) DEFAULT NULL,
  `tahun` int(5) DEFAULT NULL,
  `createdAt` datetime NOT NULL,
  `updatedAt` datetime NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `Wisata`
--

INSERT INTO `Wisata` (`id`, `date`, `kode_provinsi`, `nama_provinsi`, `bps_kode_kabupaten_kota`, `bps_nama_kabupaten_kota`, `alam`, `budaya`, `buatan`, `tahun`, `createdAt`, `updatedAt`) VALUES
(1, '2023-11-14 16:18:19', 32, 'JAWA BARAT', 3214, 'KABUPATEN PURWAKARTA', 'SITU WANAYASA', 'GALERI WAYANG', 'TAMAN SURAWISESA', 2022, '2023-11-14 16:18:19', '2023-11-14 16:18:19'),
(2, '2023-11-14 16:18:19', 32, 'JAWA BARAT', 3214, 'KABUPATEN PURWAKARTA', 'NARBO FOREST', 'DIORAMA BALE INDUNG RAHAYU', 'TAMAN AIR MANCUR SRI BADUGA', 2022, '2023-11-14 16:18:19', '2023-11-14 16:18:19'),
(3, '2023-11-14 16:18:19', 32, 'JAWA BARAT', 3214, 'KABUPATEN PURWAKARTA', 'CURUG CIPURUT', 'DIORAMA PANYAWANGAN PURWAKARTA', 'TAMAN MAYA DATAR', 2022, '2023-11-14 16:18:19', '2023-11-14 16:18:19'),
(4, '2023-11-14 16:18:19', 32, 'JAWA BARAT', 3214, 'KABUPATEN PURWAKARTA', 'RIVER TUBING / NGAPARK RIVER', 'DIORAMA NUSANTARA', 'TAMAN PANCA WARNA', 2022, '2023-11-14 16:18:19', '2023-11-14 16:18:19'),
(5, '2023-11-14 16:18:19', 32, 'JAWA BARAT', 3214, 'KABUPATEN PURWAKARTA', 'PASIR LANGLANG PANYAWANGAN', 'MAKAM EYANG GANDASOLI', 'GREEN VALLEY WATER PARK', 2022, '2023-11-14 16:18:19', '2023-11-14 16:18:19'),
(6, '2023-11-14 16:18:19', 32, 'JAWA BARAT', 3214, 'KABUPATEN PURWAKARTA', 'GOA JEPANG', 'MAKAM SYEH BAING YUSUF', 'TAMAN PARCOM', 2022, '2023-11-14 16:18:19', '2023-11-14 16:18:19'),
(7, '2023-11-14 16:18:19', 32, 'JAWA BARAT', 3214, 'KABUPATEN PURWAKARTA', 'SAGE RIVER TUBING', 'WISATA PEDESAAN LEMBUR KAHURIPAN', 'TAMAN PANCANITI', 2022, '2023-11-14 16:18:19', '2023-11-14 16:18:19'),
(8, '2023-11-14 16:18:19', 32, 'JAWA BARAT', 3214, 'KABUPATEN PURWAKARTA', 'LEUWI CIDOMAS', '', 'KOLAM RENANG CISABUK', 2022, '2023-11-14 16:18:19', '2023-11-14 16:18:19'),
(9, '2023-11-14 16:18:19', 32, 'JAWA BARAT', 3214, 'KABUPATEN PURWAKARTA', 'BUKIT PANENJOAN', 'MAKAM EYANG PANDITA', 'TAMAN PASANGGRAHAN PADJAJARAN', 2022, '2023-11-14 16:18:19', '2023-11-14 16:18:19'),
(10, '2023-11-14 16:18:19', 32, 'JAWA BARAT', 3214, 'KABUPATEN PURWAKARTA', 'CURUG PAMOYANAN', '', 'KOLAM RENANG TAJUR INDAH', 2022, '2023-11-14 16:18:19', '2023-11-14 16:18:19'),
(11, '2023-11-14 16:18:19', 32, 'JAWA BARAT', 3214, 'KABUPATEN PURWAKARTA', 'BADEGA GUNUNG PARANG', '', 'GRAMA TIRTA JATILUHUR', 2022, '2023-11-14 16:18:19', '2023-11-14 16:18:19'),
(12, '2023-11-14 16:18:19', 32, 'JAWA BARAT', 3214, 'KABUPATEN PURWAKARTA', 'SASAK PANYAWANGAN', '', 'CIKAO PARK', 2022, '2023-11-14 16:18:19', '2023-11-14 16:18:19'),
(13, '2023-11-14 16:18:19', 32, 'JAWA BARAT', 3214, 'KABUPATEN PURWAKARTA', 'SKAYLODGE PADJAJARAN ANYAR', '', 'GIRI TIRTA KAHURIPAN', 2022, '2023-11-14 16:18:19', '2023-11-14 16:18:19'),
(14, '2023-11-14 16:18:19', 32, 'JAWA BARAT', 3214, 'KABUPATEN PURWAKARTA', 'CURUG CIMATA INDUNG', '', 'TIRTA KAHURIPAN WANAYASA', 2022, '2023-11-14 16:18:19', '2023-11-14 16:18:19'),
(15, '2023-11-14 16:18:19', 32, 'JAWA BARAT', 3214, 'KABUPATEN PURWAKARTA', 'PARANG GOMBONG', '', 'BATUN APUNG ALAM HIJAU', 2022, '2023-11-14 16:18:19', '2023-11-14 16:18:19'),
(16, '2023-11-14 16:18:19', 32, 'JAWA BARAT', 3214, 'KABUPATEN PURWAKARTA', 'GUNUNG BONGKOK', '', 'KOLAM RENANG CILOA', 2022, '2023-11-14 16:18:19', '2023-11-14 16:18:19'),
(17, '2023-11-14 16:18:19', 32, 'JAWA BARAT', 3214, 'KABUPATEN PURWAKARTA', 'SKYWALKER VIA PERATA', '', 'KOLAM RENANG CEK TSE LONG', 2022, '2023-11-14 16:18:19', '2023-11-14 16:18:19'),
(18, '2023-11-14 16:18:19', 32, 'JAWA BARAT', 3214, 'KABUPATEN PURWAKARTA', 'CURUG TILU', '', 'KOLAM RENANG JAYA TIRTA ABADI', 2022, '2023-11-14 16:18:19', '2023-11-14 16:18:19'),
(19, '2023-11-14 16:18:19', 32, 'JAWA BARAT', 3214, 'KABUPATEN PURWAKARTA', 'GUNUNG LEMBU', '', 'KOLAM RENANG CIHANJAWAR', 2022, '2023-11-14 16:18:19', '2023-11-14 16:18:19'),
(20, '2023-11-14 16:18:19', 32, 'JAWA BARAT', 3214, 'KABUPATEN PURWAKARTA', 'GUNUNG CUPU', '', 'TAMAN BATU PURWAKARTA', 2022, '2023-11-14 16:18:19', '2023-11-14 16:18:19'),
(21, '2023-11-14 16:18:19', 32, 'JAWA BARAT', 3214, 'KABUPATEN PURWAKARTA', 'LENKOB PARANGBONG', '', 'SAUNG MANGLID', 2022, '2023-11-14 16:18:19', '2023-11-14 16:18:19'),
(22, '2023-11-14 16:18:19', 32, 'JAWA BARAT', 3214, 'KABUPATEN PURWAKARTA', '', '', 'WORKSHOF LITBANG KERAMIK', 2022, '2023-11-14 16:18:19', '2023-11-14 16:18:19'),
(23, '2023-11-14 16:18:19', 32, 'JAWA BARAT', 3214, 'KABUPATEN PURWAKARTA', '', '', 'KUYA MARANGGI WATAR PARK', 2022, '2023-11-14 16:18:19', '2023-11-14 16:18:19'),
(24, '2023-11-14 16:18:19', 32, 'JAWA BARAT', 3214, 'KABUPATEN PURWAKARTA', '', '', 'KAMPUNG SADANG', 2022, '2023-11-14 16:18:19', '2023-11-14 16:18:19'),
(25, '2023-11-14 16:18:19', 32, 'JAWA BARAT', 3214, 'KABUPATEN PURWAKARTA', '', '', 'HIDDEN VALLEY HILL', 2022, '2023-11-14 16:18:19', '2023-11-14 16:18:19'),
(26, '2023-11-14 16:18:19', 32, 'JAWA BARAT', 3214, 'KABUPATEN PURWAKARTA', '', '', 'KOLAM RENANG PUSAKA WATER PARK', 2022, '2023-11-14 16:18:19', '2023-11-14 16:18:19'),
(27, '2023-11-14 16:18:19', 32, 'JAWA BARAT', 3214, 'KABUPATEN PURWAKARTA', '', '', 'KOLAM RENANG KIRARA BLUE LAND', 2022, '2023-11-14 16:18:19', '2023-11-14 16:18:19'),
(28, '2023-11-14 16:18:19', 32, 'JAWA BARAT', 3214, 'KABUPATEN PURWAKARTA', '', '', 'KOLAM RENANG BABAKAN JATI', 2022, '2023-11-14 16:18:19', '2023-11-14 16:18:19'),
(29, '2023-11-14 16:18:19', 32, 'JAWA BARAT', 3214, 'KABUPATEN PURWAKARTA', '', '', 'PANARAWANGAN BUKIT CINTA', 2022, '2023-11-14 16:18:19', '2023-11-14 16:18:19'),
(30, '2023-11-14 16:18:19', 32, 'JAWA BARAT', 3214, 'KABUPATEN PURWAKARTA', '', '', 'KAMPUNG KAHURIPAN', 2022, '2023-11-14 16:18:19', '2023-11-14 16:18:19'),
(31, '2023-11-14 16:18:19', 32, 'JAWA BARAT', 3214, 'KABUPATEN PURWAKARTA', '', '', 'TAJUG GEDE', 2022, '2023-11-14 16:18:19', '2023-11-14 16:18:19'),
(32, '2023-11-14 16:18:19', 32, 'JAWA BARAT', 3214, 'KABUPATEN PURWAKARTA', '', '', 'ADVENTURE POINT ALAM SARI WATES', 2022, '2023-11-14 16:18:19', '2023-11-14 16:18:19'),
(33, '2023-11-14 16:18:19', 32, 'JAWA BARAT', 3214, 'KABUPATEN PURWAKARTA', '', '', 'ANUGRAH WATER PARK BUNDER', 2022, '2023-11-14 16:18:19', '2023-11-14 16:18:19'),
(34, '2023-11-14 16:18:19', 32, 'JAWA BARAT', 3214, 'KABUPATEN PURWAKARTA', '', '', 'KAMPUNG MONYET', 2022, '2023-11-14 16:18:19', '2023-11-14 16:18:19');

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `Hotels`
--
ALTER TABLE `Hotels`
  ADD PRIMARY KEY (`id`);

--
-- Indeks untuk tabel `Wisata`
--
ALTER TABLE `Wisata`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT untuk tabel yang dibuang
--

--
-- AUTO_INCREMENT untuk tabel `Hotels`
--
ALTER TABLE `Hotels`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=35;

--
-- AUTO_INCREMENT untuk tabel `Wisata`
--
ALTER TABLE `Wisata`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=35;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;