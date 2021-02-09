import java.util.Scanner; //Import Library
public class modul7Evaluasi {
static void maxNilai(){ //Method atau fungsi 
    Scanner input = new Scanner (System.in); 
    int Bilangan[] = new int[100]; 
    int A=0, B=0, Tertinggi = 0; //Inisialisasi 
    System.out.print("Masukan Jumlah Peserta : "); 
    int in = input.nextInt();
    
    for(int x=1; x<=in; x++){  //Perulangan for loop
        System.out.print("Nilai peserta ke-"+x+": ");
        Bilangan[x] = input.nextInt(); 
    }  
    for(int x=1; x<=in; x++){ //For loop dengan logika If
        if(Bilangan[x]>Tertinggi){
            Tertinggi=Bilangan[x];
        }   
    }
    System.out.println("Peserta dengan nilai terbesar adalah : "+Tertinggi); 
    
} //Method atau fungsi

public static void main(String[] args){ //Main atau otaknya
    maxNilai(); //Pemanggilan method atau fungsi
}  

}
