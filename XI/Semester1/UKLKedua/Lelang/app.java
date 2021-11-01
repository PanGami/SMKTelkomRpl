package UKL_Kedua.Lelang;

public class app {    
    public static void main(String[]args){
         // subclass pesan = new subclass(); Untuk menampilkan pesan 

         Barang barang = new Barang();
         Lelang lelang = new Lelang();
         Petugas petugas = new Petugas();
         Masyarakat masyarakat = new Masyarakat();

         // Method addBarang from class Barang
         // Param(id,cost,name) and have default item
         barang.addBarang(1, 50000, "Pan's Barang");
         barang.getAllInfoBarang();      

         // Param terakhir merupakan index barang yang akan pertama kali di lelang
         lelang.prosesLelang(barang, petugas, masyarakat, 0); 
        
    }
}
