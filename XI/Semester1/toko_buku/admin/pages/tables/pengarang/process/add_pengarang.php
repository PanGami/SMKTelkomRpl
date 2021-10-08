<?php
    // include DB connection file
    include '../../../../../helper/connection.php';

    // mendapatkan nilai dari form
    $id_pengarang        = $_POST['id_pengarang'];
    $nama_pengarang    = $_POST['nama_pengarang'];
    $alamat_pengarang      = $_POST['alamat_pengarang'];
    $email_pengarang      = $_POST['email_pengarang'];
    $telp_pengarang      = $_POST['telp_pengarang'];

    $query = "INSERT INTO pengarang VALUES ('$id_pengarang','$nama_pengarang','$alamat_pengarang','$email_pengarang','$telp_pengarang',0)";

    // menjalankan query isi data
    if (mysqli_query($con, $query))
    {
        header("Location:../table_pengarang.php");
    }
    else
    {
        $error = urldecode("Data tidak berhasil ditambahkan");
        header("Location:../table_pengarang.php?error=$error");
    }

    mysqli_close($con);
?>