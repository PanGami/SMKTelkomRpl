package UKLPertama;
// Pengurangan Array
public class ArraySatu {    
    public static void main(String[] args) {
        int[][]a = {{-7,5},{4,8}}, b = {{1,1},{-4,9}};    
        System.out.println("Hasil Pengurangan matriks (a-b) :");
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++) System.out.print(a[i][j]-b[i][j] + " ");            
            System.out.println();
        }
    }
}
