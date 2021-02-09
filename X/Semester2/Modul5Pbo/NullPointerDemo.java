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
public class NullPointerDemo {
    public static void main(String[] args) {
        try{
            String name=null;
            System.out.print("Length of the string"+name.length());
        }catch(NullPointerException e){
            System.out.println("Terjadi Exception!");
            System.out.println("Detail :" + e);
        }
    }
}
    

