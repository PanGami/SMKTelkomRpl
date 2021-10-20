package Metic;
public class OperatorBitwise {
//    Operator Bitwise adalah operator untuk melakukan operasi pada nilai bit    
    
    public static void main(String[] args) {
        int a = 60;    /* 60 = 0011 1100 */
        int b = 13;    /* 13 = 0000 1101 */        
        int c = 0;
        
//      | OR           : Jika kedua bit yang dioperasikan adalah 0, 
//                       maka hasilnya 0 Jika salah satu atau kedua 
//                       bit adalah 1, maka hasilnya 1
        c = a | b;     /* 61 = 0011 1101 */
        System.out.println("a | b = " + c);
        
        
//      & AND          : Jika kedua bit yang dioperasikan adalah 1, 
//                       maka hasilnya 1 Jika salah satu atau kedua bit 
//                       adalah 0, maka hasilnya 0        
        c = a & b;       /* 12 = 0000 1100 */
        System.out.println("a & b = " + c);            
                
//      ~ NOT          : Mengubah nilai bit 0 menjadi 1 dan sebaliknya
        c = ~a;          /*-61 = 1100 0011 */
        System.out.println("~a = " + c);

        
//      ^ XOR          : Jika kedua bit yang dioperasikan nilainya berbeda 
//                       maka hasilnya 1, Jika kedua bit nilainya sama 
//                       maka hasilnya 0        
        c = a ^ b;       /* 49 = 0011 0001 */
        System.out.println("a ^ b = " + c);

        
//      << Shift Left  : Mengeser sejumlah bit ke kiri        
        c = a << 2;     /* 240 = 1111 0000 */
        System.out.println("a << 2 = " + c);

        
//      >> Shift Right : Mengeser sejumlah bit ke kanan
        c = a >> 2;     /* 215 = 0000 1111 */
        System.out.println("a >> 2  = " + c);        
    }    
}