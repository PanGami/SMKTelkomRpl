package UKL_Kedua.Laundry;

public class mainClass {
    public static void main(String[]args){
        try{
        Transaksi transaksi =  new Transaksi();
        JenisLaundry jenislaundry = new JenisLaundry();
        Client client = new Client();
        //Petugas petugas = new Petugas();
        // subclass pesan = new subclass(); Untuk menampilkan pesan 

        //Jika ingin input Jenis Laundry Baru
        //argument diisi petugas, index petugas, kode petugas
        //jenislaundry.setAllLaundry(petugas,0,12345); 

        client.infoClient();                         // Menampilkan Semua infoClient
        jenislaundry.infoLaundry();                  // Menampilkan semua info Laundry
        transaksi.prosesInputTransaksi();            // Bagian Input dari Transaksi
        transaksi.prosesTransaksi(client,jenislaundry); //Bagian proses dari transaksi
        transaksi.prosesAkhir(client,jenislaundry);  // Akhir dari Proses transaksi
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
