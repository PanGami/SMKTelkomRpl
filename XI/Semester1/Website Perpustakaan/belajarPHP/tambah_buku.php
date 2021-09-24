<!DOCTYPE html>
<html>
    <head>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KyZXEAg3QhqLMpG8r+8fhAXLRk2vvoC2f3B09zVXn8CA5QIVfZOJ3BCsw2P0p/We" crossorigin="anonymous">
    <a style="display:block;width:max" class="btn btn-primary" href="./buku.php">Click Disini Untuk Menuju Rak Buku</a>
    <title>Tambah Buku</title>
    </head>
    <body>        
        <h3>Tambah Buku</h3>        
        <form action="proses_tambah_buku.php" method="post" enctype="multipart/form-data">
            Nama Buku :
            <input type="text" name="nama_buku" value="" class="form-control">
            Deskripsi : 
            <input type="text" name="deskripsi" value="" class="form-control">                        
            Foto / Gambar :
            <input type="file" name="file" class="form-control">
            <br>          
            <input type="submit" name="simpan" value="Confirm" class="btn btn-primary" style="float:left">
        </form>
        <a href="tambah_buku.php" class="btn btn-danger" >Clear Data</a>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-U1DAWAznBHeqEIlVSCgzq+c9gqGAJn5c/t99JyeKa9xxaYpSvHU5awsuZVVFIhvj" crossorigin="anonymous"></script>
    </body>
</html>