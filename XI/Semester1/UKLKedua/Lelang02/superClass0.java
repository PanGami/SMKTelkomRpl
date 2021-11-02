package UKL_Kedua.Lelang02;
import java.util.Scanner;

public class superClass0 {
    Scanner input = new Scanner(System.in);
    String pesan = "Press Enter to Continue : ";
    superClass0(String param){        
        System.out.println(this.pesan + param);
        String kosongan = input.nextLine();
    }    
}
