package UKL_Kedua.Lelang02;
import java.util.ArrayList;

public class Masyarakat implements interfaceClass00{
    private ArrayList<String> namaMasyarakat = new ArrayList<String>();   
    private ArrayList<String> alamat = new ArrayList<String>();   
    private ArrayList<String> telepon = new ArrayList<String>();   

    public Masyarakat(){        
        setNama("Masyarakat Default");
        setAlamat("Alamat Default");
        setTelepon("Telepon? oppo");
    }
    
    public void addMasyarakat(String nama,String alamat,String telepon){
        setNama(nama);
        setAlamat(alamat);
        setTelepon(telepon);
    }

    public void getAllInfoMasyarakat(){
        System.out.print("<======= Info Semua Masyarakat =======>");
        for(int index = 0;index < namaMasyarakat.size();index++){
            System.out.print(
            "\nMasyarakat Bernama : " + getNama(index) + 
            "\nDengan Alamat      : " + getAlamat(index) +
            "\nMemiliki Telepon   : " + getTelepon(index) +              
            "\n<=====================================>");                                            
        }
        System.out.println("\n<======= END OF INFO Masyarakat ======>\n\n");
    }    

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