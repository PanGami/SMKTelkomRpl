package Metic;
public class OperatorUnary {
    /*  2 macam operator yg termasuk jenis ini adalah 
        Operator increment dan Operator decrement
               ++x      Prefix        --x  
               x++      Postfix       x--
    */    
    public static void main(String[] args) {
        int satu = 1;
        if(++satu == 2){
            System.out.println(satu);
            System.out.println("True");
        }else{
            System.out.println(satu);
            System.out.println("False");
        }        
    }
}
