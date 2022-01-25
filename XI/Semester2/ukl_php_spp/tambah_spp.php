<?php
require_once("require.php");
?>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" type="text/css" href="./Styles/table.css">
    <title>Tambah SPP</title>
</head>
<body>
    <!-- Panggil header -->
    <?php require("header.php"); ?>
    <div class="all-table test">    
    <!-- Konten -->
    <h3>Tambah SPP</h3>
    <form action="" method="POST">
    <td colspan="2"><button class="btn btn-outline-secondary" type="submit" name="simpan">Simpan</button></td>
        <table class="table table-striped table-dark" cellpadding="5">
            <tr>
                <td>Tahun :</td>
                <td><input class="form-control" type="text" name="tahun"></td>
            </tr>
            <tr>
                <td>Nominal :</td>
                <td><input class="form-control" type="text" name="nominal"></td>
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
    $tahun = $_POST['tahun'];
    $nominal = $_POST['nominal'];
    $simpan = mysqli_query($db, "INSERT INTO spp VALUES(NULL, '$tahun', '$nominal')");
        if($simpan){
            ?>
            <script>
                alert("Data berhasil disimpan");
                document.location.href="spp.php";
            </script>
            <?php
        }else{
            echo "<script>alert('Data sudah ada');</script>";
        }
}
?>