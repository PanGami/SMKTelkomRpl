import java.util.Scanner;
public class LuasPermukaanBola {
    public static void main(String[] args) 
    {
        System.out.print("Program Java Sederhana Penghitung Luas Permukaan Bola\nMasukkan jari-jari bola : ");
        Scanner input = new Scanner(System.in); 
        double jari = input.nextDouble();
        System.out.println("Luas Permukaan bola adalah " + jari*jari*22/7*4);
    }
}
