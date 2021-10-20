
package UKLPertama;
// Perkalian array 2x2 x 2x1
public class ArrayDua {
    public static void main(String[] args) {
        int[][] a ={{6,3},{4,8}},b = {{1},{2}},hasil = {{0},{0}};
        System.out.println("Hasil Dari Perkalian (axb) :");
        for(int i =0;i<2;i++){
            for(int j=0;j<1;j++){
                for(int k=0;k<2;k++){
                    hasil[i][j]=hasil[i][j]+a[i][k]*b[k][j];
                }
            }
        }
        System.out.println(a[0][1]);
        //Hasil
        for(int i=0;i<2;i++){
            for(int j=0;j<1;j++){
                System.out.print(hasil[i][j]);
            }
            System.out.println();
        }
    }
}
