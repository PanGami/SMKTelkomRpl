package UKLPertama;
//Menginport library
import java.util.Scanner;

public class JenisVariasiSoalSatu {
    public static void main(String[] args) {
        //inisialisasi data
        Scanner input = new Scanner(System.in);
        int total = 0;
        String alamat = "",info="";
        String[]pelanggan={"Galuh","Indro","Jedi","Kanu"};
        
        //Input dari User
        System.out.println("Masukkan ID pelanggan");
        int id = input.nextInt();
        
        System.out.println("Masukkan pemakaian listrik \n(dalam KWH)");
        int listrik = input.nextInt();
        
        //menghitung total pembayaran
        switch(id){
            case 1:
                total += (listrik*1000);
                alamat = "Sawojajar";
                info = "Tarif Golongan 1 450 VA adalah 1.000/kwh";
                break;
            case 2:
                total += (listrik*1500);
                alamat = "Kedung kandang";
                info = "Tarif Golongan 3 2200 VA adalah 1.500/kwh";
                break;
            case 3:
                total += (listrik*1300);
                alamat = "Ijen";
                info = "Tarif Golongan 2 1300 VA adalah 1.300/kwh";
                break;
            case 4:
                total += (listrik*1500);
                alamat = "Dinoyo";
                info = "Tarif Golongan 3 2200 VA adalah 1.500/kwh";
                break;           
        }
        total+= 13000; //biaya administrasi
        if(total <50000) total=50000; //jika total <50k 
        
        //Output atau print out
        System.out.println("Print Out Tagihan");
        System.out.println("ID\t:" + id);
        System.out.println("Nama\t:" + pelanggan[id-1]);
        System.out.println("Tagihan\t:Rp." + total+",-");
        System.out.println("Alamat Pelanggan\t:" + alamat);
        System.out.println("Keterangan Golongan\t:" + info);        
    }
}
