package UKLPertama;
import java.util.Scanner;
public class JenisVariasiSoalEmpat {
    public static void main(String[] args) {
        try{
            int total=0;
            String[]pelanggan={"Ali","Budi","Dani","Edi","Umar"};
            Scanner input = new Scanner(System.in);

            System.out.println("Masukkan ID Pelanggan !");
            int id = input.nextInt();
            System.out.println("Masukkan Tipe Cottage !");
            String cott = input.next();
            System.out.println("Memesan Ketika Gol. Hari apa?");
            String hari = input.next();
            System.out.println("Berapa lama waktu anda menginap? (Hari)");
            int waktu = input.nextInt();


            switch(hari){
                case "Weekday":
                    if(cott.equalsIgnoreCase("Duku") || cott.equalsIgnoreCase("Jeruk")){
                        total+=915000;
                    }else if(cott.equalsIgnoreCase("Alpukat") || cott.equalsIgnoreCase("Jambu Air")){
                        total+=575000;
                    }else if(cott.equalsIgnoreCase("Durian") || cott.equalsIgnoreCase("Melon")){
                        total+=595000;
                    }else if(cott.equalsIgnoreCase("Belimbing") 
                            || cott.equalsIgnoreCase("Mangga")
                            || cott.equalsIgnoreCase("Kedondong")){
                        total+=495000;
                    }else if(cott.equalsIgnoreCase("Barrack")){
                        total+=25000;
                    }else throw new Exception("TERDAPAT KESALAHAN PADA COOTAGE WEEKDAY!");
                    break;
                case "Weekend":
                    if(cott.equalsIgnoreCase("Duku") || cott.equalsIgnoreCase("Jeruk")){
                        total+=1025000;
                    }else if(cott.equalsIgnoreCase("Alpukat") || cott.equalsIgnoreCase("Jambu Air")){
                        total+=695000;
                    }else if(cott.equalsIgnoreCase("Durian") || cott.equalsIgnoreCase("Melon")){
                        total+=715000;
                    }else if(cott.equalsIgnoreCase("Belimbing") 
                            || cott.equalsIgnoreCase("Mangga")
                            || cott.equalsIgnoreCase("Kedondong")){
                        total+=575000;
                    }else if(cott.equalsIgnoreCase("Barrack")){
                        total+=25000;
                    }else throw new Exception("TERDAPAT KESALAHAN PADA COOTAGE WEEKEND!");
                    break;
                case "Holiday":
                    if(cott.equalsIgnoreCase("Duku") || cott.equalsIgnoreCase("Jeruk")){
                        total+=1225000;
                    }else if(cott.equalsIgnoreCase("Alpukat") || cott.equalsIgnoreCase("Jambu Air")){
                        total+=895000;
                    }else if(cott.equalsIgnoreCase("Durian") || cott.equalsIgnoreCase("Melon")){
                        total+=915000;
                    }else if(cott.equalsIgnoreCase("Belimbing") 
                            || cott.equalsIgnoreCase("Mangga")
                            || cott.equalsIgnoreCase("Kedondong")){
                        total+=755000;
                    }else if(cott.equalsIgnoreCase("Barrack")){
                        total+=35000;
                    }else throw new Exception("TERDAPAT KESALAHAN PADA COOTAGE HOLIDAY!");
                    break;
                default:
                    throw new Exception("TERDAPAT KESALAHAN PADA GOL. HARI!");
            }
            total*=waktu; //Menhitung berapa lama menginap
            
            System.out.println("\t====== Print Out Info ======");
            System.out.println("ID Pelanggan         \t:" + id);
            System.out.println("Nama Pelanggan       \t:" + pelanggan[id-1]);
            System.out.println("Jumlah Hari Menginap \t:" + waktu);
            System.out.println("Tipe Cottage         \t:" + cott);            
            System.out.println("Total Tagihan        \t:" + total);
        }catch(Exception e){System.err.print(e);}
    }    
}
