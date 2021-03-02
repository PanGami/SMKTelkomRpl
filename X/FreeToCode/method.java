public class method {
    
    /* FUNGSI atau method
    Fungsi pada Java dideklarasikan di dalam sebuah kelas. Fungsi pada Java 
    bertugas untuk mengembalikan nilai. Sedangkan untuk fungsi yang tidak 
    mengembalikan nilai (void) disebut sebagai prosedur. Baik fungsi maupun 
    prosedur di dalam suatu kelas kita sebut sebagai metode. Metode merupakan 
    aspek yang penting di dalam Java. Dalam sebuah kelas bisa terdapat banyak 
    metode sesuai dengan kegunaannya masing-masing.
    */
    
    public method(){  //mengunakan variable yang sama dengan nama class
        String kucing = "heawn";
    }
    
    // No-argument constructor, konstruktor tanpa paramter , baik menuliskan kode pada body-nya atau tidak.
    static void noArguMethod(){
    System.out.println("Print dari method biasa");
    }
    public String[] arMe(){
    return null;
    }
    
    
    // Method Parameter / Parameterized constructor, konstruktor yang memiliki 
    // parameter untuk menginisiasi atau memberikan nilai awal data dengan nilai yang kita tentukan.
    static void methodParameter(String iniParameterYa) {
    System.out.println(iniParameterYa + " Yey");
    }
    
    // Method atau fungsi dengan nilai balik yaitu fungsi yang 
    // mengirimkan/menghasilkan nilai balik selalu mendeklarasikan tipe data
    // kemudian diakhiri dengan return.
    public static double methodNilaiBalik(double koma, double bilBulat){
        double tambah = koma * bilBulat;
        return tambah;
    }
    
    // Method overloading yaitu dua atau lebih fungsi dengan nama yang sama 
    //dalam satu kelas. Namun, yang membedakan adalah parameternya.
    public static double methodOverLo(double koma, double koma1) {
        double komama = koma + koma1;
        return komama;
    }
    public static int methodOverLo(int bilBul, int bilBul1) {
        int bilBull = bilBul + bilBul1;
        return bilBull;
    }
    public static String methodOverLo(String bilBul, String bilBul1) {
        String bilBull = bilBul + bilBul1;
        return bilBull;
    }
    
  public static void main(String[] args) {
      noArguMethod();
      methodParameter("Argument ");
      System.out.println(methodNilaiBalik(1.1,2));
      System.out.println(methodOverLo(1.1,1.2));
      System.out.println(methodOverLo(1,2));
      System.out.println(methodOverLo("1","0"));
    
  }
}
