<?php
require_once("require.php");
?>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" type="text/css" href="./Styles/table.css">
    <title>Entry Transaksi</title>
</head>
<body>
    <!-- Panggil script header -->
    <?php require_once("header.php"); ?>
    <div class="all-table">
    <!-- Isi Konten -->    
    <h3>Transaksi</h3>    
    <br>
    <p><a href="laporan_transaksi.php"><button type="button" style="float:left;" class="btn btn-outline-secondary">Mencetak Transaksi</button></a></p>
    <p><a href="tambah_transaksi.php"><button type="button" style="margin-top:-16px;" class="btn btn-outline-secondary">Tambah Data</button></a></p>
    <table class="table table-striped table-dark" cellspacing="0" border="1" cellpadding="5">
        <tr>
            <td>No. </td>
            <td>Nama Petugas</td>
            <td>Nama Siswa</td>
            <td>Terakhir Membayar</td>
            <td>Bulan Tahun / Nominal harus dibayar</td>
            <td>Jumlah yang dibayar</td>
            <td>Status</td>
            <td>Aksi</td>
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
                <td><?= $r['tgl_bayar']?></td>
                <td><?= $r['bulan_dibayar'] . " - " . $r['tahun'] . " | Rp. " . $r['nominal']; ?></td>
                <td><?= $r['jumlah_bayar']; ?></td>
                <td>
    <?php
    // Jika jumlah bayar sesuai dengan yang harus dibayar maka Status LUNAS
    if($r['jumlah_bayar'] == $r['nominal']){ ?>
                    <font style="color: darkgreen; font-weight: bold;">LUNAS</font>
    <?php }else{ ?>                             BELUM LUNAS <?php } ?> </td>
                <td>
    <?php
    // Jika siswa ingin membayar lunas sisa pembayaran
    if($r['jumlah_bayar'] == $r['nominal']){ echo "-";
    }else{ ?>
        <a href="?lunas&id=<?= $r['id_pembayaran']; ?>">BAYAR LUNAS</a>
    <?php } ?>  </td>
            </tr>
    <?php $no++; } ?>
        </table>
    <!-- Tampilkan tombol halaman -->
    <div class="table-number">
        <?php for($i=1; $i <= $totalHalaman; $i++): ?>
                <a href="?hal=<?= $i; ?>"><?= $i; ?></a>
        <?php endfor; ?>
    </div>
    <!-- Selesai -->
    </div>
    <?php require_once("footer.php"); ?>
</body>
</html>
<?php
// Ada siswa yang ingin membayar sisa pembayaran
if(isset($_GET['lunas'])){
    $id = $_GET['id'];
    $ambilData = mysqli_query($db, "SELECT * FROM pembayaran JOIN spp ON pembayaran.id_spp=spp.id_spp 
                                    WHERE id_pembayaran = '$id'");
    $row = mysqli_fetch_assoc($ambilData);
    $sisa = $row['nominal'] - $row['jumlah_bayar'];
    $hasil = $row['jumlah_bayar'] + $sisa;
    $update = mysqli_query($db, "UPDATE pembayaran SET jumlah_bayar='$hasil' WHERE id_pembayaran='$id'");
    $updateTglLastPay = mysqli_query($db, "UPDATE pembayaran SET tgl_bayar= NOW() WHERE id_pembayaran='$id'");
    //Test Variable
    if($update){
        ?>
        <script>
            alert("Data berhasil disimpan");            
            document.location.href="transaksi.php";
        </script>
        <?php
    }
}
?>