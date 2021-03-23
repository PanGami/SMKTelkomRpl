package LearnOOPGame;

public class GameTest extends GameObject{
    
    // Menganti parameter sehingga disebut overload 
    // Menganti isi method/function (yang didalam curly braces disebut override
    public static String running(String tujuan){
        return ("Berlari menuju " + tujuan);
    }
    public static String running(String tujuan,int banyakTeam){
        return ("Berlari " + tujuan + "\n Dengan jumlah " + banyakTeam);
    }
    
    public static void main(String[]args){
        GameObject panca = new GameObject();                         
        panca.setDamage(777);
        panca.defend(157);
        panca.setHp(3000);
        running("VrindaFun");  
        
        GameObject beban = new GameObject();                         
        beban.setDamage(9999999);
        beban.defend(0);
        beban.setHp(99999999);
        running("Player",7);  
        
        System.out.println("CHECK PROFILE");
        
        
        System.out.println(panca.getHp());
        
    }
    
}
