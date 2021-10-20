package LearnOOPGame;

public class Enemy extends Player{
    
    // Menganti isi method/function (yang didalam curly braces disebut override    
    public static String running(String tujuan,int banyakTeam){
        return ("Berlari " + tujuan + "\n Dengan jumlah " + banyakTeam);
    }
    
    public static void main(String[]args){
        GameObject beban = new GameObject();                         
        beban.setDamage(9999999);
        beban.defend(0);
        beban.setHp(99999999);
        running("Player",7);          
    }
}
