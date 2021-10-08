<?php
    // include DB connection file
    include '../../../../../helper/connection.php';

    // mendapatkan nilai dari form
    $id_customer     = $_POST['id_customer'];
    $nama_customer    = $_POST['nama_customer'];
    $jk_customer    = $_POST['jk_customer'];
    $alamat_customer    = $_POST['alamat_customer'];
    $email_customer    = $_POST['email_customer'];
    $telp_customer    = $_POST['telp_customer'];

    $query = "UPDATE customer SET nama_customer = '$nama_customer', jk_customer = '$jk_customer', alamat_customer = '$alamat_customer', email_customer = '$email_customer', telp_customer = '$telp_customer' WHERE id_customer = '$id_customer'";

    // menjalankan query isi data
    if (mysqli_query($con, $query))
    {
        header("Location:../table_customer.php");
    }
    else
    {
        $error = urldecode("Data tidak berhasil diupdate");
        header("Location:../table_customer.php?error=$error");
    }

    mysqli_close($con);
?>