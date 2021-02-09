import java.util.Scanner;
public class modulDebug {
    
    public static void main(String[]args){
        Scanner masuk = new Scanner(System.in);
        
        System.out.print("Masukkan angka yang ingin dibagi ! ");
        int a= masuk.nextInt();
        System.out.print("Masukkan angka pembagi ! ");
        int b = masuk.nextInt();
        
        try { int pembagianSederhana = a/b;
        }catch (ArithmeticException e){
        System.out.println("Dimohon untuk memasukkan angka selain 0 ! \n Penjelasan error yang terjadi : " + e);
        }finally{
        System.out.println("Ini akan di eksekusi");
        }
        
    }
}

