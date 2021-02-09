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
public class demoThrow {

    public static void main(String[] args) {
        Barang obj = new Barang();
        obj.setKode("123");
        obj.setNama(null);
        obj.setHarga(0);
        System.out.println("\nKode : " + obj.getKode());
        System.out.println("Nama : " + obj.getNama());
        System.out.println("Harga : " + obj.getHarga());
    }

}
