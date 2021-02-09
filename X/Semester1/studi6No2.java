import java.util.Scanner;
public class studi6No2 {// Main Class bersifat Public
    public static void main(String[]args){
     
        //Deklarasi 
        //penjelasan nama variable bil=bilangan, kuad=kuadrat, niAw=nilaiAwal, niAk=nilaiAkhir
        Scanner input = new Scanner(System.in);
        int[] bil;
        int kuad;
        System.out.print("Input nilai awal :");
        int niAw = input.nextInt();
        System.out.print("Input nilai akhir :");
        int niAk = input.nextInt();
        bil = new int[niAw + niAk + 1];
        //Dieksekusi jika awal <= akhir
        for (int i = niAw; i <= niAk; i++) { 
            bil[i] = i;
        }
        //Dieksekusi jika >= akhir
        for (int i = niAw; i >= niAk; i--) {
            bil[i] = i;
        }
        //definisi tidak ada ganjil
        if (niAw == niAk && (niAw % 2 == 0 || niAk % 2 == 0)) { 
            System.out.println("Tidak ditemukan angka ganjil");
        } else if (niAw < niAk) {//jika nilai awal lebih kecil dari nilai akhir
            for (int i = 0; i < bil.length; i++) {//mengulangi semua isi bilangan[]
                kuad = bil[i] * bil[i];
                if (bil[i] % 2 != 0) { //kondisi mendefinisikan ganjil
                    System.out.println(bil[i] + " kuadrat = " + kuad);
                }
            }
        } else {//jika nilai awal lebih besar dari dari nilai awal
            for (int i = bil.length - 1; i > 0; i--) {//mengulangi semua isi bilangan[]
                kuad = bil[i] * bil[i];
                if (bil[i] % 2 != 0) {//mendefinisikan ganjil
                    System.out.println(bil[i] + " kuadrat = " + kuad);
                }
            }
        }
 } 

    
}
