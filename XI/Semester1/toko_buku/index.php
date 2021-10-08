<!DOCTYPE html>
<html lang="en">

<head>
	<title>1st Bookstore for Pancalians</title>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="description" content="Sublime project">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="stylesheet" type="text/css" href="styles/bootstrap4/bootstrap.min.css">
	<link href="plugins/font-awesome-4.7.0/css/font-awesome.min.css" rel="stylesheet" type="text/css">
	<link rel="stylesheet" type="text/css" href="plugins/OwlCarousel2-2.2.1/owl.carousel.css">
	<link rel="stylesheet" type="text/css" href="plugins/OwlCarousel2-2.2.1/owl.theme.default.css">
	<link rel="stylesheet" type="text/css" href="plugins/OwlCarousel2-2.2.1/animate.css">
	<link rel="stylesheet" type="text/css" href="styles/main_styles.css">
	<link rel="stylesheet" type="text/css" href="styles/responsive.css">
	<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.6.1/css/all.css" integrity="sha384-gfdkjb5BdAXd+lj+gudLWI+BXq4IuLW5IT+brZEZsLFm++aCMlF1V92rMkPaX4PP"
	 crossorigin="anonymous">
	<link href='images/logo.png' rel='SHORTCUT ICON' />
</head>

<?php 
include 'helper/connection.php';
session_start(); 

$id_customer = $_SESSION['id_customer'];
$query = "SELECT * from customer where id_customer = '$id_customer'";

$result = mysqli_query($con, $query);
$row = mysqli_fetch_assoc($result);

$nama = $row['nama_customer'];

?>

