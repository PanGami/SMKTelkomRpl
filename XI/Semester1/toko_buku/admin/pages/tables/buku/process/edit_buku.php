<?php
    // include DB connection file
    include '../../../../../helper/connection.php';

    // mendapatkan nilai dari form
    $id_buku        = $_POST['id_buku'];
    $judul_buku     = $_POST['judul_buku'];
    $id_pengarang   = $_POST['id_pengarang'];
    $id_penerbit    = $_POST['id_penerbit'];
    $id_kategori    = $_POST['id_kategori'];
    $stok           = $_POST['stok'];
    $berat          = $_POST['berat'];
    $harga          = $_POST['harga'];
    $deskripsi      = $_POST['deskripsi'];

    $nama_folder    = "images";
    $nama_file      = $_FILES["gambar"]["name"];
    $tmp            = $_FILES["gambar"]["tmp_name"];
    $path           = "../../../../../$nama_folder/$nama_file";
    $tipe_file      = array("image/jpeg","image/png","image/jpg");

    $query = "UPDATE buku SET judul_buku = '$judul_buku', id_pengarang = '$id_pengarang', id_penerbit = '$id_penerbit', id_kategori = '$id_kategori', stok = $stok, berat = $berat, harga = $harga, deskripsi = '$deskripsi' WHERE id_buku = '$id_buku'";

    // syarat upload foto
    if(!in_array($_FILES["gambar"]["type"],$tipe_file) && $nama_file != "")
    {
        $error = urldecode("Cek kembali ekstensi file anda (*.jpg,*.gif,*.png)");
        header("Location:../table_buku.php?error=$error");
    }
    else if(in_array($_FILES["gambar"]["type"],$tipe_file) && $nama_file != "")
    {
        // jika gambar diubah
        $query_gambar = "SELECT gambar FROM buku WHERE id_buku=$id_buku";
        $result       = mysqli_query($connection, $query_gambar);
        $hasil        = mysqli_fetch_assoc($result);
        $gambar       = $hasil['gambar'];

        // menghapus gambar lama
        unlink('../../../../../images/'. $gambar);
        
        // upload gambar baru
        move_uploaded_file($tmp,$path);
        
        // query untuk mengupdate data + gambar
	    $query = "UPDATE buku SET judul_buku = '$judul_buku', id_pengarang = '$id_pengarang', id_penerbit = '$id_penerbit', id_kategori = '$id_kategori', stok = $stok, berat = $berat, harga = $harga, deskripsi = '$deskripsi', gambar='$nama_file' WHERE id_buku = '$id_buku'";

        // menjalankan query isi data
        if (mysqli_query($con, $query))
        {
            header("Location:../table_buku.php");
        }
        else
        {
            $error = urldecode("Data tidak berhasil diupdate");
            header("Location:../table_buku.php?error=$error");
        }
    }
    else if($nama_file == "")
    {
	// query untuk mengupdate data
        $query = "UPDATE buku SET judul_buku = '$judul_buku', id_pengarang = '$id_pengarang', id_penerbit = '$id_penerbit', id_kategori = '$id_kategori', stok = $stok, berat = $berat, harga = $harga, deskripsi = '$deskripsi' WHERE id_buku = '$id_buku'";

        // menjalankan query update data
        if (mysqli_query($con, $query))
        {
            header("Location:../table_buku.php");
        }
        else
        {
            $error = urldecode("Update gagal dijalankan");
            header("Location:../table_buku.php?error=$error");
        }
    }

    mysqli_close($con);
?>
