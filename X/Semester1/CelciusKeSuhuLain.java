import java.util.Scanner;
public class CelciusKeSuhuLain{
    public static void main (String[]args){
        
        //Inisialisasi 
        Scanner input = new Scanner(System.in);
        double c,r,f,k; //variabel
        
        System.out.print("Masukan Angka Suhu (Celsius) : ");
          c = input.nextInt(); //input suhu Celcius
          r = c * 4/5; // rumus reamur
          f = (c*9/5) + 32; //rumus farenfait
          k = c + 273.15; //rumus kelfin
        System.out.println("==============");
        System.out.println("Celsius = " + c + "°C");  
        System.out.println("Reamur = "  + r + "°R");    
        System.out.println("Fahrenheit = " + f + "°F"); 
        System.out.println("Kelvin = "  + k + "°K");     
    }
}
