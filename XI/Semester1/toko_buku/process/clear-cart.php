<?php
include 'helper/connection.php';
session_start();

unset($_SESSION['keranjang']);
unset($_SESSION['nomor']); 

header("location:../cart.php");

?>