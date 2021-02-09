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
public class demoMembuatEksepsi {

    public static int hitungFaktorial(int n)
            throws negativeNumberException {
        if (n < 0) {
            throw new negativeNumberException( // baris 31
                    "Bilangan tidak boleh negatif", n);
        }
        int hasil = 1;
        for (int i = n; i >= 1; i--) {
            hasil *= i;
        }
        return hasil;
    }

    public static void main(String[] args) {
        System.out.println("Pada saat menghitung 5!");
        try {
            System.out.println("Hasil = " + hitungFaktorial(5));
        } catch (negativeNumberException nne) {
            System.out.println("Bilangan : "
                    + nne.getBilangan());
//nne.printStackTrace();
        }
        System.out.println("\nPada saat menghitung -5!");
        try {
            System.out.println("Hasil = "
                    + // baris 55
                    hitungFaktorial(-5));
        } catch (negativeNumberException nne) {
            System.out.println("Bilangan : "
                    + nne.getBilangan());
            nne.printStackTrace();
        }
    }

}
