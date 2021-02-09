/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan;

/**
 *
 * @author ARIFIN
 */
public class TestTryCathFinally {
  static void myMethod(int testnum) throws Exception {
      System.out.println ("start - myMethod");
      if (testnum == 14) 
         throw new Exception();
      System.out.println("end - myMethod");
      return;	
   }
   public static void main(String  args[]) {
      int testnum = 12;
      try {
         System.out.println("try - first statement");
         myMethod(testnum);
         System.out.println("try - last statement");
      }
      catch ( Exception ex) {
         System.out.println("An Exception");
      }
      finally {
         System. out. println( "finally") ;
      }
      System.out.println("Out of try/catch/finally - statement");
   }
}
