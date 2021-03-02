/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
public class reverseStr {
    

  public static void main(String args[]) 
 {
  String str;
  Scanner scanner = new Scanner(System.in);
 
  System.out.println("Enter any String");
  str = scanner.nextLine();
 
  // Reversing a string
  StringBuilder str2 = new StringBuilder(str);
 
  System.out.println("After Reversed String is: " + str2.reverse());
 }

    
}
