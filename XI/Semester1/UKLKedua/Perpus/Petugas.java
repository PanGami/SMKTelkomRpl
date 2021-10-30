package UKL_Kedua.Perpus;
import java.util.ArrayList;
public class Petugas implements User{
    private ArrayList<String> namaKaryawan = new ArrayList<String>();
    private ArrayList<String> alamat = new ArrayList<String>();
    private ArrayList<String> telepon = new ArrayList<String>();

    Petugas(){
        this.namaKaryawan.add("adminPanca");
        this.alamat.add("Blitar");
        this.telepon.add("081216012735");
    }    

    public int getJmlKaryawan(){
        return this.namaKaryawan.size();
    } 
    @Override
    public void setNama(String namaKaryawan){
    this.namaKaryawan.add(namaKaryawan);
    }
    
    @Override
    public void setAlamat(String alamat ){
    this.namaKaryawan.add(alamat);
    }
    @Override
    public void setTelepon(String telepon ){
    this.namaKaryawan.add(telepon);
    }
    
    @Override
    public String getNama(int idKaryawan){
    return this.namaKaryawan.get(idKaryawan);
    }
    
    @Override
    public String getAlamat(int idKaryawan){
    return this.alamat.get(idKaryawan);
    }
    
    @Override
    public String getTelepon(int idKaryawan){
    return this.telepon.get(idKaryawan);
    } 
}
