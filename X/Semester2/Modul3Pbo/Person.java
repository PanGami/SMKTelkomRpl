public class Person {
    private String nama;
    private int usia;
    
    // Konstruktor
    public Person(String nama,int usia){
        this.nama = nama;
        this.usia = usia;    
    }
    
    // Metode
    public void info(){
        System.out.println("Nama:"+this.nama);
        System.out.println("Usia:"+this.usia);
    }
}
