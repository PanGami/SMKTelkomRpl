package Latihan;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ARIFIN
 */
public class ArithmeticException {
    public static void main(String args[])
    {
        //int a=100;
        //System.out.println("Enter the value for b");
         Scanner console = new Scanner(System.in);
	// int b = console.nextInt();     
        System.out.println("Enter the value for c");
        try{
	int c = console.nextInt();
        int res=c/0;
        // 10/(b-c);
        System.out.println(" The result is "+res);
        }catch (Exception e){
            System.out.println("Terjadi Exception! ");
            System.out.println("Detail : " + e);
            System.out.println("Program Selesai");
        }
    }    
}
