<?php
    if($_POST){
        $nama_buku=$_POST['nama_buku'];
        $deskripsi=$_POST['deskripsi'];
        $ekstensi = array("png","jpg","jpeg");
        $namafile = $_FILES['file']['name'];
        $tmp = $_FILES['file']['tmp_name'];
        $tipe_file = pathinfo($namafile, PATHINFO_EXTENSION);
        $ukuran = $_FILES['file']['size'];
        
        if(empty($nama_buku)){
            echo "<script>alert('Nama Buku tidak boleh kosong');location.href='tambah_buku.php';</script>";
        } elseif(empty($deskripsi)){
            echo "<script>alert('Deskripsi tidak boleh kosong');location.href='tambah_buku.php';</script>";
        } elseif(empty($namafile)){
            echo "<script>alert('Deskripsi tidak boleh kosong');location.href='tambah_buku.php';</script>";
        }else {
            include "koneksi.php";
            move_uploaded_file($tmp, './images/'.$namafile);
            $insert = mysqli_query($conn,"insert into buku (nama_buku, deskripsi,foto) value ('".$nama_buku."','".$deskripsi."','".$namafile."')");
            if($insert){
                echo "<script>alert('Sukses menambahkan buku');location.href='tambah_buku.php';</script>";
            } else {
                echo "<script>alert('Gagal menambahkan buku');location.href='tambah_buku.php';</script>";
            }
        }
    }
?>