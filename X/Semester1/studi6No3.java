public class studi6No3 { //Main Class Bersifat public
    public static void main(String[]args){
        //Deklarasi
        String[][] laptop = { {"lenovo","5.000.000"},{"hp","7.000.000"},{"LG","3.000.000"},{"DELL","1.500.000"},
            {"panca","5.000.000"}};
        //Perulangan For each loop dan Mencetak merek beserta harga
        for (String[] laptop1 : laptop) {
            System.out.println("merek : " + laptop1[0]);
            System.out.println("harga : " + laptop1[1]);
            System.out.println("----------------------"); 
        }
    } 

    
}
