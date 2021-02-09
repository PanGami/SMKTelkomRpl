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
public class tryCatch {

    public static void main(String[] args) { // pemanggilan fungsi main
        int a = 35; // deklarasi tipe data
        int b = 5; // deklarasi tipe data
        try { // blok try atau blok pengujian
            int x = a / b;
            System.out.println("Hasil: " + x); // tampilan keluaran nilai hasil
            int[] angka = {1, 2, 3, 4, 5}; // array dengan 5 elemen
            angka[4] = 5; // mengakses indek ke 24
        }catch (ArrayIndexOutOfBoundsException ai) { //blok jika terjadi kesalahan pada ArrayIndexOutOfBoundsException 
            System.out.println("Terjadi kesalahan pada inputan Arraynya");
            System.out.println(ai);
        }
        //blok jika terjadi kesalahan pada ArithmeticException
         catch (Exception e) {
            System.out.println("Salah");
            System.out.println(e);
        }
        System.out.println("Selesai");
    }

}
