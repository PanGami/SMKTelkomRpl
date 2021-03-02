/*
Reverse number atau membalik kan angka
 */

import java.util.Scanner;
public class reverseNum {
    
public static void main(String[] args){
    
    int no,rev=0,r;
    Scanner s=new Scanner(System.in);
    System.out.println("Enter any number: ");
    no=s.nextInt();
    
    while(no>0){
        r=no%10;
        rev=rev*10+r;
        no=no/10;
    }
System.out.println("Reverse: "+rev);
}

}
