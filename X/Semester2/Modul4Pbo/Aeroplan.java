public class Aeroplan extends Vehicle{    
    @Override
    public void walk(){
        System.out.println("Aeroplan is Flying");
    }
    @Override
    public void fuel(){
        System.out.println("Fuels");
    }

    public static void main(String[]args){        
        Aeroplan garuda = new Aeroplan();
        garuda.function();
        garuda.fuel();
        garuda.walk();
    }   
}