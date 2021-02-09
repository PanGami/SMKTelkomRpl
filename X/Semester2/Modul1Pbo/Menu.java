
package Satu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class Menu
{
    public static void main(String[] args)
    {
    try
        {
        System.out.println("Pengolahan Bangun Geometri");
        InputStreamReader r = new InputStreamReader(System.in);
        BufferedReader input = new BufferedReader(r);
        Test test = new Test();
        String pil;
        int p = 9;
        while(p!=0)
            {
            System.out.println("Menu");;
            System.out.println("[1] Tabung");
            System.out.println("[2] Kubus");
            System.out.println("[3] Balok");
            System.out.println("Masukkan angka pilihan");
            pil = input.readLine();
            p = Integer.parseInt(pil);
            switch(p)
                {
                case 1: test.tabungTestDrive(); break;
                case 2: test.kubusTestDrive(); break;
                case 3: test.balokTestDrive(); break;
                }
            System.out.println("Lanjutgan?(O = keluar/1 = tidak)");
            pil = input.readLine();
            p = Integer.parseInt(pil);
            }
        }
    catch(IOException e)
        {
        System.out.println("Error tidak dikenali");
        }

    }

}
