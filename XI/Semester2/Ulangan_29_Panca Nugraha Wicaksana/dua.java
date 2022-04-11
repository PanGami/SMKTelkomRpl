public class dua {
    //make method that have paramerter for even or odd number
    public static void evenOrOdd(int number){
        if (number % 2 == 0){
            System.out.println("Number is genap");
        }
        else{
            System.out.println("Number is Ganjil");
        }
    }

    public static void main(String[] args){        
        evenOrOdd(3);
    }
}
