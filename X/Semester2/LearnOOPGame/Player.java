package LearnOOPGame;

public class Player extends GameObject{    
         
    // Menganti parameter sehingga disebut overload 
    // Menganti isi method/function (yang didalam curly braces disebut override
    public static String running(String tujuan){
        return ("Berlari menuju " + tujuan);
    }
    
    public static void main(String[]args){
      
        GameObject panca = new GameObject();                         
        panca.setDamage(777);
        panca.defend(157);
        panca.setHp(3000);
        running("VrindaFun");  
                
    }
}
