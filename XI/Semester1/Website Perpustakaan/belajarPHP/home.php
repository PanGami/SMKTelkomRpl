<head>
 <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x" crossorigin="anonymous">
 <title>PERPUS PanBuku.ID</title>
</head>
<?php
 include "header.php";
?>
<h2>Selamat datang <?=$_SESSION['nama_siswa']?> di website Perpus 
Online.</h2>
<div class="home">

						<div class="home_slider_background" style="padding: 170px 0 200px 0;background-image:url(./images/index.jpg);">
							<div class="container" style="padding:50px 110px">
											<h5><font size="5px">Perpustakaan Lengkap</font><br></h5>											
											<h1><font size="15px">Tugas Panca PHP-00</font>.</h1>
											<br>Selamat Datang di PanBuku.ID
											<a class="btn btn-secondary" href="./buku.php" role="button">Pinjam Buku</a>
							</div>
						</div>

			<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-gtEjrD/SeCtmISkJkNUaaKMoLD0//ElJ19smozuHV6z3Iehds+3Ulb9Bn9Plx0x4" crossorigin="anonymous"></script>
		</div>
<?php
 include "footer.php";
?>