package UKL_Kedua.Laundry;
import java.util.ArrayList;

public class Petugas implements User{
    private ArrayList<String> namaPetugas = new ArrayList<String>();
    private ArrayList<String> alamat = new ArrayList<String>();
    private ArrayList<String> telepon = new ArrayList<String>();
    private ArrayList<Integer> jabatan = new ArrayList<Integer>();
    private ArrayList<Integer> kode = new ArrayList<Integer>();
    JenisLaundry jenisLaundry = new JenisLaundry();

    Petugas(){
        this.namaPetugas.add("Panca");
        this.alamat.add("Blitar");
        this.telepon.add("081216012735");
        this.jabatan.add(0);
        this.kode.add(12345);
    }
    public void checkKode(int indexPetugas,int kode){
        if(this.kode.get(indexPetugas) == kode){
            System.out.println("Kode Petugas Benar!");
        }else{
            System.out.println("Kode Petugas Salah!");
            throw new Error();
        }
    }

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

    @Override
    public String getNama(int id) {        
        return this.getNama(id);
    }
    @Override
    public String getAlamat(int id) {
        return this.getAlamat(id);
    }
    @Override
    public String getTelepon(int id) {
        return this.getTelepon(id);
    }
}
