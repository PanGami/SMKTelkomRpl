<?php
    // include DB connection file
    include '../../../../../helper/connection.php';

    // mendapatkan nilai dari form
    $id_customer = $_GET['id_customer'];

    $query = "UPDATE customer SET deleted = 1 WHERE id_customer = '$id_customer'";

    // menjalankan query isi data
    if (mysqli_query($con, $query))
    {
        header("Location:../table_customer.php");
    }
    else
    {
        $error = urldecode("Data tidak berhasil dihapus");
        header("Location:../table_customer.php?error=$error");
    }

    mysqli_close($con);
?>