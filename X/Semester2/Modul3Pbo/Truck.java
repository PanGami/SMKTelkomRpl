public class Truck {
    
    //the Truck class has three fields
    public int cadence;
    public int gear;
    public int speed;
    //the Truck class has one constructor
    public Truck(int startCadence,int startSpeed, int startGear){
        gear = startGear;
        cadence = startCadence;
        speed = startSpeed;
    }
    //the truck class has four methods
    public void setCadence(int newValue){
        cadence = newValue;
    }
    public void setGear(int newValue){
        gear = newValue;
    }
    public void applyvraje(int decrement){
        speed = decrement;
    }
    public void speedUp(int increment){
        speed = increment;
    }
}
