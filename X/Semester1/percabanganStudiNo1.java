import java.util.Scanner;
public class percabanganStudiNo1 {
    public static void main(String[]args){
        Scanner masuk = new Scanner(System.in);
        double i;
        
        System.out.println("Masukkan total pembelian ! ");
        i= masuk.nextDouble();
        
        if( i < 50000){
            System.out.println("Tidak mendapat potongan");
        }else if(i>=50000){
            System.out.println("Mendapat potongan 20% yaitu " + i * 20/100 + "0");
        }else{
            System.out.println("ini tidak mungkin dieksekusi kelihatanya");
        }
    }
}
