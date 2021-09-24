<!DOCTYPE html>
<html>
<head>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KyZXEAg3QhqLMpG8r+8fhAXLRk2vvoC2f3B09zVXn8CA5QIVfZOJ3BCsw2P0p/We" crossorigin="anonymous">    
    <title>Tampil Data Siswa</title>
</head>
<body>        
    <center><h3 class="display-5">Tampil Siswa</h3></center>
    <a style="display:block;width:max;background-color:green" class="btn btn-primary" href="./tambah_kelas.php">Click Disini Untuk Menambahkan Kelas</a>
    <a style="display:block;width:max" class="btn btn-primary" href="./tambah_siswa.php">Click Disini Untuk Menambahkan Siswa</a>    
    <table class="table table-hover table-striped">
        <thead>
            <tr>
                <th>NO</th><th>NAMA SISWA</th><th>TANGGAL LAHIR</th><th>ALAMAT</th><th>GENDER</th><th>USERNAME</th><th>KELAS</th><th>AKSI</th>                                
            </tr>
        </thead>
 <tbody>
    <?php
    include "koneksi.php";
    $qry_siswa=mysqli_query($conn,"select * from siswa join kelas on kelas.id_kelas = siswa.id_kelas");    
    $no=0;           
    while($data_siswa=mysqli_fetch_array($qry_siswa)){
        $no++;?>        
        <tr> 
        <td><?=$no?></td><td><?=$data_siswa['nama_siswa']?></td>
        <td><?=$data_siswa['tanggal_lahir']?></td>
        <td><?=$data_siswa['alamat']?></td><td><?=$data_siswa['gender']?></td>
        <td><?=$data_siswa['username']?></td>
        <td><?=$data_siswa['nama_kelas']?></td> 
        <td><a href="ubah_siswa.php?id_siswa=<?=$data_siswa['id_siswa']?>" class="btn btn-success">Ubah</a> | <a href="hapus.php?id_siswa=<?=$data_siswa['id_siswa']?>"onclick="return confirm('Apakah anda yakin menghapus data ini?')" class="btn btn-danger">Hapus</a></td>                        
        </tr>        
        <?php
    }
    ?>
 </tbody>
 </table>
 <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-U1DAWAznBHeqEIlVSCgzq+c9gqGAJn5c/t99JyeKa9xxaYpSvHU5awsuZVVFIhvj" crossorigin="anonymous"></script>
</body>
</html>