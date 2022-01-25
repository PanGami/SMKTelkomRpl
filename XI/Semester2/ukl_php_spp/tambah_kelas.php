<?php
require_once("require.php");
?>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" type="text/css" href="./Styles/table.css">
    <title>Tambah Kelas</title>
</head>
<body>
    <!-- Panggil header -->
    <?php require("header.php"); ?>
    <div class="all-table test">  
    <!-- Konten -->
    <h3>Tambah Kelas</h3>
    <form action="" method="POST">
    <td colspan="2"><button button class="btn btn-outline-secondary" type="submit" name="simpan">Simpan</button></td>
        <table class="table table-striped table-dark" cellpadding="5">
            <tr>
                <td>Nama Kelas :</td>
                <td><input class="form-control"     type="text" name="nama"></td>
            </tr>
            <tr>
                <td>Kompetensi Keahlian :</td>
                <td><input class="form-control" type="text" name="kk"></td>
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
    $nama = $_POST['nama'];
    $kk = $_POST['kk'];
    $simpan = mysqli_query($db, "INSERT INTO kelas VALUES(NULL, '$nama', '$kk')");
        if($simpan){
            ?>
            <script>
                alert("Data berhasil disimpan");
                document.location.href="kelas.php";
            </script>
            <?php
        }else{
            echo "<script>alert('Data sudah ada');</script>";
        }
}
?>