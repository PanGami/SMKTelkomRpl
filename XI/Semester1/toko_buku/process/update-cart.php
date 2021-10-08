<?php
include 'helper/connection.php';
session_start();

$id_buku = $_GET['id_buku'];
$_SESSION['nomor']+=1;

//sudah ada
if(isset($_SESSION['keranjang'][$id_buku]))
{
    $_SESSION['keranjang'][$id_buku]+=1;
    
}
//belum ada
else
{
    $_SESSION['keranjang'][$id_buku] = 1;
}

header("location:../cart.php");

?>