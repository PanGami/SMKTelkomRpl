import java.util.LinkedList;
public class BelajarLinkedList {
    public static void main(String[]args){
        
        LinkedList<String> namaVariable = new LinkedList<String>();
        
        namaVariable.add("Masuk Ke Index Ke-0");
        namaVariable.add("Masuk Ke Index Ke-1");
        namaVariable.add("Masuk Ke Index Ke-2");
        
        namaVariable.remove(0);
        //namaVariable.remove("masuk Ke index-0"); juga sama
        
        namaVariable.set(0, "Sekarang index-1 menjadi Index-0");
        namaVariable.set(1, "Sekarang index-2 menjadi Index-1");
        
        System.out.println(namaVariable.size()); //size nya dihitung mulai dari 1
        
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
