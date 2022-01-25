<?php
require_once("require.php");
$id = $_GET['id'];
$petugas = mysqli_query($db, "SELECT * FROM petugas WHERE id_petugas='$id'");
?>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" type="text/css" href="./Styles/table.css">
    <title>Edit data Petugas</title>
</head>
<body>
    <!-- Panggil header -->
    <?php require("header.php"); ?>
    <div class="all-table test"> 
    <!-- Konten -->
    <h3>Edit data Petugas</h3>
<?php
while($row = mysqli_fetch_assoc($petugas)){?>
    <form action="" method="POST">
    <td colspan="2"><button class="btn btn-outline-secondary" type="submit" name="simpan">Simpan</button></td>
        <table class="table table-striped table-dark" cellpadding="5">
            <input class="id-hide" type="text" name="id" value="<?= $row['id_petugas']; ?>">
            <tr>
                <td>Username :</td>
                <td><input class="form-control" type="text" name="user" value="<?= $row['username']; ?>"></td>
            </tr>
            <tr>
                <td>Password :</td>
                <td><input class="form-control" type="text" name="pass" value="<?= $row['password']; ?>"></td>
            </tr>
            <tr>
                <td>Nama Petugas :</td>
                <td><input class="form-control" type="text" name="nama" value="<?= $row['nama_petugas']; ?>"></td>
            </tr>
        </table>
    </form>
<?php } ?>
</div>
    <!-- Panggil footer -->
    <?php require("footer.php"); ?>
</body>
</html>
<?php
// Proses update
if(isset($_POST['simpan'])){
    $id = $_POST['id'];
    $user = $_POST['user'];
    $pass = md5($_POST['pass']);
    $nama = $_POST['nama'];
    $update = mysqli_query($db, "UPDATE petugas SET username='$user',
                                 password='$pass', nama_petugas='$nama'
                                 WHERE petugas.id_petugas='$id'");
        if($update){
            ?>
            <script>
                alert("Data berhasil disimpan");
                document.location.href="petugas.php";
            </script>
            <?php
        }else{
            echo "<script>alert('Gagal'); </script>";
        }
}
?>