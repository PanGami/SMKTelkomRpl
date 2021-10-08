<?php
    // include DB connection file
    include '../../../../../helper/connection.php';

    // mendapatkan nilai dari form
    $id_penerbit        = $_POST['id_penerbit'];
    $nama_penerbit      = $_POST['nama_penerbit'];
    $alamat_penerbit      = $_POST['alamat_penerbit'];
    $email_penerbit      = $_POST['email_penerbit'];
    $telp_penerbit      = $_POST['telp_penerbit'];

    $query = "UPDATE penerbit SET nama_penerbit = '$nama_penerbit', alamat_penerbit = '$alamat_penerbit', email_penerbit='$email_penerbit', telp_penerbit='$telp_penerbit' WHERE id_penerbit = '$id_penerbit'";

    // menjalankan query isi data
    if (mysqli_query($con, $query))
    {
        header("Location:../table_penerbit.php");
    }
    else
    {
        $error = urldecode("Data tidak berhasil diupdate");
        header("Location:../table_penerbit.php?error=$error");
    }

    mysqli_close($con);
?>