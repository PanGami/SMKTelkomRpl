package LearnOOPGame;
public class GameObject {
    private int hp;
    private int damage;
    private int deff;
    
    GameObject(){          
        System.out.println("Membuat Objek baru!");
    }
    
    public void setHp(int hp){
        this.hp = hp;
    }
    public int getHp(){
        return hp;
    }
    
    public void setDamage(int damage){
        this.damage = damage;
    }
    public int getDamage(){
        return damage;
    }
    
    public void setDeff(int deff){
        this.deff = deff;
    }
    
    public void running(){}
    
    public int attack(int clickDamage){
        clickDamage *= damage;
        return clickDamage;
    }
    
    public int defend(int damageInput){        
        damageInput = damage-((30/100) *deff);
        return damageInput;
    }
    
}
