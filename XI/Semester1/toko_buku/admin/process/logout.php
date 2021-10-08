<?php

session_start();

if($_SESSION['id_customer'] == "")
{
    session_destroy();

    header('location:../index.php');
}
else
{
    session_destroy();

    header('location:../../index.php');
}


?>