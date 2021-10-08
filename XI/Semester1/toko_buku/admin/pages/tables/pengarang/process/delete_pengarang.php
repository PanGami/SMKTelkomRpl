<?php
    // include DB connection file
    include '../../../../../helper/connection.php';

    // mendapatkan nilai dari form
    $id_pengarang = $_GET['id_pengarang'];

    $query = "UPDATE pengarang SET deleted = 1 WHERE id_pengarang = '$id_pengarang'";

    // menjalankan query isi data
    if (mysqli_query($con, $query))
    {
        header("Location:../table_pengarang.php");
    }
    else
    {
        $error = urldecode("Data tidak berhasil dihapus");
        header("Location:../table_pengarang.php?error=$error");
    }

    mysqli_close($con);
?>