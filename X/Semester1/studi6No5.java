
import java.util.Scanner; //import utily dari library
public class studi6No5 { //Main class bersifat public
    public static void main(String[]args){
        int b=5;int d=5; //deklarasi, maksud dari isi adalah matrik 5 baris 5 kolom
        System.out.println("Masukan Nilai Matriks : ");
        
        int[][] matrix1=new int[b][d];
        //Perulangan for loop
        for(int i=0;i<b;i++){ 
            for(int j=0;j<d;j++){ 
                matrix1[i][j]=input();
            }
        }
        for(int i=0;i<b;i++){
            for(int j=0;j<d;j++){
                System.out.print(matrix1[i][j]+" ");
            }
            System.out.println();
        }
      
    }
    //method
    static int input(){
        Scanner a=new Scanner(System.in);
        int b=a.nextInt();
        return b;
    }

}
