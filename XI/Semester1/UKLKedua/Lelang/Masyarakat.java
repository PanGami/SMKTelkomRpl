package UKL_Kedua.Lelang;
import java.util.ArrayList;

public class Masyarakat implements interfaceClass00{
    private ArrayList<String> namaMasyarakat = new ArrayList<String>();   
    private ArrayList<String> alamat = new ArrayList<String>();   
    private ArrayList<String> telepon = new ArrayList<String>();   

    public Masyarakat(){        
        setNama("Masyarakat Default");
        setAlamat("Alamat Default");
        setTelepon("Telepon? obbo bukan nomer kan?");
    }

    // ======== Method Add Petugas ========
    public void addMasyarakat(String nama,String alamat,String telepon){
        setNama(nama);
        setAlamat(alamat);
        setTelepon(telepon);
    }

    // ======== Method Mendapatkan Info Barang ========
    public void getAllInfoMasyarakat(){
        System.out.print("======= Info Semua Masyarakat =======");
        for(int index = 0;index < namaMasyarakat.size();index++){
            System.out.print(
            "\nMasyarakat Bernama   : " + getNama(index) + 
            "\nDengan Alamat     : " + getAlamat(index) +
            "\nMemiliki Telepon  : " + getTelepon(index) +              
            "\n=================================");                                            
        }
        System.out.println("\n======= END OF INFO PETUGAS ======");
    }    

    // ======== Method Setter ========
    @Override
    public void setNama(String nama) {
        this.namaMasyarakat.add(nama);
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
        return this.namaMasyarakat.get(index);
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