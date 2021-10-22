package UKL_Kedua.TokoOnline;

public class javaApps {
    public static void main(String[]args){
        try{
        Barang barang = new Barang();
        Karyawan karyawan = new Karyawan();
        Laporan laporan = new Laporan();
        Member member = new Member();
        Transaksi transaksi = new Transaksi();
    
        laporan.laporan(barang);
        laporan.laporan(member);
        laporan.laporan(transaksi,barang);

        //transaksi.prosesTransaksi(member, transaksi, barang);
        laporan.laporan(transaksi, barang);
        laporan.laporan(barang);
        laporan.laporan(member);
        }catch(Exception e){
            System.out.println("Terdapat Exception! \n Info : " + e.getMessage());
        }
    }
}