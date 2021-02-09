package modul_exceptionhandling;
import java.util.Scanner;
public class Modul_ExceptionHandling {
    public static void main(String[] args) {

        int[] array = {0,1,2,3};
        Scanner userInput = new Scanner(System.in);
        System.out.print("Nilai Array ke = ");
        int index = userInput.nextInt();
        
        try{
            System.out.printf("Index ke %d, adalah %d\n", index, array[index]);
        }
        catch(Exception x){
            System.out.println("SALAH");
        }
        System.out.println("Akhir program ");        
    }   
}