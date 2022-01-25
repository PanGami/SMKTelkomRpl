<?php
require_once("require.php");
?>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" type="text/css" href="./Styles/table.css">
    <title>Tambah data transaksi</title>
</head>
<body>
    <?php require("header.php"); ?>
    <h3>Tambah data transaksi</h3>
    <div class="all-table test">  
    <form action="" method="POST">
    <td colspan="2"><button class="btn btn-outline-secondary" type="submit" name="simpan">Simpan</button></td>
        <table class="table table-striped table-dark" cellpadding="5">
            <tr>
                <td>Petugas :</td>
                <td><select class="custom-select" name="petugas">
                <?php
                // Kita akan ambil Nama Petugas yang ada pada tabel Petugas
                $petugas = mysqli_query($db, "SELECT * FROM petugas");
                while($r = mysqli_fetch_assoc($petugas)){ ?>
                                        <option value="<?= $r['id_petugas']; ?>"><?= $r['nama_petugas']; ?></option>
                <?php } ?></select>
                </td>
            </tr>
            <tr>
                <td>Nama siswa :</td>
                <td><select class="custom-select" name="siswa">
                    <?php
                    // Sekarang kita ambil NISN Siswa 
                    $siswa = mysqli_query($db, "SELECT * FROM siswa");
                    while($r = mysqli_fetch_assoc($siswa)){ ?>
                    <option value="<?= $r['nisn']; ?>"><?= $r['nama']; ?></option>
                    <?php } ?>
                </select></td>
            </tr>   
            <tr>
                <td>Tgl. / Bulan / Tahun membayar :</td>
                <td>
                    <input class="form-control" type='date' name="tgl" size="5" placeholder="Tanggal." id='hasta' value='<?php echo date('Y-m-d');?>'readonly>                    
                    
                    <!-- <input class="form-control" type="text" name="tahun" size="5" placeholder="Tahun."></td> -->
            </tr>
            <tr>
                <td>SPP Yang harus dibayar dengan tahun dan bulan :</td>
                <td>
                <input class="form-control" type="text" name="bulan" size="10" placeholder="Bulan.">
                <select class="custom-select" name="spp">
<?php
// Ambil juga data SPP
$spp = mysqli_query($db, "SELECT * FROM spp");
while($r = mysqli_fetch_assoc($spp)){ ?>
                        <option value="<?= $r['id_spp']; ?>">
                        <?= $r['tahun'] . " | " . $r['nominal']; ?></option>
<?php } ?>          </select></td>
            </tr>
            <tr>
                <td>Jumlah bayar</td>
                <td><input class="form-control" type="text" name="jumlah" placeholder="1000000"></tdd>
            </tr>
        </table>
</div>
    <?php require("footer.php"); ?>
</body>
</html>
<?php
// Kita simpan proses simpan datanya disini
// echo "<script>alert('test');</script>"; // TEST DEBUG
if(isset($_POST['simpan'])){
    $petugas = $_POST['petugas'];
    $nama = $_POST['siswa'];
    $tgl = $_POST['tgl']; $bulan = $_POST['bulan']; $tahun = $_POST['tahun'];
    $spp = $_POST['spp'];
    $cek = mysqli_query($db, "SELECT * FROM transaksi WHERE nama='$nama'");
    $ambil = $cek;
    $jumlah = $_POST['jumlah'];
    // echo "<script>alert('test2');</script>"; // TEST DEBUG 2
    if($spp == $ambil['id_spp']){
        echo "<script>alert('Gagal pada Tahun SPP');</script>";
    }else{
        $s = mysqli_query($db,"INSERT INTO pembayaran VALUES
                    (NULL, '$petugas', '$nama', '$tgl', '$bulan', '$tahun', '$spp', '$jumlah')");
        // Arahkan ke menu transaksi
        if($s){
        ?>
        <!-- give some alert -->
        <script>
            alert("Data berhasil disimpan");
            document.location.href="transaksi.php";
        </script>
        <?php
        }else{
            echo "<script>alert('gagal');</script>";
    }}}
?>