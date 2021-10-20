
package Metic;

public class MethodOrFunction {
    
    /* FUNGSI atau method
    Fungsi pada Java dideklarasikan di dalam sebuah kelas. Fungsi pada Java 
    bertugas untuk mengembalikan nilai. Sedangkan untuk fungsi yang tidak 
    mengembalikan nilai (void) disebut sebagai prosedur. Baik fungsi maupun 
    prosedur di dalam suatu kelas kita sebut sebagai metode. Metode merupakan 
    aspek yang penting di dalam Java. Dalam sebuah kelas bisa terdapat banyak 
    metode sesuai dengan kegunaannya masing-masing.
    */
    
    // Info tambahan Untuk beberapa method harus dibuat static
    // Tujuan static agar dapat diakses oleh semua yang berada didalam class yang sama
    // Biasa digunakan untuk mengakses yang menggunakan static lain dalam class yang sama
    
    // Contoh Stuktur method return
    // Modifier tipe_data nama_method(parameter){
    //    isi_method
    //    return;
    // }
    // example :
    // Public static int add(int numA,int numB){
    //    int result = numA+numB;
    //    return result;
    // }
    
    // Contoh Struktur method void dibawah banyak
    
    public MethodOrFunction(){  //mengunakan variable yang sama dengan nama class dinamakan constructor method
        String kucing = "heawn"; // Method ini nanti akan muncul juga ketika pengajaran OOP 
    }
    
    // No-argument constructor, konstruktor tanpa paramter , baik menuliskan kode pada body-nya atau tidak.
    static void noArguMethod(){
        System.out.println("Print dari method biasa");
    }   

    // Method Parameter / Parameterized constructor, konstruktor yang memiliki 
    // parameter untuk menginisiasi atau memberikan nilai awal data dengan nilai yang kita tentukan.
    static void methodParameter(String iniParameterYa) {
        System.out.println(iniParameterYa + " Yey");
        System.out.println("____________");
    }

    
    // Method atau fungsi dengan nilai balik yaitu fungsi yang 
    // mengirimkan/menghasilkan nilai balik selalu mendeklarasikan tipe data
    // kemudian diakhiri dengan return.
    public static double methodNilaiBalik(double koma, double bilBulat){
        double tambah = koma * bilBulat;
        return tambah;        
    }
    
    public static void printAll(){
       noArguMethod();
       methodParameter("Argument ");
       System.out.println(methodNilaiBalik(1.1,2));
    }
    
    public static void main(String[] args) {
       printAll();
    }
}
