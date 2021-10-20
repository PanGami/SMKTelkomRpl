
package UKLPertama;
import java.util.Scanner;
public class SeleksiKondisi {
    static int hitung(int nilai) {
        int bayar=20000;
        nilai=nilai-10;

        //pengitungan 10 kedua
        if (nilai>10){
            bayar=bayar+30000;
            nilai=nilai-10;
        }
        else {
            bayar=bayar+3000*nilai;
            nilai=0;
        }

        //pengitungan 10 ketiga
        if (nilai>10){
            bayar=bayar+40000;
            nilai=nilai-10;
        }
        else {
            bayar=bayar+4000*nilai;
            nilai=0;
        }

        //pengitungan selanjutnya
        if (nilai>10){
            bayar=bayar+3000*nilai;
        }

        return bayar;
    }

    public static void main(String[] args) {     
    String[]namaPelanggan={"Ali", "Budi", "Dani", "Edi", "Umar"};
  
    Scanner input = new Scanner(System.in); 
    System.out.println("Masukkan id pelanggan");
    int id = input.nextInt(); 
    

    System.out.println("Masukkan jumlah tagihan");
    int tagihan = input.nextInt(); 
    

    if (tagihan<10) {tagihan=20000;}
    else {tagihan=hitung(tagihan);}

    tagihan+=10000;

    System.out.println("\t====== Print Out ======");
    System.out.println("ID     \t:" + id);
    System.out.println("Nama   \t:" + namaPelanggan[id-1]);
    System.out.println("Tagihan\t:Rp." + tagihan+",-");
    }
}
