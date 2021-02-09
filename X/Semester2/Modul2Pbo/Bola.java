import java.lang.Math; //import dari library untuk membantu proses perhitungan
public class Bola {
    private double jarijari;
    
    public Bola(double jarijari){ //untuk data
        this.jarijari = jarijari;
    }
    
    public void setJarijari(double jarijari){ //untuk data
        this.jarijari=jarijari;
    }
    
    public void showDiameter(){ //output dan proses diameter
        System.out.println("Diameter Bola " + 2*jarijari);
    }
    
    public void showLuasPermukaan(){ //output dan proses luas permukaan
        System.out.println("Luas Permukaan Bola " + (4/3*Math.pow(jarijari,3)));
    }
    
    public void showVolume(){ //outout dan proses volume
        System.out.println("Volume Bola " + (4*Math.PI*Math.pow(jarijari,2)));
    }
}
