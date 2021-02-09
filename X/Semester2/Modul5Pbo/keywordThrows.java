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
public class keywordThrows {

    public static void test(int n)
        throws NullPointerException, java.lang.ArithmeticException {
            if (n < 0) {
                throw new NullPointerException(
                        "KESALAHAN: null pointer");
            } else {
                throw new java.lang.ArithmeticException(
                    "KESALAHAN: arithmetic exception");
        }
    }
 
    public static void main(String[] args) {
        try {
            //test(-12); // menimbulkan eksepsi NullPointerException
            test(0); // menimbulkan eksepsi ArithmeticException
        } catch (java.lang.ArithmeticException | NullPointerException e) {
            System.out.println("Eksepsi ditangkap di sini...");
            System.out.println(e.getMessage());
        }
        System.out.println("Statemen setelah blok try-catch"); 
    }
}
