import java.util.ArrayList;
public class BelajarArrayList {
    
    public static void main(String[]args){
        
    ArrayList<String> namaVariable = new ArrayList<String>();
     
    namaVariable.add("masuk Ke index-0");
    namaVariable.add("masuk ke index-1");
    namaVariable.add("masuk ke index-2");
    
    namaVariable.remove("masuk Ke index-0");
    //namaVariable.remove(2); juga sama saja
    
    namaVariable.set(0, "Sekarang index-1 menjadi Index-0");
    namaVariable.set(1, "Sekarang index-2 menjadi Index-1");
    
    System.out.println(namaVariable.size()); //size nya dimhitung mulai dari 1
    
    //mencari data
    int mencari = namaVariable.indexOf("Sekarang index-1 menjadi Index-0");
    System.out.println(mencari);
    
    //print biasa
    System.out.println(namaVariable.get(0));
    
    //print semua dengan for each
        for(String a : namaVariable){
            System.out.println(a);
        }
    }
}
