package Metic;
import java.util.Scanner;

public class BilanganPrima {
 
 public static void main (String args []){
     String check;
     do{
        System.out.print("Silakan masukkan angka yang akan di cek: ");   
        Scanner input = new Scanner(System.in);
        int angka = input.nextInt();
  
        int temp;
        boolean prima = true;
  
        //penggunaan for loop
        for(int pembagi = 2; pembagi <= angka / 2; pembagi++){
        temp = angka % pembagi;
        if(temp == 0){
        prima = false;
        break;
   }
  }
  
  /*
   Jika prima adalah true dan angka yang diberikan user
   bukanlah 0 dan 1
   */
  
  if(prima && (angka > 1)){
   System.out.println("==>  " + angka + " adalah bilangan prima");
  }else{
   System.out.println("==>  " + angka + " bukanlah bilangan prima");
  }
  
    System.out.print("Apakah anda ingin lanjut? jika iya ketik y : ");
    check = input.next();
    System.out.println("=================================");
  }while(check.equalsIgnoreCase("y"));
  
 }

}
