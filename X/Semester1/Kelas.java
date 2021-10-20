
public class Kelas {
    
    
    private String namaKelas;
    private int kodeKelas;
    
    public void setNamaKelas(String namaKelas){
        this.namaKelas = namaKelas;
    }
    public String getNamaKelas(){
        String output = "Nama kelas adalah :" + namaKelas;
        return output;
    }
    public void setKodeKelas(int kodeKelas){
        this.kodeKelas = kodeKelas;
    }
    public String getKodeKelas(){
        String output = "Kode kelas adalah :" + kodeKelas;
        return output;
    }

}
