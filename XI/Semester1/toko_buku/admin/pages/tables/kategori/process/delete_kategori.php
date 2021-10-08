<?php
    // include DB connection file
    include '../../../../../helper/connection.php';

    // mendapatkan nilai dari form
    $id_kategori = $_GET['id_kategori'];

    $query = "UPDATE kategori SET deleted = 1 WHERE id_kategori = '$id_kategori'";

    // menjalankan query isi data
    if (mysqli_query($con, $query))
    {
        header("Location:../table_kategori.php");
    }
    else
    {
        $error = urldecode("Data tidak berhasil dihapus");
        header("Location:../table_kategori.php?error=$error");
    }

    mysqli_close($con);
?>