<?php
    // include DB connection file
    include '../../../../../helper/connection.php';

    // mendapatkan nilai dari form
    $id_customer       = $_POST['id_customer'];
    $username    = $_POST['username'];
    $password      = $_POST['password'];

    $query = "INSERT INTO user VALUES ('$username','$password','Customer','$id_customer',0)";

    // menjalankan query isi data
    if (mysqli_query($con, $query))
    {
        header("Location:../table_user.php");
    }
    else
    {
        $error = urldecode("Data tidak berhasil ditambahkan");
        header("Location:../table_user.php?error=$error");
    }

    mysqli_close($con);
?>