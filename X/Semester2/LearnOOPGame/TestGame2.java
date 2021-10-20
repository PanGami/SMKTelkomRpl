
package LearnOOPGame;
import java.util.Scanner;
public class TestGame2 {
    public static void main(String[]args){
        Hero2 Fighter = new Hero2();
        Enemy2 Minion = new Enemy2();
        GameObject2 Open = new GameObject2();
        Scanner input = new Scanner(System.in);
        
        Open.display();
        System.out.println("Masukkan nama Fighter!");
        Fighter.setName(input.next());
        System.out.println("Masukkan HP Fighter!");
        Fighter.setHP(input.nextInt());
        System.out.println("Masukkan Damage Fighter!");
        Fighter.setDamage(input.nextInt());
        Fighter.display();
        
        System.out.println("Masukkan nama Minion!");
        Minion.setName(input.next());
        System.out.println("Masukkan HP Minion!");
        Minion.setHP(input.nextInt());
        System.out.println("Masukkan Damage Minion!");
        Minion.setDamage(input.nextInt());
        Minion.display();
    }
}
