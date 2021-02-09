public class KantinSatu {
       
    public String namaKoki;
    public int modalPerMakanan;
    public int hargaJual;
    public String namaMakanan;
    
    public KantinSatu(String nk,int mpm,int hj,String nm){
        namaKoki = nk;
        modalPerMakanan = mpm;
        hargaJual = hj;
        namaMakanan = nm;
    }
    
    //Menghitung keuntungan
    public int keuntungan(){
        return (hargaJual - modalPerMakanan);
    }
    
    //Menhitung pajak yang berlaku,misalkan pajak per untung 10%
    public int getPajak(){
        return (int) (0.1*this.keuntungan());
    }
    public String motto(){
        return ("Memberitahu tentang semua yang ada! Dapat dipercaya!");
    }
}
