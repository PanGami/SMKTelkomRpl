<?php

include 'CONSTANT.php';

$con = mysqli_connect(HOST,UNAME,PASS,DB);

// mengecek koneksi
if (mysqli_connect_errno())
{
    echo "Gagal koneksi ke MySQL : " . mysqli_connect_error();
} 

?>