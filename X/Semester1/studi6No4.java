import java.util.Scanner;
public class studi6No4 {
    //Main class bersifat public
    public static void main(String[]args){
    //deklarasi
    int i, j, m = 2, n=3;
    int matriks1[][] = new int[3][3];
    int matriks2[][] = new int[3][3];
    int hasil[][] = new int[3][3];
    Scanner masuk = new Scanner(System.in);
    
    //perulangan for loop
    System.out.println("Masukkan elemen matriks pertama: ");
    for (i = 0; i < m; i++) {
      for (j = 0; j < n; j++) {
        matriks1[i][j] = masuk.nextInt();
      }
    }
    System.out.println("Masukkan elemen matriks kedua: ");
    for (i = 0; i < m; i++) {
      for (j = 0; j < n; j++) {
        matriks2[i][j] = masuk.nextInt();
      }
    }
    System.out.println("Hasil pengurangan matriks: ");
    for (i = 0; i < m; i++) {
      for (j = 0; j < n; j++) {
        hasil[i][j] = matriks1[i][j] - matriks2[i][j];
        System.out.print(hasil[i][j] + "\t"); // "\t" memberi jarak seperti tab
      }
      System.out.println();
    }
 } 
}
