package UKL_Kedua.Laundry;
import java.util.ArrayList;

public class Client implements User{
    private ArrayList<String> namaClient = new ArrayList<String>();
    private ArrayList<String> alamat = new ArrayList<String>();
    private ArrayList<String> telepon = new ArrayList<String>();
    private ArrayList<Integer> saldo = new ArrayList<Integer>();

    Client(){
        this.namaClient.add("PancaClient00");
        this.alamat.add("Blitar00");
        this.telepon.add("081216012735");
        this.saldo.add(1000000);
        this.namaClient.add("PancaClient01");
        this.alamat.add("Blitar01");
        this.telepon.add("081216012735");
        this.saldo.add(2000000);
        this.namaClient.add("PancaClient02");
        this.alamat.add("Blitar02");
        this.telepon.add("081216012735");
        this.saldo.add(3000000);
    }

    public void infoClient(){
        for(int i=0;i < this.namaClient.size();i++){
            System.out.println("\n==========  PanLaundry - Info Client  ==========\n");
            System.out.println("Yang Terhormat Bapak/Ibu : "+this.getNama(i) + 
            "\nDengan Alamat            : " + this.getAlamat(i) + 
            "\nNomor Telp.              : " + this.getTelepon(i) + 
            "\nSaldo Anda               : "+ getSaldo(i));                        
        }        
    }

    public void setSaldo(int index,int saldo){
        this.saldo.set(index, saldo);
    }
    public int getSaldo(int index){
        return this.saldo.get(index);
    }

    @Override
    public void setNama(String nama) {
        this.namaClient.add(nama);
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
    public String getNama(int idClient) {
        return this.namaClient.get(idClient);
    }
    @Override
    public String getAlamat(int idAlamat) {
        return this.alamat.get(idAlamat);
    }
    @Override
    public String getTelepon(int idTelepon) {
        return this.telepon.get(idTelepon);
    }

}
