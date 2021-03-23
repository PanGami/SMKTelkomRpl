
package LearnOOPGame;

public class Enemy2 extends GameObject2{
    public void setName(String name){
        super.name = name;
    }    
    public String getName(){
        return name;
    }    
    public void setHP(int hp){
        super.HP = hp;
    }
    public int getHP(){
        return HP;
    }
    public void setDamage(int damage){
        super.damage = damage;
    }
    public int getDamage(){
        return damage;
    }
    @Override
    public void display(){
        System.out.println("Name =" + getName());
        System.out.println("Damage =" + getDamage());
        System.out.println("HP =" + getHP());
    }
}
