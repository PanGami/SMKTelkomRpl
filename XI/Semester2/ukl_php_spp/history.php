<?php
require_once("require.php");
?>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" type="text/css" href="./Styles/history.css">
    <title>History Pembayaran</title>
</head>
<body>
    <!-- Panggil header -->
    <?php require_once("header.php"); ?>
    <div class="all-table">        
    <!-- Konten -->
        <h3>History Pembayaran Siswa</h3>
        <div id="historylah">
        <form class="formnya-history" action="" method="POST" autocomplete="off">
            <input type="text" name="nisn" placeholder="Cari berdasarkan NISN" autofocus>
            <button type="submit" class="btn btn-outline-secondary" name="cari">Cari</button>
        </form>        
    </div>
<?php
error_reporting(0);
// Kita lakukan proses pencariannya disini
if(isset($_POST['cari'])){
    $nisn = $_POST['nisn'];
    // Kita panggil table siswa
    $biodataSiswa = mysqli_query($db, "SELECT * FROM siswa 
                    JOIN kelas ON siswa.id_kelas=kelas.id_kelas 
                    WHERE nisn='$nisn'");

    // Table pembayaran wajib kita panggil
    $historyPembayaran = mysqli_query($db, "SELECT * FROM pembayaran
                         JOIN petugas ON pembayaran.id_petugas=petugas.id_petugas
                         JOIN spp ON pembayaran.id_spp=spp.id_spp
                         WHERE nisn='$nisn'
                         ORDER BY tgl_bayar");
    $r_siswa = mysqli_fetch_assoc($biodataSiswa);
    if($r_siswa !== null){    
?>    
    <!-- Kita tampilkan Biodata Siswa -->
        <table class="history-biodata" cellpadding="5">
        <button class="btn btn-outline-secondary" id="tested" onclick="myFunction()">Menghilangkan Sesuatu</button>
            <tr>
                <td>NISN</td>
                <td>:</td>                
                <td><?= $r_siswa['nisn']; ?></td>
            </tr>
            <tr>
                <td>NIS</td>
                <td>:</td>
                <td><?= $r_siswa['nis']; ?></td>
            </tr>
            <tr>
                <td>Nama</td>
                <td>:</td>
                <td><?= $r_siswa['nama']; ?></td>
            </tr>
            <tr>
                <td>Kelas</td>
                <td>:</td>
                <td><?= $r_siswa['nama_kelas'] . " | " . $r_siswa['kompetensi_keahlian']; ?></td>
            </tr>
        </table>
        <hr />
        <!-- Sekarang kita tampilkan history pembayarannya -->
        <table class="table table-striped table-dark" cellpadding="5" cellspacing="0" border="1">
            <tr>
                <td>No. </td>
                <td>Tanggal Pembayaran</td>
                <td>Pembayaran Melalui</td>
                <td>Tahun SPP | Nominal yang harus dibayar</td>
                <td>Jumlah yang sudah dibayar</td>
                <td>Status</td>
                <td>Aksi</td>
            </tr>
<?php 
$no=1;
while($r_trx = mysqli_fetch_assoc($historyPembayaran)){ ?>
            <tr>
                <td><?= $no; ?></td>
                <td><?= $r_trx['tgl_bayar'] . " " . $r_trx['bulan_dibayar'] . " " .
                        $r_trx['tahun_dibayar']; ?></td>
                <td><?= $r_trx['nama_petugas']; ?></td>
                <td><?= $r_trx['tahun'] . " | Rp. " . $r_trx['nominal']; ?></td>
                <td><?= "Rp. " . $r_trx['jumlah_bayar']; ?></td>
<?php
if($r_trx['jumlah_bayar'] == $r_trx['nominal']){ ?>
                <td><font style="color: darkgreen; font-weight: bold;">LUNAS</font></td>
                <td>-</td>
<?php }else{ ?> <td>BELUM LUNAS</td>
                <td><a href="transaksi.php?lunas&id=<?= $r_trx['id_pembayaran']; ?>">
                BAYAR LUNAS</a></td>
<?php } ?>
            </tr>
<?php $no++; }?>
        </table>
<?php }else{
        ?>
        <script>
            alert("Data Tidak Ditemukan");
            document.location.href="history.php";
        </script>
        <?php
    }
}?>
</div>
    <!-- Panggil footer -->
    <?php require_once("footer.php"); ?>
    <script>
        function myFunction() {
            var myobj = document.getElementById("historylah");
            myobj.remove();
        }
    </script>
</body>
</html>
