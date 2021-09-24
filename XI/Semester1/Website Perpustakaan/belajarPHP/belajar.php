<?php
    $nama = "pancaNW";
    echo ("Halo,namaku ".$nama);
?>
<hr>
<?php
    if($nama == "panca"){
        echo"Halo, namaku ".$nama;
    }else{
        echo"ppppppp";
    }
?>
<hr>
<?php
    switch($nama){
        case "panca" :
            echo"Halo, namaku ".$nama;
        case "pancaa" :
            echo"pppppppp";
        default:
            echo"gada yg truw";
    }
?>
<hr>
<?php
    for($i = 1;$i<=5;$i++)echo nl2br("Ini diulang 5x!".$nama."\n");
    $p = 5;
    do{
        echo $p;
        $p--;
    }while($p>0);
?>
<hr>
<?php
    $nilai = 90;
    if($nilai > 90){
        echo"A+ Nilainya :".$nilai;
    }elseif($nilai >80 ){
        echo"A Nilainya :".$nilai;
    }elseif($nilai >70 ){
        echo"B+ Nilainya :".$nilai;
    }elseif($nilai >60 ){
        echo"B Nilainya :".$nilai;
    }elseif($nilai >50 ){
        echo"C+ Nilainya :".$nilai;
    }elseif($nilai >40 ){
        echo"C Nilainya :".$nilai;
    }elseif($nilai >30 ){
        echo"D Nilainya :".$nilai;
    }elseif($nilai <=30 ) echo"E Nilainya :".$nilai;    
?>
<hr>
<?php
    function testFunc(){
        echo("Function TEST");
    }
    testFunc();
?>
<hr>
<?php
    // $a = array(
    //     array(
    //         array(-7, 5),
    //         array(4, 8),
    //     ),
    // );
    // $b = array(
    //     array(
    //         array(1, 1),
    //         array(-4, 9),
    //     ),
    // );
    for($i=0;$i<2;$i++){
        for($j=0;$j<2;$j++){
            // echo($a[$i][$j] - $b[$i][$j]);
        }
        echo nl2br("\n");
    }

    $array = ["test1","test2","test3"];
    foreach($array as $t) echo$t;
?>