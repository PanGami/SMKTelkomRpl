<?php
session_start();
require_once("koneksi.php");
// Jika sesi dari login belum dibuat maka akan kita kembalikan ke halaman login
if(!isset($_SESSION['username'])){
    header("location: login.php");
}else{
    // Jika sudah dibuatkan sesi maka akan kita masukkan kedalam variabel
    $username = $_SESSION['username'];
}
?>

<html>
    <head>
    <link rel="stylesheet" type="text/css" href="./Styles/index.css">  
        <title>UKL Pembayaran SPP</title>
    </head>
<body>
<!-- Kita akan panggil menu navigasi -->
<?php require_once("header.php"); ?>

<div class="main">
  <div id="wrapper">
    <div class="content-holder">
      <div class="hero-wrap fl-wrap full-height scroll-con-sec">
        
        <div class="impulse-wrap">
          <div class="mm-par-wrap">
            <div class="mm-parallax" data-tilt data-tilt-max="4" >
              <div class="overlay"></div>
              <div class="bg" data-bg="https://images.unsplash.com/photo-1499018658500-b21c72d7172b?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1500&q=80" style="background-image: url(https://images.unsplash.com/photo-1499018658500-b21c72d7172b?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1500&q=80);">
                
              </div>
              
              <div class="hero-wrap-item fl-wrap">
                <div class="container"><div class="fl-wrap section-entry hiddec-anim" style="opacity: 1; ">
                 <h1 class="BoardName">Selamat datang <?=$username; ?></h1>
                  
                  </div></div></div>
              
            </div>
            
          </div>
        </div>
        
        <div class="hero-corner hiddec-anim" style="opacity: 1; transform: translate3d(0px, 0px, 0px);"></div>
        
        <div class="hero-corner2 hiddec-anim" style="opacity: 1; transform: translate3d(0px, 0px, 0px);"></div>
        
        <div class="hero-corner3 hiddec-anim" style="opacity: 1; transform: translate3d(0px, 0px, 0px);"></div>
        
        <div class="hero-corner4 hiddec-anim" style="opacity: 1; transform: translate3d(0px, 0px, 0px);"></div>
        
        
      </div>
    </div>
  </div>
  
</div>
<?php require_once("footer.php"); ?>
<script src='https://cdnjs.cloudflare.com/ajax/libs/tilt.js/1.2.1/tilt.jquery.min.js'></script>
<script src='https://cdnjs.cloudflare.com/ajax/libs/jquery/3.3.1/jquery.min.js'></script><script  src="./script.js"></script>
</body>
</html>