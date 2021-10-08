<?php
include '../helper/connection.php';
session_start();

if($_SESSION['id_customer'] == '')
{
    header('location:../admin/index.php');
}
else
{
    $tampilkan_isi = "select count(id_transaksi) as jumlah from transaksi";
    $tampilkan_isi_sql = mysqli_query($con,$tampilkan_isi);
    $no = 1;
    while ($isi = mysqli_fetch_array($tampilkan_isi_sql))
    {
        $no=$no+$isi['jumlah'];
    }

    foreach ($_SESSION["keranjang"] as $id_buku => $jumlah) 
    {
        $ambil = $con->query("SELECT * FROM buku WHERE id_buku='$id_buku'");
        $pecah = $ambil->fetch_assoc();
        $id_buku = $pecah["id_buku"];
        $subharga =$pecah["harga"]*$jumlah;
        $id_customer = $_SESSION['id_customer'];

        $query = $con->query("INSERT INTO transaksi (id_transaksi, id_customer, id_buku, tgl_transaksi, jumlah, total) VALUES ('TR-$no', '$id_customer','$id_buku',now(), $jumlah, $subharga)");
        
        if($query)
        {
            $newqty = $pecah['stok'] - $jumlah;
            $con->query("UPDATE buku SET stok = $newqty WHERE id_buku = '$id_buku'");
        }
        else
        {
            echo "<script>alert('tranksaksi gagal!');</script>";
        }

        $no++;
    }

    unset($_SESSION['keranjang']);
    unset($_SESSION['nomor']);
    header('location:../order.php');
}
?>