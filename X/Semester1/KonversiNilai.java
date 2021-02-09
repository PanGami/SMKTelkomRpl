import java.util.Scanner;
public class KonversiNilai {
    public static void main(String[]args){
        try{
            Scanner masukan = new Scanner(System.in);
        
        System.out.print("Masukan nilai WEB :");
        int nilai = masukan.nextInt();
        if (nilai >= 90)
            System.out.println("Nilai A");
        else if(nilai >= 75)
            System.out.println("Nilai B");
        else if(nilai >= 50)
            System.out.println("Nilai C");
        else if(nilai >= 35)
            System.out.println("Nilai D");
        else
            System.out.println("Nilai E");
        }catch(Exception e){
            System.out.println("Terjadi kesalahan !");
        }
    }
}
