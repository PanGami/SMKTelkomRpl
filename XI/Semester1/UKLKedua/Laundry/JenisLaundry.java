package UKL_Kedua.Laundry;
import java.util.Scanner;
import java.util.ArrayList;
public class JenisLaundry {
 
    private ArrayList<String> jenisLaundry = new ArrayList<String>(); //cepat, lambat
    private ArrayList<Integer> harga = new ArrayList<Integer>();  // rupiah per kg
    private ArrayList<Integer> durasi = new ArrayList<Integer>(); // hitungan menit
    Scanner input = new Scanner(System.in);

    public JenisLaundry() {
        this.jenisLaundry.add("0 - cepat");
        this.harga.add(30000);
        this.durasi.add(5); //Per-kg
        this.jenisLaundry.add("1 - lambat");
        this.harga.add(20000);
        this.durasi.add(10); //Per-kg
    }

    public void infoLaundry(){
        for(int i=0;i < this.jenisLaundry.size();i++){
            System.out.println("\n==========  PanLaundry - Info Laundry  ==========\n");
            System.out.println("Terdapat Jenis          : " + this.jenisLaundry.get(i) + 
            "\nDengan Harga            : " + this.harga.get(i) + 
            " Rupiah\nDurasi                  : " + this.durasi.get(i) + " Menit");                        
        }       
    }

    public void setAllLaundry(Petugas petugas,int indexPetugas,int kode){  
        petugas.checkKode(indexPetugas, kode);
        System.out.println("\n========== PanLaundry - Input New Laundry ==========\n");
        System.out.print("Masukkan Jenis Laundry baru        : ");
        String laundry = input.nextLine();
        this.jenisLaundry.add(laundry);
        System.out.print("\nMasukkan Harga dari Laundry baru : ");
        int harga = input.nextInt();
        this.harga.add(harga);
        System.out.print("\nBerapa durasi dari Laundry baru  : ");
        int durasi = input.nextInt();
        this.durasi.add(durasi);
        System.out.println("\n========== PanLaundry - Input New Laundry ==========\n");
    }

    public String getJenis(int index){
        return this.jenisLaundry.get(index);
    }
    public int getHarga(int index){
        return this.harga.get(index);
    }
    public int getDurasi(int index){
        return this.durasi.get(index);
    }
}
