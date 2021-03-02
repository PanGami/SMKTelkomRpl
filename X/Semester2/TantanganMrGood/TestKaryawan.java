public class TestKaryawan {    
    public static void main(String[]args){    
        Karyawan1 test = new Karyawan1();        
        test.cetak();
        
        System.out.println("==========================");
        
        Karyawan2 test2 = new Karyawan2();
        test2.cetak();
        
        System.out.println("=========================");
        
        System.out.println(test2.kataTambahan());         
        System.out.println(test2.kataTambahan("Kata Default Tergantikan"));      
    }        
}
