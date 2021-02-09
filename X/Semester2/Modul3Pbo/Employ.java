public class Employ extends Person {
    private String noKaryawan;
    // Konstruktor
    public Employ(String noKaryawan, String nama,int usia){
        super(nama, usia);
        this.noKaryawan = noKaryawan;
    }
    // Metode
    public void info(){
        System.out.println("No. Karyawan : " + this.noKaryawan);
        super.info();
    }
}
