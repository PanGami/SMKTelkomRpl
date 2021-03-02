import java.util.Scanner;
// ("%-15s%03d%n", s1, x) % : used as a formatter. '-' : minus sign used for 
// left indentation of the string. 15s : here 15 denotes the string's minimum 
// field width 15. '0' : pads the extra 0s in the integer. 3d : here 3 denotes 
// integer's minimum field width 3. %n : prints the new line.

public class PrintFormating {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
            System.out.println("Input String lalu spasi nomer");
            System.out.println("Contoh : Pan 100");
            String s1=sc.next();
            int x=sc.nextInt();
            System.out.printf("%-15s%03d%n", s1, x);
            
        System.out.println("================================");
    }
}



