<?php
require_once("require.php");
$id = $_GET['id'];
$spp = mysqli_query($db, "SELECT * FROM spp WHERE id_spp='$id'");
?>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Edit data SPP</title>
    <link rel="stylesheet" type="text/css" href="./Styles/table.css">
</head>
<body>
    <!-- Panggil header -->
    <?php require("header.php"); ?>
    <div class="all-table test"> 
    <!-- Konten -->
    <h3>Edit data SPP</h3>
<?php
while($row = mysqli_fetch_assoc($spp)){?>
    <form action="" method="POST">
    <td colspan="2"><button class="btn btn-outline-secondary" type="submit" name="simpan">Simpan</button></td>
        <table class="table table-striped table-dark" cellpadding="5">
            <input class="id-hide" type="text" name="id" value="<?= $row['id_spp']; ?>">
            <tr>
                <td>Tahun :</td>
                <td><input class="form-control" type="text" name="tahun" value="<?= $row['tahun']; ?>"></td>
            </tr>
            <tr>
                <td>Nominal :</td>
                <td><input class="form-control" type="text" name="nominal" value="<?= $row['nominal']; ?>"></td>
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
    $tahun = $_POST['tahun'];
    $nominal = $_POST['nominal'];
    $update = mysqli_query($db, "UPDATE spp SET tahun='$tahun', nominal='$nominal'
                                 WHERE spp.id_spp='$id'");
        if($update){
            ?>
            <script>
                alert("Data berhasil disimpan");
                document.location.href="spp.php";
            </script>
            <?php
        }else{
            echo "<script>alert('Gagal'); </script>";
        }
}
?>