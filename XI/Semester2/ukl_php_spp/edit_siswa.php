<?php
require_once("require.php");
$nisnSiswa = $_GET['nisn'];
$siswa = mysqli_query($db, "SELECT * FROM siswa WHERE nisn='$nisnSiswa'");
?>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" type="text/css" href="./Styles/table.css">
    <title>Edit data Siswa</title>
</head>
<body>
    <!-- Panggil header -->
    <?php require("header.php"); ?>
    <div class="all-table test">  
    <!-- Konten -->
    <h3>Edit data Siswa</h3>
    <?php
    while($row = mysqli_fetch_assoc($siswa)){?>
        <form action="" method="POST">
        <td colspan="2"><button class="btn btn-outline-secondary" type="submit" name="simpan">Simpan</button></td>
            <table class="table table-striped table-dark" cellpadding="5">
                <input class="id-hide" type="text" name="nisn" value="<?= $row['nisn']; ?>">
                <tr>
                    <td>Nama :</td>
                    <td><input class="form-control" type="text" name="nama" value="<?= $row['nama']; ?>"></td>
                </tr>
                <tr>
                    <td>Kelas :</td>
                    <td><select class="custom-select" name="kelas">
    <?php
    $kelas = mysqli_query($db, "SELECT * FROM kelas");
    while($r = mysqli_fetch_assoc($kelas)){ ?>
                            <option value="<?= $r['id_kelas']; ?>"><?= $r['nama_kelas'] . " | " 
                        . $r['kompetensi_keahlian']; ?></option>
    <?php } ?>          </select></td>
                </tr>
                <tr>
                    <td>Alamat :</td>
                    <td><input class="form-control" type="text" name="alamat" value="<?= $row['alamat']; ?>"></td>
                </tr>
                <tr>
                    <td>No. Telp :</td>
                    <td><input class="form-control" type="tel" name="no_telp" value="<?= $row['no_telp']; ?>"></td>
                </tr>
                <tr>
                    <td>ID SPP :</td>
                    <td>
                    <div class="select">
                    <select class="custom-select" id="inlineFormCustomSelectPref" name="id_spp">
                        <?php
                        $spp = mysqli_query($db, "SELECT * FROM spp");                        
                        while($r = mysqli_fetch_assoc($spp)){ ?>                            
                            <option value="<?= $r['id_spp']; ?>"><?= $r['id_spp']?></option>
                        <?php } ?>
                    </select>
                </div>
                    </td>
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
    $nisn = $_POST['nisn'];
    $nama = $_POST['nama'];
    $kelas = $_POST['kelas'];
    $alamat = $_POST['alamat'];
    $no_telp = $_POST['no_telp'];
    $id_spp = $_POST['id_spp'];
    $update = mysqli_query($db, "UPDATE siswa SET nama='$nama',
                                 id_kelas='$kelas', alamat='$alamat', no_telp='$no_telp', id_spp='$id_spp'
                                 WHERE siswa.nisn='$nisn'");          
        if($update){
            ?>
            <script>
                alert("Data berhasil disimpan");
                document.location.href="siswa.php";
            </script>
            <?php
        }else{
            echo "<script>alert('Gagal Mengedit data'); </script>";
        }
}
?>