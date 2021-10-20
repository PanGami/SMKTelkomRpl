
package Metic;
import java.util.Scanner;

public class BilanganPrima {
 
 public static void main (String args []){
     int check;
     do{
  Scanner input = new Scanner(System.in);
  System.out.print("Silakan masukkan angka yang akan di cek: ");
  
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
  
  if(prima && ((angka > 0)&&(angka != 1))){
   System.out.println(angka + " adalah bilangan prima");
  }else{
   System.out.println(angka + " bukanlah bilangan prima");
  }
  
    System.out.println("Apakah anda ingin lanjut? /n jika iya ketik 1 ");
    check = input.nextInt();
  }while(check == 1);
 }

}