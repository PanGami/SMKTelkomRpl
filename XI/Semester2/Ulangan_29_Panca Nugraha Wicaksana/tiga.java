public class tiga {  
    //method sum takes for loop parameter
    public static int sum(int n){        
        int sum = 0;
        for(int i = 1; i <= n; i++){ sum += i; }
        return sum;
    }
    public static void main(String[] args){
        //print sum of 1 to 10
        System.out.println(sum(100));       
    }
}
