
package UKLPertama;
//Deret Aritmatika
public class LoopSatu {
    public static void main(String[] args) {        
        int suku_pertama = 10;
        int beda = 6;
        int x;
        int total = 0;
        
        for(int i = 9;i<=23;i++){ // i sebagai suku ke-n
            x = suku_pertama+(i-1)*beda;
            total +=x;
            System.out.print(x+" ");
        }
        System.out.println("\n TOTAL : " + total);
    }
}
