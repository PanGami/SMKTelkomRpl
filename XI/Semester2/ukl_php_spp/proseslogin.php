<?php
session_start();
require_once("koneksi.php");
// Kita akan membuat proses login nya disini
if(isset($_POST['login'])){
    $username = $_POST['username'];
    $password = MD5($_POST['password']);
    $cari = mysqli_query($db, "SELECT * FROM petugas WHERE username='$username'");
    $hasil = mysqli_fetch_assoc($cari);
        // Jika data yang dicari kosong
        if(mysqli_num_rows($cari) == 0){
            echo "<script>alert('Data Anda Kosong');</script>";
            require_once("not_found.php");
            
        }else{
            // Jika password tidak sesuai dengan yang ada di database
            if($hasil['password'] <> $password){
                echo "<script>alert('Password Tidak Sesuai');</script>";
                require_once("not_found.php"); 
                
            }else{
                // Jika user sesuai dengan database maka akan redirect ke halaman utama dan akan dibuatkan sesi
                $_SESSION['username'] = $_POST['username'];
                echo "<script>alert('Username Tidak Sesuai');</script>";
                header("location: index.php");
            }
        }
}
?>