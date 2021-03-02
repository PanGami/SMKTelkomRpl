class Panca {
    public void buatSuara(){
        System.out.println("Hallo man teman!!!");
    }
}
class Kaget extends Panca{
    @Override
    public void buatSuara(){
        System.out.println("e kaget aku!");
    }
}
class Perkenalan extends Panca{
    @Override
    public void buatSuara(){
        System.out.println("Hai, namaku Panca!");
    }
}

public class Pewarisan {
 
    
   public static void main(String[]args){
     
       
       Panca panca = new Panca();
       panca.buatSuara();
       
       Panca Kaget = new Kaget();
       Kaget.buatSuara();
       
       Panca perkenalan = new Perkenalan();
       perkenalan.buatSuara();
       
       panca.buatSuara();
       
   }
}
    
    

