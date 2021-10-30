package UKL_Kedua.Laundry;
import java.util.ArrayList;
import java.util.Scanner;

public class Transaksi {
    private ArrayList<Integer> idClient = new ArrayList<Integer>(); // idClient
    private ArrayList<Integer> idJenisLaundry = new ArrayList<Integer>(); //0 => cepat, 1=>lambat
    private ArrayList<Integer> banyak = new ArrayList<Integer>(); // hitungan kg
    int globalTemp = 0;
    Scanner input = new Scanner(System.in);
    

    public void prosesInputTransaksi(){
        System.out.println("\n==========  PanLaundry - Input Laundry  ==========\n");
        System.out.println("Masukkan ID Client, Jenis Laundry(0/1) dan berat laundry (kg) !");
        System.out.print("ID Client     : ");
        int idTemp = input.nextInt();
        System.out.print("Jenis Laundry : ");
        int jenisTemp = input.nextInt();
        System.out.print("Berat laundry : ");
        int beratTemp = input.nextInt();   
            this.idClient.add(idTemp);
            this.idJenisLaundry.add(jenisTemp);
            this.banyak.add(beratTemp);           
    }
    public void prosesTransaksi(Client client,JenisLaundry jenisLaundry){
        System.out.println("\n==========  PanLaundry - Proses Laundry  ==========\n");        
        System.out.println("Yang Terhormat Bapak/Ibu : "+client.getNama(idClient.get(0)) + 
        "\nDengan Alamat            : " + client.getAlamat(idClient.get(0)) + 
        "\nNomor Telp.              : " + client.getTelepon(idClient.get(0)) + 
        "\nSaldo Anda               : "+ client.getSaldo(idClient.get(0))); 
        System.out.println("Mengambil Jenis          : " + jenisLaundry.getJenis(idJenisLaundry.get(0)) + 
        "\nDengan Harga             : " + (jenisLaundry.getHarga(idJenisLaundry.get(0))*this.banyak.get(0))+ 
        " Rupiah\nDurasi                   : " + (jenisLaundry.getDurasi(idJenisLaundry.get(0))*this.banyak.get(0))+ " Menit");
        globalTemp = client.getSaldo(idClient.get(0)) - (jenisLaundry.getHarga(idJenisLaundry.get(0))*this.banyak.get(0)) ;
    }
    public void prosesAkhir(Client client,JenisLaundry jenisLaundry){
        System.out.println("\n==========  PanLaundry - Akhir Laundry  ==========\n");
        System.out.println("Yang Terhormat Bapak/Ibu : "+client.getNama(idClient.get(0)) +
        "\nSaldo Anda Menjadi       : " + globalTemp); 
        System.out.println("\n==========  PanLaundry - Terimakasih !  ==========\n");
    }
    

    public void menghitung(JenisLaundry jk){

    }
}