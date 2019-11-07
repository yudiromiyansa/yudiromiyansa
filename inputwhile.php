<!DOCTYPE html>
  <html>
    <head>
      <!--Import Google Icon Font-->
      <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
      <!--Import materialize.css-->
      <link type="text/css" rel="stylesheet" href="css/materialize.min.css"  media="screen,projection"/>

      <!--Let browser know website is optimized for mobile-->

      <!-- LINK CSS DESAIN -->
      <link href="desain.css" rel="stylesheet" type="text/css" />
      <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
    </head>

    <body>
    <form method="POST" action="outputwhile.php">
        <table width="85%" border="1" align="center" cellpadding="5" cellspacing="0">
            <tr id="untuk-warna-judul">
                <td colspan="2" align="center">INPUT MENGGUNAKAN WHILE</td>
            </tr>
            <tr>
                <td width="40%">Nama Pembeli</td>
                <td width="60%"><input type="text" name="inputnama" placeholder="Masukan nama pembeli" id="untuk-text-input"></td>
            </tr>
            <tr>
                <td>Nama Produk</td>
                <td>
                    <select name="inputproduk" id="untuk-select-input">
                        <option value="A">Roti Bakar (Rp. 15.000)</option>
                        <option value="B">Martabak (Rp. 25.500)</option>
                        <option value="C">Burger (Rp. 17.500)</option>
                    </select>
                </td>
            </tr>
            <tr>
                <td>Jumlah Beli :</td>
                <td><input type="text" name="inputjumlah" placeholder="Masukan Jumlah Beli" id="untuk-text-input" ></td>
            </tr>
            <tr>
                <td colspan="3" align="center">
                    <input type="submit" name="btntampil" value="tampil" id="untuk-tombol">
                    <input type="reset" name="btnreset" value="reset" id="untuk-tombol">
                </td>
            </tr>
        </table>


    </form>

      <!--JavaScript at end of body for optimized loading-->
      <script type="text/javascript" src="js/materialize.min.js"></script>
    </body>
  </html>