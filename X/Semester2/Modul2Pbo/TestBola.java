public class TestBola {
    public static void main(String[]args){
        double jarijari=9;
        Bola bola1 = new Bola(5);
        bola1.showDiameter();
        bola1.showLuasPermukaan();
        bola1.showVolume();
        System.out.println("");
        
        bola1.setJarijari(jarijari); //manipulasi objek yaitu bola1
        bola1.showDiameter();
        bola1.showLuasPermukaan();
        bola1.showVolume();
    }
}
