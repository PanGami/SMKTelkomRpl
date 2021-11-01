package UKL_Kedua.Lelang;
import java.util.ArrayList;


public class Barang implements interfaceClass01{
    private ArrayList<Integer> idBarang = new ArrayList<Integer>();   
    private ArrayList<String> namaBarang = new ArrayList<String>();   
    private ArrayList<Integer> hargaAwal = new ArrayList<Integer>();   
    private ArrayList<Boolean> status = new ArrayList<Boolean>();   

    // ======== Method Contructor ========
    public Barang(){
        addBarang(0, 10000, "Barang Default");
    }

    // ======== Method Add Barang ========
    public void addBarang(int id,int harga,String namaBarang){
        setId(id);
        setHarga(harga);
        setNamaBarang(namaBarang);
        setStatus(true);        
    }

    // ======== Method Check Barang ========
    public void checkBarang(){
        boolean temp = true;
        for(boolean check : status){
            System.out.print(" | " + check);
            if(check == true) temp = false;
            if(temp){
                System.out.println("Karena Barang sudah habis \nProgram akan dihentikan paksa");
                throw new Error();
            }            
        }
        System.out.println(" | ");
    }

    // ======== Method Mendapatkan Info Barang ========
    public void getAllInfoBarang(){
        System.out.print("======= Info Semua Barang =======");
        for(int index = 0;index < idBarang.size();index++){ 
            System.out.print(
            "\nId Barang   : " + getId(index) + 
            "\nDengan Nama : " + getNamaBarang(index) +
            "\nSeharga     : " + getHarga(index) + 
            "\nBerstatus   : "+ getStatus(index) + 
            "\n=================================");                                            
        }
        System.out.println("\n======= END OF INFO BARANG ======");
    }

    // ======== Method Setter ========
    @Override
    public void setId(int id) {
        this.idBarang.add(id);
    }    
    @Override
    public void setHarga(int harga) {
        this.hargaAwal.add(harga);
    }
    public void setNamaBarang(String namaBarang){
        this.namaBarang.add(namaBarang);
    }
    public void setStatus(boolean status){
        this.status.add(status);
    }
    public void editStatus(int index,boolean status){
        this.status.set(index, status);
    }
    // ======== Method Getter ========
    @Override
    public int getId(int index) {
        return this.idBarang.get(index);
    }
    @Override
    public int getHarga(int index) {
        return this.hargaAwal.get(index);
    }
    public String getNamaBarang(int index){
        return this.namaBarang.get(index);
    } 
    public boolean getStatus(int index){
        return this.status.get(index);
    }
}