import java.util.Scanner; //import library
public class modul6Per2 {
   public static void main(String[]args){
       
       //Deklarasi atau Inisialisasi
       Scanner masuk = new Scanner(System.in);
       String namaSiswa[]= {"Deanne","Victoria","Erna","Nathalie","Pamela","Armand","Omar","Alvaro","Ben","Danny"};
       System.out.print("Ketikan Nama Siswa ! : ");
       String nama = masuk.next();
       
       //For loop dan operator logika beserta output
       for (String namaSiswa1 : namaSiswa) {
           if (namaSiswa1.equals(nama)) {
               System.out.println("Data ditemukan");    
            
           
           } else {
           }
       }
       System.out.println("Data tidak ditemukan");
       }

}
