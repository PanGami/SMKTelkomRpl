
package LearnOOPGame;

public class Hero2 extends GameObject2{
    int ID;
    public void setID(int ID){
        this.ID = ID;
    }
    public int getID(){
        return ID;
    }
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