<body>

	<div class="super_container">

		<!-- Header -->

		<header class="header">
			<div class="header_container">
				<div class="container">
					<div class="row">
						<div class="col">
							<div class="header_content d-flex flex-row align-items-center justify-content-start">
								<div class="logo" style = "padding-right:30px"><a href="index.php">PanBuku.ID</a></div>
								<!-- <?php
									include './admin/process/cekLogin.php';
									if($data){ ?>										
										<a style = "float:left; height:50px;;width:100px" href="./admin/index.php" class="btn btn-primary btn-lg active" role="button" aria-pressed="true">Logout</a>
										<?php
									}else{ ?>
										<a style = "float:left; height:50px;;width:100px" href="./admin/process/logout.php" class="btn btn-danger btn-lg active" role="button" aria-pressed="true">Logout</a>
										<?php
									}
								?> -->
								<nav class="main_nav">
									<ul>									
										<li class="active"><a href="index.php">Home</a>
										<li class="hassubs">
											<a>Kategori</a>
											<ul>
												<?php
													$query = 
													"SELECT * from kategori order by nama_kategori";
													
													$result = mysqli_query($con, $query);

													if (mysqli_num_rows($result) > 0)
													{
														$index = 1;

														while($row = mysqli_fetch_assoc($result))
														{
															$id_kategori = $row['id_kategori'];
															echo "
																<li><a href='categories.php?id_kategori=$id_kategori'>".$row['nama_kategori']."</a></li>
															";
														}
													}
												?>
											</ul>
										</li>
										<?php if($id_customer != ""){ ?>
										<li><a href="order.php">My Order</a></li>
										<?php } ?>
									</ul>
								</nav>
								<div class="header_extra ml-auto">
									<div class="shopping_cart">
										<a href="cart.php">
											<svg version="1.1" xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink" x="0px" y="0px"
											 viewBox="0 0 489 489" style="enable-background:new 0 0 489 489;" xml:space="preserve">
												<g>
													<path d="M440.1,422.7l-28-315.3c-0.6-7-6.5-12.3-13.4-12.3h-57.6C340.3,42.5,297.3,0,244.5,0s-95.8,42.5-96.6,95.1H90.3
													c-7,0-12.8,5.3-13.4,12.3l-28,315.3c0,0.4-0.1,0.8-0.1,1.2c0,35.9,32.9,65.1,73.4,65.1h244.6c40.5,0,73.4-29.2,73.4-65.1
													C440.2,423.5,440.2,423.1,440.1,422.7z M244.5,27c37.9,0,68.8,30.4,69.6,68.1H174.9C175.7,57.4,206.6,27,244.5,27z M366.8,462
													H122.2c-25.4,0-46-16.8-46.4-37.5l26.8-302.3h45.2v41c0,7.5,6,13.5,13.5,13.5s13.5-6,13.5-13.5v-41h139.3v41
													c0,7.5,6,13.5,13.5,13.5s13.5-6,13.5-13.5v-41h45.2l26.9,302.3C412.8,445.2,392.1,462,366.8,462z" />
												</g>
											</svg>
											<div>Cart<span>(
													<?php if(isset($_SESSION["nomor"])){ echo $_SESSION["nomor"]; } else{ echo 0;} ?>)</span></div>
										</a>
									</div>									
								</div>								
							</div>
						</div>
					</div>
				</div>
			</div>

			<div class="header_social">
				<nav class="main_nav">
					<ul>
						<?php if($id_customer == ""){ ?>
						<li><a href="admin/index.php">Login</a>
							<?php }  
						else 
						{?>
						<li class="hassubs">
							<a>Hi!
								<?php echo $nama ?></a>
							<ul>
								<li><a href="admin/process/logout.php">Logout</a></li>
							</ul>
						</li>
						<?php } ?>
					</ul>
				</nav>
			</div>
		</header>

		<!-- Menu -->

		<div class="menu menu_mm trans_300">
			<div class="menu_container menu_mm">
				<div class="page_menu_content">

					<div class="page_menu_search menu_mm">
						<form action="#">
							<input type="search" required="required" class="page_menu_search_input menu_mm" placeholder="Search for products...">
						</form>
					</div>
					<ul class="page_menu_nav menu_mm">
						<li class="page_menu_item menu_mm">
							<a href="index.php">Home</a>
						</li>
						<li class="page_menu_item has-children menu_mm">
							<a href="categories.html">Kategori<i class="fa fa-angle-down"></i></a>
							<ul class="page_menu_selection menu_mm">
								<?php
									$query = 
									"SELECT * from kategori order by nama_kategori";
									
									$result = mysqli_query($con, $query);

									if (mysqli_num_rows($result) > 0)
									{
										$index = 1;

										while($row = mysqli_fetch_assoc($result))
										{
											$id_kategori = $row['id_kategori'];
											echo "
												<li class='page_menu_item menu_mm'><a href='categories.php?id_kategori=$id_kategori'>".$row['nama_kategori']."</a></li>
											";
										}
									}
								?>
							</ul>
						</li>
						<?php if($id_customer == ""){ ?>
						<li class="page_menu_item menu_mm">
							<a href="admin/index.php">Login</a>
						</li>
						<?php }  
						else 
						{?>
						<li class="page_menu_item has-children menu_mm">
							<a href="categories.html">
								<?php echo $nama; ?><i class="fa fa-angle-down"></i></a>
							<ul class="page_menu_selection menu_mm">
								<li class='page_menu_item menu_mm'><a href='admin/process/logout.php'>Logout</a></li>
							</ul>
						</li>
						<?php } ?>
					</ul>
				</div>
			</div>
		</div>

		<!-- Home -->

		<div class="home">
			<div class="home_slider_container">

				<!-- Home Slider -->
				<div class="owl-carousel owl-theme home_slider">

					<!-- Slider Item -->
					<div class="owl-item home_slider_item">
						<div class="home_slider_background" style="background-image:url(./images/main.jpg)"></div>
						<div class="home_slider_content_container">
							<div class="container">
								<div class="row">
									<div class="col">
										<div class="home_slider_content" data-animation-in="fadeIn" data-animation-out="animate-out fadeOut">
											<div class="home_slider_title">
												<font size="5px">Toko Buku Lengkap</font><br>Tugas Panca.
											</div>
											<div class="home_slider_subtitle">Selamat Datang di PanBuku.ID</div>
											<div class="button button_light home_button"><a href="#produk">
													<font color="black">Beli Sekarang</font>
												</a></div>
										</div>
									</div>
									<div class="col">
										<div class="home_slider_content" data-animation-in="fadeIn" data-animation-out="animate-out fadeOut">
											<div class="home_slider_title">
												<font size="5px">Se Indonesia</font><br>PHP Native.
											</div>
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>
					<div class="owl-item home_slider_item">
						<div class="home_slider_background" style="background-image:url(./images/cover.jpg)"></div>
						<div class="home_slider_content_container">
							<div class="container">
								<div class="row">
									<div class="col">
										<div class="home_slider_content" data-animation-in="fadeIn" data-animation-out="animate-out fadeOut">
											<div class="home_slider_title" style="color:white">
												<font size="5px">Buku Antik</font><br>Tugas Panca.
											</div>
											<div class="home_slider_subtitle">Hanya di PanBuku.ID</div>
											<div class="button button_light home_button" style="color:white"><a href="#produk">
													<font color="gold">Beli Sekarang</font>
												</a></div>
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>
					<div class="owl-item home_slider_item">
						<div class="home_slider_background" style="background-image:url(./images/cover.jpg)"></div>
						<div class="home_slider_content_container">
							<div class="container">
								<div class="row">
									<div class="col">
										<div class="home_slider_content" data-animation-in="fadeIn" data-animation-out="animate-out fadeOut">
											<div class="home_slider_title" style="color:white">
												<font size="5px">Space Iklan</font><br>Masukkan Iklan Anda Disini!
											</div>
											<div style="color:gold" class="home_slider_subtitle">Hubungi 081216012735</div>											
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>

			</div>
		</div>

		<!-- Products -->
		<section id="produk">
			<div class="products">
				<div class="container">
					<div class="row">
						<div class="col">

							<div class="product_grid" style="width:auto;height:420px">
								<?php
								$query = 
								"select * from buku b,pengarang p
								where b.id_pengarang = p.id_pengarang";
								
								$result = mysqli_query($con, $query);

								if (mysqli_num_rows($result) > 0)
								{
									$index = 1;

									while($row = mysqli_fetch_assoc($result))
									{
										$id_buku = $row['id_buku'];
										echo "
										<div class='product'>
										<a href='product.php?id_buku=$id_buku'>
											<div class='product_image'><img src='images/". $row['gambar'] ."' alt=''></div>
											<div class='product_content'>
												<div class='product_title'>".$row['judul_buku']."</a></div>
												<div class='product_price'>Rp.".$row['harga'].",-</div>
												<br>
												<div class='nmpengarang'>".$row['nama_pengarang']."</div>
											</div>
										</div>
										";
									}
								}
                            ?>

							</div>

						</div>
					</div>
				</div>
			</div>
		</section>

		<!-- Icon Boxes -->

		<div class="icon_boxes">
			<div class="container">
				<div class="row icon_box_row">

					<!-- Icon Box -->
					<div class="col-lg-4 icon_box_col">
						<div class="icon_box">
							<div class="icon_box_image"><img src="images/icon_1.svg" alt=""></div>
							<div class="icon_box_title">Gratis Ongkir Se-Jawa</div>
							<div class="icon_box_text">
								<p>Gratis Ongkir Area Kota Blitar Non Minimum Selama Periode Mei 2075.</p>
							</div>
						</div>
					</div>

					<!-- Icon Box -->
					<div class="col-lg-4 icon_box_col">
						<div class="icon_box">
							<div class="icon_box_image"><img src="images/icon_2.svg" alt=""></div>
							<div class="icon_box_title">Gratis Pengembalian</div>
							<div class="icon_box_text">
								<p>Khawatir buku tidak cocok? Jangan khawatir, karena apapun alasannya retur di PanBuku.id gratis & mudah!</p>
							</div>
						</div>
					</div>

					<!-- Icon Box -->
					<div class="col-lg-4 icon_box_col">
						<div class="icon_box">
							<div class="icon_box_image"><img src="images/icon_3.svg" alt=""></div>
							<div class="icon_box_title">24 Jam Customer Service</div>
							<div class="icon_box_text">
								<p>Hubungi Kami di 00000000</p>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>

		<!-- Footer -->

		<div class="footer_overlay"></div>
		<footer class="footer">
			<div class="footer_background" style="background-image:url(images/main-footer.jpg)"></div>
			<div class="container">
				<div class="row">
					<div class="col">
						<div class="footer_content d-flex flex-lg-row flex-column align-items-center justify-content-lg-start justify-content-center">
							<div class="footer_logo"><a href="index.php">PanBuku.ID</a></div>
							<div class="copyright ml-auto mr-auto">
								<!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->
								Copyright &copy;<script>
									document.write(new Date().getFullYear());
								</script> All rights reserved | PanBuku.id <br>
								<a href="https://colorlib.com" target="_blank">Colorlib</a>
								<!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->
							</div>
						</div>
					</div>
				</div>
			</div>
		</footer>
	</div>

	<script src="js/jquery-3.2.1.min.js"></script>
	<script src="styles/bootstrap4/popper.js"></script>
	<script src="styles/bootstrap4/bootstrap.min.js"></script>
	<script src="plugins/greensock/TweenMax.min.js"></script>
	<script src="plugins/greensock/TimelineMax.min.js"></script>
	<script src="plugins/scrollmagic/ScrollMagic.min.js"></script>
	<script src="plugins/greensock/animation.gsap.min.js"></script>
	<script src="plugins/greensock/ScrollToPlugin.min.js"></script>
	<script src="plugins/OwlCarousel2-2.2.1/owl.carousel.js"></script>
	<script src="plugins/Isotope/isotope.pkgd.min.js"></script>
	<script src="plugins/easing/easing.js"></script>
	<script src="plugins/parallax-js-master/parallax.min.js"></script>
	<script src="js/custom.js"></script>
</body>

</html>