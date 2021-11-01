package UKL_Kedua.Lelang;
import java.util.ArrayList;

public class Petugas implements interfaceClass00{
    private ArrayList<String> namaPetugas = new ArrayList<String>();
    private ArrayList<String> alamat = new ArrayList<String>();
    private ArrayList<String> telepon = new ArrayList<String>();
    
    // Petugas Default
    public Petugas(){        
        setNama("Admin Panca");
        setAlamat("Blitar");
        setTelepon("Telepon? obbo bukan nomer kan?");
    }

    // ======== Method Add Petugas ========
    public void addBarang(String nama,String alamat,String telepon){
        setNama(nama);
        setAlamat(alamat);
        setTelepon(telepon);
    }

    // ======== Method Mendapatkan Info Barang ========
    public void getAllInfoBarang(){
        System.out.print("======= Info Semua Petugas =======");
        for(int index = 0;index < namaPetugas.size();index++){
            System.out.print(
            "\nPetugas Bernama   : " + getNama(index) + 
            "\nDengan Alamat     : " + getAlamat(index) +
            "\nMemiliki Telepon  : " + getTelepon(index) +              
            "\n=================================");                                            
        }
        System.out.println("\n======= END OF INFO PETUGAS ======");
    }


    // ======== Method Setter ========
    @Override
    public void setNama(String nama) {
        this.namaPetugas.add(nama);
    }
    @Override
    public void setAlamat(String alamat) {
        this.alamat.add(alamat);
    }
    @Override
    public void setTelepon(String telepon) {
        this.telepon.add(telepon);
    }

    // ======== Method Getter ========
    @Override
    public String getNama(int index) {
        return this.namaPetugas.get(index);
    }
    @Override
    public String getAlamat(int index) {
        return this.alamat.get(index);
    }
    @Override
    public String getTelepon(int index) {
        return this.telepon.get(index);
    }

}
