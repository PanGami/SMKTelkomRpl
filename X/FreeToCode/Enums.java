enum Keadaan{
MATI,HIDUP
}

public class Enums {
    public static void main (String[]args){
    Keadaan objA = Keadaan.MATI;
    // Print variable
    System.out.println(objA);
    // Menggunakan switch case
    switch(objA){
        
        case MATI:
            System.out.println("Telah Mati");
            break;
        case HIDUP:
            System.out.println("Masih Hidup");
            break;
    }
    
        System.out.println("==== PILIHAN ANTARA ====");
    // Menggunakan For each loop
        for(Keadaan objX : Keadaan.values()){
            System.out.println(objX);
        }
    
    }
}
// Note : Some sample Enum uses include month 
//        names, days of the week, deck of cards.
// Data yang tidak akan berubah / variablenya final