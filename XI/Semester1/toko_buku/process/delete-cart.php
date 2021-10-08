<?php 
session_start();
$id_buku = $_GET["id_buku"];

$jumlahx = 0;

foreach ($_SESSION["keranjang"] as $id_buku => $jumlah) 
{
	$jumlahx++;
}

if($jumlahx == 1)
{
    unset($_SESSION['keranjang']);
    unset($_SESSION['nomor']); 
}
else
{
    unset($_SESSION["keranjang"][$id_buku]);
}

header('location:../cart.php');
?>