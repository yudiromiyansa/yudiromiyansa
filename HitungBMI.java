package example.com.kalkulatorbmi;

public class HitungBMI {

    public String hitungBMI(double beratBadan, double tinggiBadan){
        String statusBadan;
        double BMI = beratBadan/(tinggiBadan*tinggiBadan);
        if(BMI<18.5){
            statusBadan = "Anda kekurangan berat badan.";
        } else if(BMI >= 18.5 && BMI <= 24.9){
            statusBadan = "Berat badan anda normal (Ideal).";
        } else if(BMI >= 25 && BMI <= 29.9){
            statusBadan = "Anda Kelebihan berat Badan.";
        } else{
            statusBadan = "Anda kegemukan (Obesitas).";
        }
        return statusBadan;
    }
}
