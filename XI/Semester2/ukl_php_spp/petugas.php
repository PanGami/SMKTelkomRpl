<?php
require_once("require.php");
?>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" type="text/css" href="./Styles/table.css">
    <title>CRUD Data Kelas</title>
</head>
<body>
    <!-- Panggil script header -->
    <?php require_once("header.php"); ?>
    <div class="all-table">
    <!-- Isi Konten -->
        <h3>Petugas</h3>
        <p><a href="tambah_petugas.php"><button type="button" class="btn btn-outline-secondary">Tambah Data</button></a></p>
        <table class="table table-striped table-dark" cellspacing="0" border="1" cellpadding="5">
            <tr>
                <td>No. </td>
                <td>Username</td>
                <td>Password</td>
                <td>Nama Petugas</td>
                <td>Level</td>
                <td>Aksi</td>
            </tr>
    <?php
    // Kita buat konfigurasi pagging
    $jmlhDataHal = 5;
    $data = mysqli_query($db, "SELECT * FROM petugas");
    $jmlhData = mysqli_num_rows($data);
    $jmlhHal = ceil($jmlhData / $jmlhDataHal);
    $halAktif = (isset($_GET['hal'])) ? $_GET['hal'] : 1;
    $dataAwal = ($jmlhData * $halAktif) - $jmlhData;
    // Konfigurasi Selesai
    // Kita panggil tabel petugas
    $sql = mysqli_query($db, "SELECT * FROM petugas LIMIT $dataAwal, $jmlhDataHal");
    $no = 1;
    while($r = mysqli_fetch_assoc($sql)){ ?>
            <tr>
                <td><?= $no ?></td>
                <td><?= $r['username']; ?></td>
                <td><?= $r['password']; ?></td>
                <td><?= $r['nama_petugas']; ?></td>
                <td><?= $r['level']; ?></td>
                <td><a href="?hapus&id=<?= $r['id_petugas']; ?>">Hapus</a> | 
                    <a href="edit_petugas.php?id=<?= $r['id_petugas']; ?>">Edit</a</td>
            </tr>
    <?php $no++; } ?>
        </table>
    <!-- Sekarang kita buat tombol halamannya -->
    <div class="table-number">
        <?php for($i=1; $i <= $jmlhHal; $i++): ?>
                <a href="?hal=<?= $i; ?>"><?= $i; ?></a>
        <?php endfor; ?>
    </div>
    <!-- Selesai -->
    </div>
    <?php require_once("footer.php"); ?>
</body>
</html>
<?php
// Tombol Hapus ditekan
if(isset($_GET['hapus'])){
    $id = $_GET['id'];
    $hapus = mysqli_query($db, "DELETE FROM petugas WHERE id_petugas='$id'");
    if($hapus){
        ?>
        <script>
            alert("Data berhasil disimpan");
            document.location.href="petugas.php";
        </script>
        <?php
    }else{
        echo "<script>alert('Maaf, data tersebut masih terhubung dengan data yang lain');
        </script>";
    }
}
?>