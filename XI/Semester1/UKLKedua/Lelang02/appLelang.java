package UKL_Kedua.Lelang02;

public class appLelang {    
    public static void main(String[]args){
        subClass0 pesan = new subClass0(); //Untuk menampilkan pesan 
        System.out.println(pesan.pesan);

         Barang barang = new Barang();
         Lelang lelang = new Lelang();
         Petugas petugas = new Petugas();
         Masyarakat masyarakat = new Masyarakat();         
         
         //Parameter(id - int , cost - int , name - String) untuk default item karena jika tidak ada isi akan error
         barang.addBarang(1, 50000, "Pan's Barang01");
         barang.addBarang(2, 90000, "Pan's Barang02");
         barang.getAllInfoBarang();      
         System.out.println(); // Menampilkan pesan

         //Parameter(Nama - String , Alamat - String , Telepon - String)
         masyarakat.addMasyarakat("Panca", "Blitar", "oppoYangDikasih");
         masyarakat.getAllInfoMasyarakat();
         System.out.println(pesan.pesan); // Menampilkan pesan

         petugas.addPetugas("Panca01", "Telkom", "masih oppo");
         petugas.getAllInfoPetugas();
         System.out.println(pesan.pesan); // Menampilkan pesan

         lelang.prosesLelang(barang, petugas, masyarakat,0); 
        
    }
}
