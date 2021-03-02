public class Karyawan {
    
    String nama = "Fulan";
    String gender = "Laki-laki / Perempuan";
    String devisi = "admin";
    String noPegawai = "000000";
    int gajiUtama = 0;
    double gajiPlus = gajiUtama*2;
    
    // Untuk Override
    void cetak(){
        System.out.print("");
    }
    
    // Untuk Overload
    String kataTambahan(){
    return "Default dari Superclass!";
    }
   
}
    

class Karyawan1 extends Karyawan{
    
    String nama = "diah";
    String gender = "Perempuan";
    String devisi = "Supervisor";
    int noPegawai = 333333;
    int gajiUtama = 1200000;
    int gajiPlus = gajiUtama*2;
    
    // Overriding Terjadi!
    void cetak(){
        System.out.println("Berikut identitas pegawai:");
        System.out.println("Nama = " + nama);
        System.out.println("Jenis kelamin = " + this.gender);
        System.out.println("Nomor pegawai " + this.noPegawai);
        System.out.println("Bekerja di bagian " + super.devisi);
        System.out.println("Gaji utama yang didapat " + this.gajiUtama);
        System.out.println("Gaji yang didapat jika bekerja secara "
                + "baik menjadi " + gajiPlus);
    }    
    
}   
class Karyawan2 extends Karyawan{
    
    Karyawan1 k1 = new Karyawan1();
    String nama = "Panca";
    String gender = "Laki-laki";
    int noPegawai = 999999999;
    
    // Overriding Terjadi!
    // Mendalami super, this, default, dan data dari membuat suatu objek 
    void cetak(){
        System.out.println("Berikut identitas pegawai:");
        System.out.println("Nama = " + nama);
        System.out.println("Jenis kelamin = " + this.gender);
        System.out.println("Nomor pegawai " + super.noPegawai);
        System.out.println("Bekerja di bagian " + k1.devisi);
        System.out.println("Gaji utama yang didapat " + gajiUtama);
        System.out.println("Gaji yang didapat jika bekerja secara "
                + "baik menjadi " + gajiPlus);
    }
    
    // Overloading Terjadi
    String kataTambahan(String kata){    
        return kata;
    }
}
    






