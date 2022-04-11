public class empat {
    // even or odd takes array parameter
    public static void evenOrOdd(int[] numbers){
        for(int i = 0; i < numbers.length; i++){
            if (numbers[i] % 2 == 0){
                System.out.println("Number is genap");
            }
            else{
                System.out.println("Number is Ganjil");
            }
        }
    }
    public static void main(String[] args){
        int[] numbers = {1,2,3};
        evenOrOdd(numbers);    
    }
}
