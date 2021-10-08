<?php
    include('../../../../helper/connection.php');

    $id_customer        = $_POST['id_customer'];
    $nama_customer      = $_POST['nama_customer'];
    $jk_customer        = $_POST['jk_customer'];
    $alamat_customer      = $_POST['alamat_customer'];
    $email_customer      = $_POST['email_customer'];
    $telp_customer      = $_POST['telp_customer'];

    $username = $_POST['username'];
    $password = $_POST['password'];

    $query = "INSERT INTO customer VALUES ('$id_customer','$nama_customer','$jk_customer','$alamat_customer','$email_customer','$telp_customer',0)";
    $query2 = "INSERT INTO user VALUES ('$username','$password','Customer','$id_customer',0)";

    // menjalankan query isi data
    if (mysqli_query($con, $query) && mysqli_query($con, $query2))
    {
        header("Location:../../../index.php");
    }
    else
    {
        echo "<script type='text/javascript'>
	    alert('Login Gagal!')
	    </script>";
        header("Location:../index.php");
    }

    mysqli_close($con);

?>