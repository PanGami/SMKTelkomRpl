//Jika menggunakan this. maka x yang berada di parameter yang dimaksud
//Jika tidak menggunakan this maka x bernilai 10
public class thisKeyword {
    int x = 10; 
  // Constructor with a parameter
   public thisKeyword(int x) { 
    this.x = x; 
  } 
  // Call the constructor
   public static void main(String[] args)  { 
    thisKeyword myObj = new thisKeyword(5); 
    System.out.println("Value of x = " + myObj.x);
  } 
}
