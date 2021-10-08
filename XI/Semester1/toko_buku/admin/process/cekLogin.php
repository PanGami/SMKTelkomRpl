<?php
    include '../../helper/connection.php';
    
	$username=$_POST['username'];
    $password=$_POST['password'];
     
	$login = "SELECT * from user where username='$username' AND password='$password'";
	
	$login_query = mysqli_query($con,$login);
	$data = mysqli_fetch_array($login_query);

	$row = mysqli_fetch_assoc($login_query);
	
	if($data)
	{
		session_start();
		$_SESSION['username'] = $data['username'];
		$_SESSION['password'] = $data['password'];
		$_SESSION['id_customer'] = $data['id_customer'];
		$_SESSION['tipe_user'] = $data['tipe_user'];

		if($data['tipe_user'] == "Admin")
		{
			header('location:../dashboard.php');
		}
		else
		{
			header('location:../../index.php');
		}
	}
	else
	{
		echo "
		<script type='text/javascript'>
		alert('Username atau Password anda salah!')
		window.location='../index.php';
		</script>";
	}
?>