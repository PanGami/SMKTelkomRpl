import java.util.Scanner;
public class Biodata {
    public static void main(String[] args) {
        // Inisialisasi variabel scanner
        Scanner input = new Scanner(System.in);
        // Input Data dari user dan menyimpan data tersebut
        System.out.print("Masukkan nama lengkap anda : ");
        String namaLengkap = input.next();
        System.out.print("Masukkan Nama akrab anda : ");
        String namaAkrab = input.next();
        System.out.print("Masukkan tempat lahir anda : ");
        String tempatLahir = input.next();
        System.out.print("Masukkan tanggal lahir anda : ");
        String tanggalLahir = input.next();
        System.out.print("Masukkan asal kota anda : ");
        String asalKot = input.next();
        System.out.print("Masukkan asal SMP anda : ");
        String asalS = input.next();
        System.out.print("Masukkan hobi anda : ");
        String hobi = input.next();
        System.out.print("Masukkan motivasi anda : ");
        String motivasi = input.next();
        System.out.print("Masukkan prestasi anda : ");
        String prestasi = input.next();
        // Menampilkan data yang diambil dari variabel scanner
        System.out.println("---------------BIODATA ANDA----------------");
        System.out.println("Nama lengkap     : " + namaLengkap);
        System.out.println("Nama akrab       : " + namaAkrab);
        System.out.println("Tempat lahir     : " + tempatLahir);
        System.out.println("Tanggal lahir    : " + tanggalLahir);
        System.out.println("Jenis Kelamin    : " + asalKot);
        System.out.println("Alamat di Malang : " + asalS);
        System.out.println("Hobi             : " + hobi);
        System.out.println("Motivasi         : " + motivasi);
        System.out.println("Prestasi         : " + prestasi);
}
}