// Panca Nugraha Wicaksana_29_XR3
package Dua;
public class KeretaApi {
    private int penumpang;
    private double maxPenumpang;    
    private double penumpangBaru;
    private double counter;
    private double hargaTiket;
    private char namaPenumpang;
    private double pembayaran;
    private double totalPembayaran;
    
    // Class Kereta api Contructor
    public KeretaApi(double maxPenumpang){
        this.maxPenumpang = maxPenumpang;
        penumpang = 0;
    }
    // Method Mutator agar penumpang bertambah
    public void addPenumpang(int penumpang){
        double temp;
        temp = this.penumpang+penumpang;
        if(temp > maxPenumpang){
            System.out.println("Penumpang melebihi kuota");
        }else{
            this.penumpang=(int) temp;
            counter++;
        }
    }
    public String getPenumpang(int penumpang){
        return "Note! inputan pada method ini tidak berarti apa apa!" + 
                "total penumpang sekarang adalah " + this.penumpang;
    }
    // Method mutator agar penumpang bertambah
    // Ini adalah penumpang khusus atau penumpang
    // yang tidak terencana
    public void addPenumpangBaru(double penumpangBaru){        
        if((penumpangBaru+penumpang) > maxPenumpang ){
            System.out.println("Sudah Tidak Muat!");
        }else{
            penumpang += penumpangBaru;
            this.penumpangBaru = penumpangBaru;
        }
    }
    // Mengakses data penumpang baru
    public String getPenumpangBaru(){
        return penumpangBaru + "Ikut kedalam kelompok penumpang"
                + " berinisial " + namaPenumpang;
    }
    // Inisial Seluruh penumpang dalam satu huruf
    // atau sebutan kelompok penumpang dalam satu kereta
    public void addNamaPenumpang(char namaPenumpang){
        this.namaPenumpang = namaPenumpang;
    }
    // Harga pertiket kereta
    public void addhargaTiket(double hargaTiket){
        this.hargaTiket = hargaTiket;        
    }
    // Mengakses data harga tiket
    public double getHargaTiket(){
        return hargaTiket;
    }
    // jumlah Yang Berhasil melakukan pembayaran
    public void addPembayaran(double pembayaran){
        this.pembayaran = pembayaran;
    }
    // Total uang dari penumpang yang membayar
    public double getTotalPembayaran(){          
        totalPembayaran = pembayaran*hargaTiket;
        return totalPembayaran;
    }
    //Average atau rata-rata
    public double getAverage(){
        return penumpang/counter;
    }
    // Untuk Output mengenai data Penumpang
    public void cetakPenumpang(){
        System.out.println("Penumpang Kereta Sekarang= "+penumpang);
        System.out.println("Maksimum penumpang yang seharusnya adalah = "+ 
                maxPenumpang);
    }
    public void cetak(){
        System.out.println("Rata-rata : " + getAverage());
        System.out.println("Mendapat total Pembayaran : " 
                + getTotalPembayaran() + "\n Dengan pembayar sebanyak "
                        + totalPembayaran/hargaTiket);
        System.out.println("Harga tiket " + getHargaTiket());
    }
}
