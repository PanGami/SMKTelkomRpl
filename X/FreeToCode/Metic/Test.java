package Metic;
//@author ME

import java.util.Scanner;
public class Test {
    
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
       Scanner coba = new Scanner (System.in);
       boolean poin = true;
    //   while(poin){  
           //ini input
           System.out.println("gg");
           Scanner input = new Scanner(System.in);
           System.out.print("masukkan angka :");
        
           //numeric input
           int a = input.nextInt();
        
           //proses
           String HA ="";
           System.out.print(a);
           int gg = a%2;
           if(gg == 0){
                HA = " adalah genap";
               //System.out.println(" adalah genap");
           }else{
                HA = " adalah ganjil";
               //System.out.println(" adalah ganjil");
          }
          
          System.out.println(HA);
          
          //untuk mengulang atau berhenti
        //   System.out.print("ulangi(Y/T)?  ");
        //   String jawab = coba.nextLine(); 
          
        //   if (jawab.equalsIgnoreCase("T")){
        //       poin = false;
        //   }
          
        // }
        
    }
}
    

