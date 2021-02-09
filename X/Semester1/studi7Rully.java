import java.util.Scanner;
public class studi7Rully {
    //Class rully bersifat public
    
    public static void main(String[]args){ //main atau otaknya
        
        //Inisialisasi array,interger,float,scanner
        int array[], i, j;
        array = new int[100];
        float rata, total=0;
        Scanner masuk = new Scanner(System.in);
        
        System.out.print("Masukkan banyaknya ujian yang telah dilakukan : ");
        j = masuk.nextInt(); //Input untuk user
        for(i = 1; i <= j; i++){ //Perulangan for loop
            System.out.print("Nilai Ujian Ke-"+ i +" : ");
            array[i] = masuk.nextInt();
            total += array[i];
        }
        rata = total/j; // J adalah banyaknya peserta
        System.out.println("Hasil nilai total adalah : " + total);
        System.out.println("Hasil rata-rata adalah : " + rata);
    }

}
