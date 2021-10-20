/*
    => Convert days to seconds
 */
package Metic;
import java.util.Scanner;
public class TimeConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int hari = input.nextInt();        
        int hasil;
        hasil = ((hari*24)*60)*60;
        System.out.println(hasil);
    }
}