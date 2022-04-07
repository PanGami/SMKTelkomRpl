import java.util.Scanner;

public class delapan {

    //make scanner object
    public static Scanner input = new Scanner(System.in);

    //make method that takes user input to make an array
    public static String[] inputArrayBarang(int length){
        String[] array = new String[length];
        for(int i=0;i<length;i++){
            System.out.print("Masukkan Nama Barang ke-" + (i+1) + " : ");
            array[i] = input.nextLine();
        }
        return array;
    }
    public static int[] inputArrayNum(int length){
        int[] array = new int[length];
        for(int i=0;i<length;i++){
            System.out.print("Masukkan angka ke-" + (i+1) + " : ");
            array[i] = input.nextInt();
        }
        return array;
    }
    
    //make method that take array and output largest number
    public static String largest(){  
        System.out.println("Masukkan Panjang array");
        int length = input.nextInt();
        System.out.println("Mengiputkan " + length + " Barang");
        input.nextLine();
        String[] item = inputArrayBarang(length);
        int[] numbers = inputArrayNum(length);
        int largest = numbers[0];        
        int temp = 0;
        for(int i = 0; i < numbers.length; i++){
            if (numbers[i] > largest){
                largest = numbers[i];
                temp = i;
            }
        }
        return item[temp];
    }

    public static void main(String[] args){
        System.out.println(largest());
    }
}
