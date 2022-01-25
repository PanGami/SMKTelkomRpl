<?php 
session_start();
require_once("koneksi.php");
if(isset($_SESSION['nisn'])){
    header("location: index_siswa.php");
}
?>
<!DOCTYPE html>
<html>
<head>
	<title>Laporan Pembayaran</title>
	<style >
		body{
			font-family: arial;
		}
		.print{
			margin-top: 10px;
		}
		@media print{
			.print{
				display: none;
			}
		}
		table{
			border-collapse: collapse;
		}
	</style>
</head>
<body>
	<h3>SMK TELKOM MALANG<b><br/>LAPORAN PEMBAYARAN SPP</b></h3>
	<br>
	<table border="1" cellspacing="" cellpadding="4" width="100%">
        <tr>
            <td>No. </td>
            <td>Nama Petugas</td>
            <td>Nama Siswa</td>
            <td>Tgl/Bulan/Tahun dibayar</td>
            <td>Tahun / Nominal harus dibayar</td>
            <td>Jumlah yang dibayar</td>
            <td>Status</td>
        </tr>
	<?php 
    $totalDataHalaman = 5;
    $data = mysqli_query($db, "SELECT * FROM pembayaran");
    $hitung = mysqli_num_rows($data);
    $totalHalaman = ceil($hitung / $totalDataHalaman);
    $halAktif = (isset($_GET['hal'])) ? $_GET['hal'] : 1;
    $dataAwal = ($totalDataHalaman * $halAktif) - $totalDataHalaman;
    // Kita panggil tabel pembayaran
    // Setelah kita panggil, JOIN tabel yang ter relasi ke tabel pembayaran
    $sql = mysqli_query($db, "SELECT * FROM pembayaran
    JOIN petugas ON pembayaran.id_petugas = petugas.id_petugas 
    JOIN siswa ON pembayaran.nisn = siswa.nisn
    JOIN spp ON pembayaran.id_spp = spp.id_spp
    ORDER BY tgl_bayar ASC LIMIT $dataAwal, $totalDataHalaman");
    $no = 1;
    while($r = mysqli_fetch_assoc($sql)){ ?>
            <tr>
                <td><?= $no ?></td>
                <td><?= $r['nama_petugas']; ?></td>
                <td><?= $r['nama']; ?></td>
                <td><?= $r['tgl_bayar'] . "/" . $r['bulan_dibayar'] . "/" . $r['tahun_dibayar']; ?></td>
                <td><?= $r['tahun'] . " | Rp. " . $r['nominal']; ?></td>
                <td><?= $r['jumlah_bayar']; ?></td>
                <td>
    <?php
    // Jika jumlah bayar sesuai dengan yang harus dibayar maka Status LUNAS
    if($r['jumlah_bayar'] == $r['nominal']){ ?>
                    <font style="color: darkgreen; font-weight: bold;">LUNAS</font>
    <?php }else{ ?>                             BELUM LUNAS <?php } ?> </td>
            </tr>
    <?php $no++; } ?>
        </table>
<table width="100%">
	<tr>
		<td></td>
		<td width="200px">
			<BR/>
			<p>Malang , <?= date('d/m/20y') ?> <br/>
				Panca Nugraha Wicaksana,
			<br/>
			<br/>
			<br/>
		<p>__________________________</p>
		</td>
	</tr>
</table>


	<a  href="#" onclick="window.print();"><button class="print">CETAK</button></a>
</body>
</html>

