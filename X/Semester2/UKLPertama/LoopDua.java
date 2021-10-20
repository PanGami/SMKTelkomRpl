/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UKLPertama;

/**
 *
 * @author 62812
 */
public class LoopDua {
    public static void main(String[] args) {
        int a=2,b=3,n=24,sum=0,counter=0;        
        for(int i=0;i<n;i++){            
            a+=b;
            sum+=a;
            System.out.print(a+"\t");
            counter++;
            if(counter ==4){
                System.out.println();
                counter =0;
            }
        }
        System.out.println("\nJumlah Deret adalah : " + sum);
    }
}
