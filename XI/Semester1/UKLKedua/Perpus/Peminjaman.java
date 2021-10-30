package UKL_Kedua.Perpus;
import java.util.ArrayList;
import java.util.Scanner;
public class Peminjaman {
 private ArrayList<Integer> idBuku = new ArrayList<Integer>();
 private ArrayList<Integer> banyak = new ArrayList<Integer>();
 private ArrayList<Integer> idSiswa = new ArrayList<Integer>(); 
 
 public Peminjaman() {
    this.idSiswa.add(0);
    this.idBuku.add(0);
    this.banyak.add(2);
    this.idSiswa.add(0);
    this.idBuku.add(1);
    this.banyak.add(3);
    this.idSiswa.add(1);
    this.idBuku.add(0);
    this.banyak.add(1);
    this.idSiswa.add(1);
    this.idBuku.add(2);
    this.banyak.add(2);
 }
 public void prosesTransaksi(Siswa siswa, Peminjaman transaksi, Buku buku){
    Scanner myObj = new Scanner(System.in); 
    int temp;
    int idSiswa;
    System.out.println("Silahkan Meminjam Buku Di PanBuku.id");    
    do{
    System.out.println("Masukkan ID Siswa");
    idSiswa = myObj.nextInt(); 
    System.out.println("Selamat datang "+siswa.getNama(idSiswa));
    ArrayList<Integer> idBuku = new ArrayList<Integer>();
    ArrayList<Integer> banyak = new ArrayList<Integer>();
    int i=0;
    temp=0;    
        System.out.println("Masukkan kode Buku :");
        temp=myObj.nextInt();
        if (temp!=99 && siswa.getStatus(idSiswa) == false){
            idBuku.add(temp);
            System.out.print(buku.getNamaBuku(idBuku.get(i))+ " sebanyak : ");
            banyak.add(myObj.nextInt());
            i++;         
            siswa.editStatus(idSiswa, true);   
        }else if(siswa.getStatus(idSiswa) == true){
            System.out.print("Siswa Telah meminjam!");
            break;
        }        
    }while (temp!=99); 
    
    System.out.println("Transaksi belanja "+siswa.getNama(idSiswa)+" sebagai berikut");
    System.out.println("Nama Buku \tQty \tHarga \tJumlah \t");
    
    int total=0;
    int x = idBuku.size();
    for (int j = 0; j < x; j++){
        int jumlah=banyak.get(j) * buku.getHarga(idBuku.get(j));
        total+=jumlah;
        System.out.println(buku.getNamaBuku(idBuku.get(j))+"\t"+
        banyak.get(j)+"\t"+
        buku.getHarga(idBuku.get(j))+"\t"+ jumlah);
        transaksi.setTransaksi(buku, idSiswa, idBuku.get(j), 
        banyak.get(j));
    }
    
    System.out.println("Total Belanja : "+total);
    //siswa.editSaldo(idSiswa, siswa.getSaldo(idSiswa)-total);
}
    public void setTransaksi(Buku buku, int idSiswa, int idBuku, int banyaknya){
        this.idSiswa.add(idSiswa);
        this.idBuku.add(idBuku);
        this.banyak.add(banyaknya);
        buku.editStok(idBuku, buku.getStok(idBuku)-banyaknya);
    }
    public int getIdBuku(int id){
        return this.idBuku.get(id);
    } 
    public int getBanyaknya(int id){
        return this.banyak.get(id);
    } 
    public int getIdSiswa(int id){
        return this.idSiswa.get(id);
    } 
    public int getJmlTransaksi(){
        return this.idSiswa.size();
    } 
}
