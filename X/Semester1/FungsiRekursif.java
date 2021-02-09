import java.util.Scanner;
public class FungsiRekursif {
    public static void main (String[] args){
        Scanner masukan = new Scanner(System.in);
        int bil,hasil;
        System.out.println("Masukan suatu bilangan : ");
        bil =  masukan.nextInt();
        hasil =  faktorial(bil);
        System.out.println("Nilai faktorial " + bil + " adalah " + hasil);
    }
    private static int faktorial(int a){
        if (a==1){
        return 1;
        }else
        return (a*faktorial(a-1));
    }
}
