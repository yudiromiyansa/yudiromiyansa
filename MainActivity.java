package example.com.kalkulatorbmi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    HitungBMI hitungBMI = new HitungBMI(); // membuat object dari class HitungBMI (Konsep OOP Biasa)

    EditText txtBeratBadan, txtTinggiBadan; // deklarasi object bernama txtBeratBadan dan txtTinggiBadan yang merupakan EditText
    TextView txtStatusBadan; //Deklarasi object bernama txtStatusBadan yang merupakan TextView
    Button btnCekBMI; //Deklarasi object bernama btnCekBMI yang merupakan Button

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtBeratBadan = findViewById(R.id.txtBeratBadan); //Menyambungkan elemen dengan id txtBeratBadan yang ada di activity_main.xml kesini
        txtTinggiBadan = findViewById(R.id.txtTinggiBadan);// Menyambungkan elemen dengan id txtTinggi Badan yang ada di activity_main.xml kesini
        txtStatusBadan = findViewById(R.id.txtStatusBadan); // Menyambungkan elemen dengan id txtStatusBadan yang ada di activity_main.xml ke sini
        btnCekBMI = findViewById(R.id.btnCekBMI); // Menyambungkan elemen dengan id btnCekBMI

        //btnCekBMI.setOnClickListener dibawah ini maksudnya adalah untuk me-listen (mengamati) btnCekBMI apakah ada click, apabila ada click, maka code didalamnya akan dieksekusi
        btnCekBMI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                String stringBeratBadan = txtBeratBadan.getText().toString(); // Mengambil value yang ada di EditText txtBeratBadan dan dimasukan ke variabel string BeratBadan
                String stringTinggiBadan = txtTinggiBadan.getText().toString(); // Mengambil value yang ada di

                //Pada 2 baris code di atas, hasil yang didapatkan dari EditText adalah berbentuk STRING (defaultnya memang string)
                //Sedangkan yang kita butuhkan adalah berbentuk double, maka kita convert dulu 2 string tersebut ke tipe data double
                double beratBadan = Double.parseDouble(stringBeratBadan);
                double tinggiBadan = Double.parseDouble((stringTinggiBadan));

                String statusBadan = hitungBMI.hitungBMI(beratBadan, tinggiBadan); //Mengeksekusi method hitungBMI yang ada di class HitungBMI, karena method hitungBMI me-return string StatusBadan, maka hasil dari eksekusi method ini kita masukkan ke string statusBadan
                txtStatusBadan.setText(statusBadan); // //men-set tulisan yang ada di TextView sesuai dengan hasil dari perhitungan BMI (yaitu ada di string statusBadan)
            }

        });

    }
}
