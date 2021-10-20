package UKLPertama;
// SISTEM TERTUTUP <<<<<<<<<<<<<<<<<<<<<<<<
import java.util.Scanner;
public class JenisVariasiTiga {
    public static void main(String[] args) {
        try{
            int total = 0;
            Scanner input = new Scanner(System.in);        
            System.out.println("Masukkan id Anda :");
            int id = input.nextInt();
            System.out.println("Masukkan daerah masuk Tol :");
            String masuk = input.next();
            System.out.println("Masukkan daerah keluar Tol :");
            String keluar = input.next();
            System.out.println("Masukkan Gol. Kendaraan : (Angka biasa)");
            int gol = input.nextInt();

            switch(masuk){
                case "Waru":                    
                    switch(keluar){
                        case "Sidoarjo":
                            if(gol==1) total+=6000;
                            else if(gol==2||gol==3) total+=9000;
                            else if(gol==4||gol==5) total+=12000;
                            else throw new Exception("TERDAPAT KESALAHAN PADA CASE WARU-SIDOARJO!");
                            break;
                        case "Porong":
                            if(gol==1) total+=9000;
                            else if(gol==2||gol==3) total+=14000;
                            else if(gol==4||gol==5) total+=18500;
                            else throw new Exception("TERDAPAT KESALAHAN PADA CASE WARU-PORONG!");
                            break;
                    }
                    break;
                case "Sidoarjo":                    
                    switch(keluar){
                        case "Waru":
                            if(gol==1) total+=6000;
                            else if(gol==2||gol==3) total+=9000;
                            else if(gol==4||gol==5) total+=12000;
                            else throw new Exception("TERDAPAT KESALAHAN PADA CASE SIDOARJO-WARU!");
                            break;
                        case "Porong":
                            if(gol==1) total+=5500;
                            else if(gol==2||gol==3) total+=8500;
                            else if(gol==4||gol==5) total+=11500;
                            else throw new Exception("TERDAPAT KESALAHAN PADA CASE SIDOARJO-PORONG!");
                            break;
                    }
                    break;
                case "Porong":                    
                    switch(keluar){
                        case "Sidoarjo":
                            if(gol==1) total+=5500;
                            else if(gol==2||gol==3) total+=8500;
                            else if(gol==4||gol==5) total+=11500;
                            else throw new Exception("TERDAPAT KESALAHAN PADA CASE PORONG-SIDOARJO!");
                            break;
                        case "Waru":
                            if(gol==1) total+=9000;
                            else if(gol==2||gol==3) total+=14000;
                            else if(gol==4||gol==5) total+=18500;
                            else throw new Exception("TERDAPAT KESALAHAN PADA CASE PORONG-WARU!");
                            break;
                    }
                    break;
                default:
                    throw new Exception("TERDAPAT KESALAHAN PADA SWITCH CASE MASUK");
            }
            
            System.out.println("\t====== Print Out Info ======");
            System.out.println("ID Pelanggan         \t:" + id);
            System.out.println("GOL. Kendaraan       \t:" + gol);            
            System.out.println("Daerah Masuk         \t:" + masuk);                       
            System.out.println("Daerah Keluar        \t:" + keluar);
            System.out.println("Total Tagihan        \t:" + total);
            
        }catch(Exception e){System.err.println(e);}                            
    }
}
