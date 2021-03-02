import java.util.Scanner;
//Explanatation
//You must enter scan.nextLine(); for s. The first for clean buffer or 
//null character from last scanner input operation and this happen because 
//scanner will doing different job for different data type (Numeric to String). 
//The second, scan.nextLine(); ready for capture our String input.

public class InputStringDenganSpasi {   
    public static void main(String[]args){        
        Scanner scan = new Scanner(System.in);
        System.out.println("Scanner ke-1");
        int i = scan.nextInt();
        System.out.println("Scanner ke-2");
        double d = scan.nextDouble();
        System.out.println("Scanner ke-3");
        scan.nextLine(); // Alasan diberi ini ada diatas!
        System.out.println("Scanner ke-4");
        String s = scan.nextLine();
        scan.close();
       
        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}
