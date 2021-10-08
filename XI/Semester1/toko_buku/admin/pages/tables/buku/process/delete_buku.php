<?php
    // include DB connection file
    include '../../../../../helper/connection.php';

    // mendapatkan nilai dari form
    $id_buku = $_GET['id_buku'];

    $query = "UPDATE buku SET deleted = 1 WHERE id_buku = '$id_buku'";

    // menjalankan query isi data
    if (mysqli_query($con, $query))
    {
        header("Location:../table_buku.php");
    }
    else
    {
        $error = urldecode("Data tidak berhasil dihapus");
        header("Location:../table_buku.php?error=$error");
    }

    mysqli_close($con);
?>