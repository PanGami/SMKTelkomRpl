public class enam {    
    //make method that takes array and check if there any duplicate number
    public static boolean check(int number, int[] numbers){
        for(int i = 0; i < numbers.length; i++){
            for(int j = i + 1; j < numbers.length; j++){
                if((numbers[i] + numbers[j]) == number){
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args){
        int[] numbers = {0,3,4,5,9,99,5};        
        System.out.println(check(10,numbers));
    }
}