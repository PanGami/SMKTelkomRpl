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
public class ArrayIndexDemo {
    
    public static void main(String args[])
    {
        int[] nums = {1, 2, 3};
        try{
        nums[4]=3;
        }
        catch(Exception e){
            System.out.println(e);

        }

        System.out.println(""+nums[2]);
        
    }
    
}