<?php
 if($_GET['id_buku']){
    include "koneksi.php";
    $qry_hapus=mysqli_query($conn,"delete from buku where id_buku='".$_GET['id_buku']."'");
    if($qry_hapus){
        echo "<script>alert('Sukses menghapus buku');location.href='buku.php';</script>";
    } else {
        echo "<script>alert('Gagal menghapus buku');location.href='buku.php';</script>";
    }
 }
?>