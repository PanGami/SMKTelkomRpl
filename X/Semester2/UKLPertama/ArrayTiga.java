
package UKLPertama;

public class ArrayTiga {
    
    public static void main(String[] args) {
        int[][]a={{6,3,2},{4,2,3}},b = {{1,2},{2,3},{3,1}},hasil={{0,0},{0,0}};
        System.out.println("Hasil Perkalian (AxB) : ");
        
        for(int i =0;i<2;i++){
            for(int j=0;j<2;j++){
                for(int k=0;k<3;k++){
                    hasil[i][j]=hasil[i][j]+a[i][k]*b[k][j];
                }
            }
        }
        
        for(int i=0;i<2;i++){
            for(int j=0;j<1;j++){
                System.out.print(hasil[i][i]+"\t");
            }            
            System.out.println("");
        }    
    }
}
