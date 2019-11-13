
import persegi;
import kubus;
import java.util.Scanner;

public class Main
{
    
    public static void main(String[] args)
    {
        double inLuas, inVolume;
        
        Scanner inPut = new Scanner(System.in);
        
        // Buat objek dari persegi
        persegi luas = new persegi();
        luas.setSisi(inLuas);
        
        // Buat objek dari kubus
        kubus volume = new kubus();
        volume.setSisi(inVolume);
        
        //input
        System.out.print("Masukan nilai luas   : ");
        inLuas = inPut.nextInt();
        
        System.out.print("Masukan nilai volume : ");
        inVolume = inPut.nextInt();
        
        //output
        System.out.println("Nilai Persegi adalah " + inLuas);
        System.out.println("Nilai Persegi adalah " + luas.getLuas());
        
        System.out.println("Volume Kubus adalah " + inVolume);
        System.out.println("Volume Kubus adalah " + volume.getVolume());
        
        
    }
    
}
