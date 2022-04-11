public class lima {
    // method that takes array parameter and return largest number
    public static int largest(int[] numbers){
        int largest = numbers[0];
        for(int i = 0; i < numbers.length; i++){
            if (numbers[i] > largest){
                largest = numbers[i];
            }
        }
        return largest;
    }
    
    public static void main(String[] args){
        int[] numbers = {-1,100000,9,10};
        System.out.println(largest(numbers));
    }
}
