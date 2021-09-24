<?php
    include "header.php";
?>
<h2>Daftar Buku</h2>
<div class="row">
 <?php
    include "koneksi.php";
    $qry_buku=mysqli_query($conn,"select * from buku");
   
    while($dt_buku=mysqli_fetch_array($qry_buku)){
        
        ?>
        
        <div class="col-md-3">
            <div class="card" >
            <img src="./images/<?=$dt_buku['foto']?>" class="card-img-top" style="width:auto;height:420px">
                <div class="card-body">
                    <h5 class="card-title"><?=$dt_buku['nama_buku']?></h5>
                    <p class="card-text"><?=substr($dt_buku['deskripsi'], 0,20)?></p>
                    <a href="pinjam_buku.php?id_buku=<?=$dt_buku['id_buku']?>" class="btn btn-primary">Pinjam</a> | <a href="hapus_buku.php?id_buku=<?=$dt_buku['id_buku']?>"onclick="return confirm('Apakah anda yakin menghapus data ini?')" class="btn btn-danger">Hapus</a>
                </div>
            </div>
        </div>
        <?php
 }
 ?> 
</div>
<hr style="color:red;padding:3px">
 <a style="display:block;width:max" class="btn btn-primary" href="./tambah_buku.php">Click Disini Untuk Menambahkan Buku</a>   
<?php
    include "footer.php";
?>