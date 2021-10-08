<?php include('../../../helper/connection.php'); ?>

<!DOCTYPE html>
<html lang="en">

<head>
    <!-- Required meta tags-->
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="Colorlib Templates">
    <meta name="author" content="Colorlib">
    <meta name="keywords" content="Colorlib Templates">

    <!-- Title Page-->
    <title>Register</title>

    <!-- Icons font CSS-->
    <link href="vendor/mdi-font/css/material-design-iconic-font.min.css" rel="stylesheet" media="all">
    <link href="vendor/font-awesome-4.7/css/font-awesome.min.css" rel="stylesheet" media="all">
    <!-- Font special for pages-->
    <link href="https://fonts.googleapis.com/css?family=Poppins:100,100i,200,200i,300,300i,400,400i,500,500i,600,600i,700,700i,800,800i,900,900i"
        rel="stylesheet">

    <!-- Vendor CSS-->
    <link href="vendor/select2/select2.min.css" rel="stylesheet" media="all">
    <link href="vendor/datepicker/daterangepicker.css" rel="stylesheet" media="all">

    <!-- Main CSS-->
    <link href="css/main.css" rel="stylesheet" media="all">
</head>

<body>
    <div class="page-wrapper bg-gra-02 p-t-130 p-b-100 font-poppins">
        <div class="wrapper wrapper--w680">
            <div class="card card-4">
                <div class="card-body">
                    <h2 class="title">Registrasi</h2>
                    <form action="process/add_data.php" method="POST">
                    <?php 
                        $tampilkan_isi = "select count(id_customer) as jumlah from customer;";
                        $tampilkan_isi_sql = mysqli_query($con,$tampilkan_isi);
                        $no = 1;
                    
                        while ($isi = mysqli_fetch_array($tampilkan_isi_sql))
                        {
                        $jumlah = $isi['jumlah'];
                        ?>

                                <input type="hidden" name="id_customer" value="CUS-<?php echo $no+$jumlah; ?>">

                        <?php } ?>
                        <div class="input-group">
                            <label class="label">Nama</label>
                            <div class="rs-select2 js-select-simple select--no-search">
                                <input class="input--style-4" type="text" name="nama_customer">
                            </div>
                        </div>
                        <div class="row row-space">
                            <div class="col-4">
                                <div class="input-group">
                                    <label class="label">Jenis Kelamin</label>
                                    <div class="p-t-10">
                                        <label class="radio-container m-r-45">Laki-Laki
                                            <input type="radio" name="jk_customer" value="Laki-Laki">
                                            <span class="checkmark"></span>
                                        </label>
                                        <label class="radio-container">Perempuan
                                            <input type="radio" name="jk_customer" value="Perempuan">
                                            <span class="checkmark"></span>
                                        </label>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="input-group">
                            <label class="label">Alamat</label>
                            <div class="rs-select2 js-select-simple select--no-search">
                                <textarea name="alamat_customer" cols="50" rows="5" class="input--style-4"></textarea>
                            </div>
                        </div>
                        <div class="row row-space">
                            <div class="col-2">
                                <div class="input-group">
                                    <label class="label">Email</label>
                                    <input class="input--style-4" type="email" name="email_customer">
                                </div>
                            </div>
                            <div class="col-2">
                                <div class="input-group">
                                    <label class="label">Phone Number</label>
                                    <input class="input--style-4" type="number" name="telp_customer">
                                </div>
                            </div>
                        </div>
                        <div class="row row-space">
                            <div class="col-2">
                                <div class="input-group">
                                    <label class="label">Username</label>
                                    <input class="input--style-4" type="text" name="username">
                                </div>
                            </div>
                            <div class="col-2">
                                <div class="input-group">
                                    <label class="label">Password</label>
                                    <input class="input--style-4" type="password" name="password">
                                </div>
                            </div>
                        </div>
                        <div class="p-t-15 center justify-content-center">
                            <button class="btn btn--radius-2 btn--blue btn-block" type="submit">Submit</button>
                            <br><br>
                            <div><a href="../../index.php">Sudah punya akun?</a></div>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </div>

    <!-- Jquery JS-->
    <script src="vendor/jquery/jquery.min.js"></script>
    <!-- Vendor JS-->
    <script src="vendor/select2/select2.min.js"></script>
    <script src="vendor/datepicker/moment.min.js"></script>
    <script src="vendor/datepicker/daterangepicker.js"></script>

    <!-- Main JS-->
    <script src="js/global.js"></script>

</body><!-- This templates was made by Colorlib (https://colorlib.com) -->

</html>
<!-- end document-->