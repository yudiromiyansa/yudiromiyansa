<?php
 $nama = $_POST["inputnama"];
 $produk = $_POST["inputproduk"];
 $jumlah = $_POST["inputjumlah"];

 switch($produk)
 {
     case "A":
        $namaproduk = "Roti Bakar";
        $harga = 15000;
        break;    
     case "B":
        $namaproduk = "Martabak";
        $harga = 25500;
        break;    
     default:
        $namaproduk = "Burger";
        $harga = 17500;
        break;    
 }
?>

<html>
    <head>
        <title>OUTPUTSI18B</title>

        <!-- Link CSS -->
        <link href="desain.css" rel="stylesheet" type="text/css" />
    </head>

    <body>
        <table width="90%" border="1" align="center" cellpadding="5" cellspacing="0">
            <tr>
                <td colspan="5" align="center">OUTPUT PERULANGAN WHILE SI 18B</td>
            </tr>
            
            <tr  id="untuk-judul-tabel">
                <td width="25%">Nama Pembeli</td>
                <td width="25%">Nama Pembeli</td>
                <td width="20%">Nama Pembeli</td>
                <td width="10%">Nama Pembeli</td>
                <td width="20%">Nama Pembeli</td>
            </tr>

            <?php
                
            ?>

            <tr>
                <td>1</td>
                <td>2</td>
                <td>3</td>
                <td>4</td>
                <td>5</td>
            </tr>

            <?php
                $x +=1;
              }   
            ?>
        
        </table>

    </body>
</html>