import java.util.InputMismatchException; //Import agar try catch dapat berjalan
import java.util.Scanner; //untuk input user
public class tantangan1MrGood { //main class
    
    // Method batasNilai berguna untuk memberi peringatan dari inputan
    // User yg tidak tepat
    static void batasNilai(double nilai){
    if(nilai < 0 || nilai > 100){
        System.out.println("Dimohon memasukkan Nilai yang tepat !");
        System.out.println("Peringatan Nilai tidak akurat! ");
    }
    }
    
    public static void main(String[]args){ //Fungsi main
                        
        //inisialisasi variable yang ada
        Scanner masuk =  new Scanner(System.in);
        double Matematika,Kimia,Biologi,Fisika,rata,i,error=0;        
       
        // try catch untuk menangkap bug atau kesalahan pada run time   
        try{
            
        //diberi do while agar code dapat berjalan minimal sekali lalu
        //user akan ditanyakan ingin mengulang program atau tidak
        do{           
            System.out.print("Masukkan nilai Matematika : ");
            Matematika = masuk.nextDouble();
            batasNilai(Matematika);
            System.out.print("Masukkan nilai Kimia : ");
            Kimia = masuk.nextDouble();
            batasNilai(Kimia);
            System.out.print("Masukkan nilai Biologi : ");
            Biologi = masuk.nextDouble();
            batasNilai(Biologi);
            System.out.print("Masukkan nilai Fisika : ");
            Fisika = masuk.nextDouble();
            batasNilai(Fisika);

            //proses mendapatkan rata rata 
            rata =  (Matematika + Kimia + Biologi + Fisika) / 4;
            System.out.println("Nilai rata-rata nya adalah " + rata);
        
            //Diberi kondisi rata-rata 0-100 karena rata-rata tidak boleh 
            //terlalu banyak atau terlalu sedikit
            if(rata >1 && rata < 101){
                //jika rata rata lebih dari sama dengan 75 berarti lulus jika tidak maka tidak
            if(rata >= 75){
                System.out.println("Lulus");
            }else{
                System.out.println("Tidak lulus");
            }               
            }else{
                System.out.println("Terdapat kesalahan input !"
                        + "\n Lulus tidaknya tidak dapat ditampilkan !");
            }
            //perulangan do while agar user dapat mengulang program jika ingin
        System.out.println("input 1 jika ingin lanjut jika tidak input apapun bisa");
        i =  masuk.nextInt();        
        }while(i==1);
        //Menangkap kesalahan ketidaksesuaian input
    }catch(InputMismatchException e){
            System.out.println("Mohon untuk Input yang benar");
            System.out.println("Pesan : " + e);
    }
    }
}
    
    
    
