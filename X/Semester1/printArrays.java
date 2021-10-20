import java.util.Arrays;

public class printArrays {
    public static void main(String[]args){
    
        
        String [] test1 = {"1","2","3","4","5"};
        int [] test2 = new int [5]; //Mendeklarasi atau inisialisasi panjang array / membuat array kosong
        test2[0] = 20; //mengisi 
        test2[1] = 40;
        test2[2] = 60;
        test2[3] = 80;
        test2[4] = 100;
        
        System.out.println(test1[0]); //Dengan cara biasa akses variable dengan index ke-
       
        System.out.println(Arrays.toString(test1)); //cara print menggunakan Wrap Arrays
        
        System.out.println();
        
        for (String test : test1){ //dengan For each loop
        System.out.println(test);
        }
        
        System.out.println();
        
        for(int i=0; i < test1.length; i++){ //dengan for loop
        System.out.println(test1[i]);
        }
        
        
    }
}
