package Metic;
import java.util.Scanner; //import Scanner dari library

public class tanggal28Jan2020 {
    public static void main(String[]args){
        int keluar;
        Scanner input = new Scanner(System.in); 
        // try catch agar ketika terjadi exception program tetap tidak error
        try{    
            // do while adalah untuk mengulangi program sesuai keinginan
            do{
                
                System.out.println("Inputkan total permen!");
                int totalPermen = input.nextInt();
                if(totalPermen % 2 == 0){ //jika total permen ganjil atau genap
                    System.out.println("Bisa dibagi sama rata");
                }else{
                    System.out.println("Tidak bisa dibagi sama rata");
                }
                
                System.out.println("Apakah ingin lanjut? jika ya input 1");
                keluar = input.nextInt();
                }while(keluar == 1); // untuk menentukan program berlanjut/tidak                        
            }catch(Exception e){ // info exception dimasukkan ke variable e
                System.out.println("Terjadi kesalahan! \n info : " + e);            
        }
    }
}
