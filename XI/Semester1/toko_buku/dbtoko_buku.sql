-- phpMyAdmin SQL Dump
-- version 5.1.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 07 Nov 2021 pada 02.30
-- Versi server: 10.4.18-MariaDB
-- Versi PHP: 8.0.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `dbtoko_buku`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `buku`
--

CREATE TABLE `buku` (
  `id_buku` varchar(50) NOT NULL,
  `judul_buku` varchar(200) NOT NULL,
  `id_pengarang` varchar(20) NOT NULL,
  `id_penerbit` varchar(20) NOT NULL,
  `id_kategori` varchar(20) NOT NULL,
  `stok` int(11) NOT NULL,
  `berat` float NOT NULL,
  `harga` int(11) NOT NULL,
  `deskripsi` varchar(1000) NOT NULL,
  `gambar` varchar(200) NOT NULL,
  `deleted` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `buku`
--

INSERT INTO `buku` (`id_buku`, `judul_buku`, `id_pengarang`, `id_penerbit`, `id_kategori`, `stok`, `berat`, `harga`, `deskripsi`, `gambar`, `deleted`) VALUES
('BU-1', 'Panca-1', 'PG-5', 'PN-5', 'K-5', 4, 5, 55000, 'Ini adalah Deskripsi Buku Panca-1', 'WhatsApp Image 2020-06-25 at 1123AM.jpeg', 0),
('BU-10', 'Bocil Nyawang', 'PG-3', 'PN-2', 'K-1', 99, 37, 9999999, 'Ini adalah Deskripsi', 'anak1.png', 0),
('BU-11', 'Blood Lad Vol.3', 'PG-4', 'PN-3', 'K-2', 16, 3, 99500, 'Blood Lad Desc', 'manga1.jpg', 0),
('BU-12', 'Sayonara Zetsubou Sensei Vol.19', 'PG-4', 'PN-3', 'K-2', 9, 2, 79500, 'Zetsubou Sensei Desc', 'manga2.jpg', 0),
('BU-13', 'Bocil unjuk Tangan', 'PG-3', 'PN-2', 'K-1', 3, 29, 999995, 'Deskripsi Buku Bocil Unjuk Tangan', '79752.jpg', 0),
('BU-14', 'Bocil Liat Kamera', 'PG-3', 'PN-2', 'K-1', 1, 51, 55555, 'Lihatlah Tatapan Polosnya', 'Anak3.PNG', 0),
('BU-2', 'Panca-2', 'PG-5', 'PN-5', 'K-5', 5, 5, 55500, 'Ini adalah deskripsi buku Panca-2', 'Inkedadawdwd_LI.jpg', 0),
('BU-3', 'Panca-3', 'PG-5', 'PN-5', 'K-5', 5, 5, 55550, 'Ini adalah Deskripsi buku Panca-3', 'KTPSquare.jpg', 0),
('BU-4', 'Program Paket Aplikasi 1', 'PG-2', 'PN-1', 'K-3', 2, 2, 65500, 'Buku ini ditulis untuk membantu pembaca dalam mengaplikasikan software perkantoran untuk membantu pekerjaan kantor dan membuat laporan dengan baik, rapi dan benar. Penulis yakin setelah mempelajari buku ini pembaca mampu memanejemen data (file) dalam komputer dengan baik, mampu menggunakan Microsoft Word dengan baik dan benar, mampu membuat surat dengan baik, mampu membuat laporan naratif maupun grafik dengan baik dan benar, mampu membuat surat masal, baik dalam bentuk dokumen maupun label, mampu membuat proposal dengan rapi, mampu membuat laporan dengan Microsoft Excel dengan baik, mampu mengolah data angka dengan rapi dan baik, mampu membuat laporan dengan pivot tabel, mampu mencari informasi dengan menggunakan fasilitas Internet, dan juga mampu mencari jurnal di Internet. Buku Program Aplikasi 1 ini juga dilengkapi dengan berbagai contoh-contoh soal latihan yang akan membantu pembaca untuk berlatih.', 'coding3.jpg', 0),
('BU-5', 'Database dengan Visual Foxpro', 'PG-2', 'PN-1', 'K-3', 5, 2, 60500, 'Buku ini menjelaskan tentang dasar pemrograman dengan penjelasan yang sederhana sehingga mahasiswa dapat dengan mudah pula untuk memahami dan mempelajari pengenalan pemrograman ini. Diharapkan buku ini dapat menunjang mahasiswa untuk mencapai standar kompetensi yang telah ditentukan. Dalam buku ini dibahas mengenai pengenalan visual foxpro, tabel deigner, form designer, report designer dan project designer. Untuk memudahkan pemahaman dan aplikasinya, maka dalam buku ini dilengkapi dengan studi kasus sehingga mahasiswa memiliki ketrampilan operasional dalam penerapannya di lapangan.', 'coding2.jpg', 0),
('BU-6', 'Modifikasi Prilaku', 'PG-1', 'PN-1', 'K-4', 6, 3, 135000, 'Fokus utama pembahasan buku ini bukan hanya transfer of knowlade, melainkan lebih kepada pembentukan values melalui teknik-teknik modifikasi perilaku. Penulis meyakini bahwa pendidikan dan lembaga pendidikan tidak hanya menjadi tempat bagi anak untuk belajar tentang keilmuan. Lebih dari itu, pendidikan dan lembaga pendidikan juga harus bisa menjadi model dalam penanaman sikap dan nilai-nilai positif untuk peserta didiknya.\r\n', 'psikologi1.jpg', 0),
('BU-7', 'Psikologi Pendidikan dalam Belajar & Pembelajaran', 'PG-2', 'PN-1', 'K-4', 11, 2, 72500, 'Psikologi adalah ilmu yang berkaitan dengan proses mental, baik normal maupun abnormal dan pengaruhnya pada perilaku, ilmu pengetahuan tentang gejala dan kegiatan jiwa. Pada dasarnya psikologi pendidikan mempelajari seluruh tingkah laku manusia yang terlibat dalam proses pendidikan. Psikologi pendidikan sebagai ilmu yang memberikan sumbangan terhadap pendidikan secara teoritis maupun praktis. Di dalam buku ini akan membahas tingkah laku yang muncul dalam proses pendidikan, seperti pengantar memahami psikologi pendidikan, gejala jiwa, masalah belajar, masalah pembelajaran, pengukuran dan penilaian, diagnostik kesulitan belajar dan kesehatan mental di sekolah.', 'psikologi2.jpg', 0),
('BU-8', 'Manajemen Proyek Sistem Informasi', 'PG-2', 'PN-1', 'K-3', 7, 2, 59500, 'Buku ini disusun untuk membantu pembaca memahami dan mengetahui Bagaimana cara memanajemen sebuah proyek tentang pengembangan Sistem Informasi mulai dari cara mencari proyek, mengelola sampai ke implementasi. Perkembangan teknologi informasi dan komunikasi saat semakin cepat, sehingga menyebabkan perusahaan, instansi dll berlomba – lomba untuk mengembangkan sistem informasi guna membantu kinerja perusahaan. Disinilah letak dari keuntungkan kita sebagai Tenaga IT untuk membantu perusahaan, instansi dll dalam pengembangan sistem informasi.', 'coding1.jpg', 0),
('BU-9', 'Sistem Informasi Manajemen Berbasis Komputer', 'PG-2', 'PN-1', 'K-3', 9, 2, 75500, 'Sistem informasi berbasis komputer merupakan sistem pengolahan suatu data menjadi sebuah informasi yang berkualitas dan dapat dipergunakan sebagai alat bantu yang mendukung pengambilan keputusan, koordinasi dan kendali serta visualisasi dan analisis. Secara garis besar, buku ini disusun untuk membantu mahasiswa memahami dan mengetahui sistem informasi di perusahaan, organisasi, perkantoran dan Interaksi Manusia dan Komputer (IMK). Di era kompetitif seperti ini unggul dalam bersaing merupakan tujuan setiap perusahaan dan organisasi modern. Penggunaan teknologi informasi adalah salah satu cara mencapai keunggulan bersaing tersebut.', 'coding4.jpg', 0);

-- --------------------------------------------------------

--
-- Struktur dari tabel `customer`
--

CREATE TABLE `customer` (
  `id_customer` varchar(20) NOT NULL,
  `nama_customer` varchar(100) NOT NULL,
  `jk_customer` enum('Laki-Laki','Perempuan') NOT NULL,
  `alamat_customer` varchar(200) NOT NULL,
  `email_customer` varchar(100) NOT NULL,
  `telp_customer` varchar(20) NOT NULL,
  `deleted` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `customer`
--

INSERT INTO `customer` (`id_customer`, `nama_customer`, `jk_customer`, `alamat_customer`, `email_customer`, `telp_customer`, `deleted`) VALUES
('CUS-1', 'Panca Nugraha Wicaksana - 1', 'Laki-Laki', 'Blitar - 1', 'pancaNugrahaWicaksana@gmail.com -1', '081216012735', 0),
('CUS-4', 'Customer Panca', 'Laki-Laki', 'Blitar - Customer', 'Customerpanca@gmail.com', '081216012735', 0),
('CUS-5', 'Panca Nugraha Wicaksana', 'Laki-Laki', 'Blitar', 'PancaNugrahaWicaksana@gmail.com', '081216012735', 0);

-- --------------------------------------------------------

--
-- Struktur dari tabel `kategori`
--

CREATE TABLE `kategori` (
  `id_kategori` varchar(20) NOT NULL,
  `nama_kategori` varchar(50) NOT NULL,
  `deleted` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `kategori`
--

INSERT INTO `kategori` (`id_kategori`, `nama_kategori`, `deleted`) VALUES
('K-1', 'Anak', 0),
('K-2', 'Manga', 0),
('K-3', 'Coding', 0),
('K-4', 'Psychology', 0),
('K-5', 'Panca', 0);

-- --------------------------------------------------------

--
-- Struktur dari tabel `penerbit`
--

CREATE TABLE `penerbit` (
  `id_penerbit` varchar(20) NOT NULL,
  `nama_penerbit` varchar(100) NOT NULL,
  `alamat_penerbit` varchar(100) NOT NULL,
  `email_penerbit` varchar(50) NOT NULL,
  `telp_penerbit` varchar(20) NOT NULL,
  `deleted` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `penerbit`
--

INSERT INTO `penerbit` (`id_penerbit`, `nama_penerbit`, `alamat_penerbit`, `email_penerbit`, `telp_penerbit`, `deleted`) VALUES
('PN-1', 'Deepublish', 'Jl.Rajawali G. Elang 6 No 3 RT/RW 005/033, Drono, Sardonoharjo, Ngaglik, Sleman, D.I Yogyakarta 5558', 'Deepublish@indonesia.com', '08112863655', 0),
('PN-2', 'Images Panca', 'D:Gambar', 'buku@gmail.com', '02', 0),
('PN-3', 'PenerbitManga', 'Alamat Penerbit Manga', 'Penerbitmanga@gmail.com', '03', 0),
('PN-4', 'Penerbit Ke 4', 'Indonesia', 'penerbit@gmail.com', '04', 0),
('PN-5', 'Pustaka Panca', 'Indonesia - Jawa timur - Blitar', 'pancanugrahaemail@gmail.com', '081216012735', 0);

-- --------------------------------------------------------

--
-- Struktur dari tabel `pengarang`
--

CREATE TABLE `pengarang` (
  `id_pengarang` varchar(20) NOT NULL,
  `nama_pengarang` varchar(100) NOT NULL,
  `alamat_pengarang` varchar(200) NOT NULL,
  `email_pengarang` varchar(50) NOT NULL,
  `telp_pengarang` varchar(20) NOT NULL,
  `deleted` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `pengarang`
--

INSERT INTO `pengarang` (`id_pengarang`, `nama_pengarang`, `alamat_pengarang`, `email_pengarang`, `telp_pengarang`, `deleted`) VALUES
('PG-1', 'Sujoko, S.Psi, S.PdI, M.Si', 'Kecamatan Anak Ratu Aji Kabupaten Lampung Tengah', 'EmailPakSujoko@gmail.com', '00', 0),
('PG-2', 'EDY SUSENA, S.Kom, M.Kom', 'Sadakan RT.04/02 Wonokerso Kedawung Sragen Jawa Tengah', 'edysusena@gmail.com', '01', 0),
('PG-3', 'MemangNgarang', 'D:Gambar', 'xxx@xxx.com', '02', 0),
('PG-4', 'Mangaka', 'Alamat Mangaka', 'Mangaka@gmail.com', '04', 0),
('PG-5', 'Panca Nugraha W.', 'Jawa Timur - Blitar', 'pancanugrahawicaksana@gmail.com', '081216012735', 0);

-- --------------------------------------------------------

--
-- Struktur dari tabel `transaksi`
--

CREATE TABLE `transaksi` (
  `id_transaksi` varchar(50) NOT NULL,
  `id_customer` varchar(20) NOT NULL,
  `id_buku` varchar(50) NOT NULL,
  `tgl_transaksi` datetime NOT NULL,
  `jumlah` int(11) NOT NULL,
  `total` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `transaksi`
--

INSERT INTO `transaksi` (`id_transaksi`, `id_customer`, `id_buku`, `tgl_transaksi`, `jumlah`, `total`) VALUES
('TR-1', 'CUS-1', 'BU-11', '2021-09-14 10:11:32', 1, 99500),
('TR-2', 'CUS-1', 'BU-1', '2021-09-14 10:11:32', 1, 55000),
('TR-3', 'CUS-1', 'BU-6', '2021-09-14 10:11:32', 1, 135000),
('TR-4', 'CUS-1', 'BU-6', '2021-09-14 10:21:57', 1, 135000),
('TR-5', 'CUS-1', 'BU-6', '2021-10-21 08:23:57', 1, 135000),
('TR-6', 'CUS-1', 'BU-4', '2021-10-28 08:57:31', 1, 65500);

--
-- Trigger `transaksi`
--
DELIMITER $$
CREATE TRIGGER `kembalikan_buku` AFTER DELETE ON `transaksi` FOR EACH ROW BEGIN
	UPDATE buku SET stok=stok+OLD.jumlah WHERE id_buku=OLD.id_buku;
END
$$
DELIMITER ;

-- --------------------------------------------------------

--
-- Struktur dari tabel `user`
--

CREATE TABLE `user` (
  `username` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL,
  `tipe_user` enum('Customer','Admin') NOT NULL,
  `id_customer` varchar(20) DEFAULT NULL,
  `deleted` tinyint(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `user`
--

INSERT INTO `user` (`username`, `password`, `tipe_user`, `id_customer`, `deleted`) VALUES
('admin', 'admin', 'Admin', NULL, 0),
('panca1', 'panca1', 'Customer', 'CUS-1', 0),
('panca5', 'panca5', 'Customer', 'CUS-5', 0),
('customerPanca', 'customerPanca', 'Customer', 'CUS-4', 0);

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `buku`
--
ALTER TABLE `buku`
  ADD PRIMARY KEY (`id_buku`),
  ADD KEY `FK_buku_pengarang` (`id_pengarang`),
  ADD KEY `FK_buku_penerbit` (`id_penerbit`),
  ADD KEY `FK_buku_kategori` (`id_kategori`);

--
-- Indeks untuk tabel `customer`
--
ALTER TABLE `customer`
  ADD PRIMARY KEY (`id_customer`);

--
-- Indeks untuk tabel `kategori`
--
ALTER TABLE `kategori`
  ADD PRIMARY KEY (`id_kategori`);

--
-- Indeks untuk tabel `penerbit`
--
ALTER TABLE `penerbit`
  ADD PRIMARY KEY (`id_penerbit`);

--
-- Indeks untuk tabel `pengarang`
--
ALTER TABLE `pengarang`
  ADD PRIMARY KEY (`id_pengarang`);

--
-- Indeks untuk tabel `transaksi`
--
ALTER TABLE `transaksi`
  ADD KEY `FK_transaksi_customer` (`id_customer`),
  ADD KEY `FK_transaksi_buku` (`id_buku`);

--
-- Indeks untuk tabel `user`
--
ALTER TABLE `user`
  ADD KEY `FK_user_customer` (`id_customer`);

--
-- Ketidakleluasaan untuk tabel pelimpahan (Dumped Tables)
--

--
-- Ketidakleluasaan untuk tabel `buku`
--
ALTER TABLE `buku`
  ADD CONSTRAINT `FK_buku_kategori` FOREIGN KEY (`id_kategori`) REFERENCES `kategori` (`id_kategori`),
  ADD CONSTRAINT `FK_buku_penerbit` FOREIGN KEY (`id_penerbit`) REFERENCES `penerbit` (`id_penerbit`),
  ADD CONSTRAINT `FK_buku_pengarang` FOREIGN KEY (`id_pengarang`) REFERENCES `pengarang` (`id_pengarang`);

--
-- Ketidakleluasaan untuk tabel `transaksi`
--
ALTER TABLE `transaksi`
  ADD CONSTRAINT `FK_transaksi_buku` FOREIGN KEY (`id_buku`) REFERENCES `buku` (`id_buku`),
  ADD CONSTRAINT `FK_transaksi_customer` FOREIGN KEY (`id_customer`) REFERENCES `customer` (`id_customer`);

--
-- Ketidakleluasaan untuk tabel `user`
--
ALTER TABLE `user`
  ADD CONSTRAINT `FK_user_customer` FOREIGN KEY (`id_customer`) REFERENCES `customer` (`id_customer`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
