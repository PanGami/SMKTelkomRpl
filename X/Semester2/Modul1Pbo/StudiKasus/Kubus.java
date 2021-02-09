
package Satu;

public class Kubus {
    private int sisi;
    private double volume,luasPermukaan;
    
    public void setSisi(int s){
        sisi = s;
    }
    public void setVolume(){
        volume = Math.pow(sisi,3);
    }
    public void setLuasPermukaan(){
        luasPermukaan = 6*(Math.pow(sisi,2));
    }
    public int getSisi(){
        return sisi;
    }
    public double getVolume(){
        return volume;
    }
    public double getLuasPermukaan(){
        return luasPermukaan;
    }
}
