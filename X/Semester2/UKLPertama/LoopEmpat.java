
package UKLPertama;

public class LoopEmpat {
    public static void main(String[] args) {
        int a=2,b=3,n=10,sum=0;
        
        //Model A
//        for(int i=1;i<=4;i++){
//            for(int j=1;j<=i;j++){
//                a+=b;
//                sum+=a;
//                System.out.print(a + " ");
//            }
//            System.out.println();
//        }        
//        for(int i=1;i<=5;i++){
//            for(int j=5;j>=i;j--){
//                a+=b;
//                sum+=a;
//                System.out.print(a + " ");
//            }
//            System.out.println();
//        }
//        System.out.println("Sum of all : " + sum);
        
        //Model B
        for(int i=1;i<=5;i++){
            for(int j=5;j>=i;j--){
                a+=b;
                sum+=a;
                System.out.print(a + " ");
            }
            System.out.println();
        }
        for(int i=1;i<=4;i++){
            for(int j=1;j<=i;j++){
                a+=b;
                sum+=a;
                System.out.print(a + " ");
            }
            System.out.println();
        }    
        System.out.println("Sum of all : " + sum);
    }
}
