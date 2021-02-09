import java.util.Scanner;
public class studiKasusDebug {

   public static void main(String args[]) {
      Scanner masuk = new Scanner(System.in);
      int [] a= new int[2];
      a[0]= 1;
      a[1]= 2;
      System.out.print("Ketikan angka diatas 1 maka akan terjadi error! ");
      int i= masuk.nextInt();
      
      try {
          System.out.println("Nilai index yang dimasukkan : " + a[i]);
      }catch (ArrayIndexOutOfBoundsException e){
          System.out.println("Penjelasan Exception Nya : " + e);
      }finally{
          System.out.println("Nilai index awal : " + a[0]);
          System.out.println("Finally statement telah tereksekusi !");
      }
   }
}
