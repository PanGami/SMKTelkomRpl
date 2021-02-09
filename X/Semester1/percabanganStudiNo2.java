import java.util.Scanner;
public class percabanganStudiNo2 {
    public static void main(String[]args){
    Scanner masuk = new Scanner(System.in);
    
        System.out.println("Masukkan Total Penjualan barang salesman hari ini");
        int j,i =  masuk.nextInt();
        
        if(i==200000){
            j = i * 10/100 + 10000;
            System.out.println("Salesman mendapat uang jasa sebesar Rp.1000 "
                    + "Di tambah dengan uang komisi 10% dari pendapatan yaitu Rp. " + j);        
        }else if(i > 200000 && i < 500000){
            j = i * 15/100 + 20000;
            System.out.println("Salesman tersebut mendapat uang jasa sebesar Rp. 20000 "
                    + "Di tambah uang dari komisi 15% dari pendapatan yaitu Rp. " + j);        
        }else if (i > 500000){
            j =  i* 20/100 + 30000;
            System.out.println("Salesman mendapat uang jasa sebesar Rp. 30000 "
                    + "Di tambah dengan uang komisi 15% dari pendapatan yaitu Rp. " + j);
        }else{
            System.out.println("Tidak mendapat uang jasa");
        }
    }
}
