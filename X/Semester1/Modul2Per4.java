public class Modul2Per4 {
        
    public static void main(String[]args)
    {
    
        String nama,kelas; //deklarasi
        double s,luasDesimal,temp,luas;
        int angkaSignifikan;
        
        kelas = " X RPL 1"; //pengisian nilai
        nama =  " Anfif";
        s = 8.660254037844386;    
        luasDesimal = s*s;
        angkaSignifikan = 2;
        temp = Math.pow(10, angkaSignifikan);
        luas = (double) Math.round(luasDesimal*temp)/temp;
   
        System.out.println("nama :" + nama);  //output print
        System.out.println("kelas:" + kelas);
        System.out.println("Luas persegi :"+luas+" m bisa digunakan untuk sepakbola");
    }

}
