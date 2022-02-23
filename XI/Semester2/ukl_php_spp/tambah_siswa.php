<?php
require_once("require.php");
?>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" type="text/css" href="./Styles/table.css">
    <title>Tambah Siswa</title>
</head>
<body>
    <!-- Panggil header -->
    <?php require("header.php"); ?>
    <div class="all-table test">  
    <!-- Konten -->
    <h3>Tambah Siswa</h3>
    <form action="" method="POST">
    <td colspan="2"><button class="btn btn-outline-secondary" type="submit" name="simpan">Simpan</button></td>
        <table class="table table-striped table-dark" cellpadding="5">
            <tr>
                <td>NISN :</td>
                <td><input class="form-control" type="text" name="nisn"></td>
            </tr>
            <tr>
                <td>NIS :</td>
                <td><input class="form-control" type="text" name="nis"></td>
            </tr>
            <tr>
                <td>Nama :</td>
                <td><input class="form-control" type="text" name="nama"></td>
            </tr>
            <tr>
                <td>Kelas :</td>
                <td>
                <div class="select">
                    <select class="custom-select" id="inlineFormCustomSelectPref" name="kelas">
                        <?php
                        $kelas = mysqli_query($db, "SELECT * FROM kelas");
                        while($r = mysqli_fetch_assoc($kelas)){ ?>
                            <option value="<?= $r['id_kelas']; ?>"><?= $r['nama_kelas'] . " | ". $r['kompetensi_keahlian']; ?></option>
                        <?php } ?>
                    </select>
                </div>
                </td>
            </tr>
            <tr>
                <td>Alamat :</td>
                <td><input class="form-control" type="text" name="alamat"></td>
            </tr>
            <tr>
                <td>No. Telp :</td>
                <td><input class="form-control" type="tel" name="no_telp"></td>
            </tr>
            <tr>
                <td>ID TAHUN SPP :</td>
                <td>
                <div class="select">
                    <select class="custom-select" id="inlineFormCustomSelectPref" name="id_spp">
                        <?php
                        $spp = mysqli_query($db, "SELECT * FROM spp");                        
                        while($r = mysqli_fetch_assoc($spp)){ ?>                            
                            <option value="<?= $r['id_spp'] . " - " . $r['tahun']; ?>"><?= $r['id_spp'] . " - " . $r['tahun'];?></option>
                        <?php } ?>
                    </select>
                </div>
                </td>
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
    $nisn = $_POST['nisn'];
    $nis = $_POST['nis'];
    $nama = $_POST['nama'];
    $kelas = $_POST['kelas'];
    $alamat = $_POST['alamat'];
    $no_telp = $_POST['no_telp'];
    $id_spp = $_POST['id_spp'];
    $simpan = mysqli_query($db, "INSERT INTO siswa VALUES
    ('$nisn', '$nis', '$nama', '$kelas', '$alamat', '$no_telp','$id_spp')");
        if($simpan){
            ?>
            <script>
                alert("Data berhasil disimpan");
                document.location.href="siswa.php";
            </script>
            <?php
        }else{
            echo "<script>alert('Gagal memasukkan data');</script>";
        }
}
?>