
// Sequensial
// Branching
// looping

// Back-end
// Node.js dari javaScript
// laravel dari PHP
// React.js
// Vue.js

//kelas 3 android studio


// Buatlah dua kelas ( kelas , siswa )
// private nama kelas dan kode kelas
import java.util.Scanner;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
public class Test2{

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int result=-240;
        int n = in.nextInt(); // the number of temperatures to analyse
        for (int i = 0; i < n; i++) {
            int t = in.nextInt(); // a temperature expressed as an integer ranging from -273 to 5526
            if(t<0 && t>result){
                result = t;
            }else if(t>=0 && t<=result){
                result = t;
            }else if(Math.abs(result)==t){
                result = t;
            }else{
                result = 999;
            }
        }

        // Write an answer using System.out.println()
        // To debug: System.err.println("Debug messages...");

        System.out.println(result);
    }
}
