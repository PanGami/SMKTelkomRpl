<?php
require_once("require.php");
?>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" type="text/css" href="./Styles/table.css">
    <title>Tambah Petugas</title>
</head>
<body>
    <!-- Panggil header -->
    <?php require("header.php"); ?>
    <div class="all-table test">
    <!-- Konten -->
    <h3>Tambah Petugas</h3>
    <form action="" method="POST">
    <td colspan="2"><button class="btn btn-outline-secondary" type="submit" name="simpan">Simpan</button></td>
        <table class="table table-striped table-dark" cellpadding="5">
            <tr>
                <td>Username :</td>
                <td><input class="form-control" type="text" name="user"></td>
            </tr>
            <tr>
                <td>Password :</td>
                <td><input class="form-control" type="text" name="pass"></td>
            </tr>
            <tr>
                <td>Nama :</td>
                <td><input class="form-control" type="text" name="nama"></td>
            </tr>
        </table>
    </form>
    </div>
            <!-- Panggil footer -->
    <?php require("footer.php"); ?>
</body>
</html>
<?php
// Proses Simpan
if(isset($_POST['simpan'])){
    $user = $_POST['user'];
    $pass = md5($_POST['pass']);
    $nama = $_POST['nama'];
    $simpan = mysqli_query($db, "INSERT INTO petugas VALUES(NULL, '$user', '$pass', '$nama', 'Petugas')");
        if($simpan){
            ?>
            <script>
                alert("Data berhasil disimpan");
                document.location.href="petugas.php";
            </script>
            <?php
        }else{
            echo "<script>alert('Data sudah ada');</script>";
        }
}
?>