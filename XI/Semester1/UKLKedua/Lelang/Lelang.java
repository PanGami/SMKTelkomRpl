package UKL_Kedua.Lelang;
import java.util.ArrayList;
import java.util.Scanner;

public class Lelang implements interfaceClass01{
    private ArrayList<Integer> idPenawar = new ArrayList<Integer>();
    private ArrayList<Integer> idBarang = new ArrayList<Integer>();
    private ArrayList<Integer> hargaTawar = new ArrayList<Integer>();
    private ArrayList<String> temp = new ArrayList<String>();
    boolean keluarLelang = true;
    boolean keluarProsesLelang = true;
    int max = 0;
    Scanner input = new Scanner(System.in);

    // ======== Proses Lelang ========
    // Memasukkan index Barang yang akan dilelang
    public void prosesLelang(Barang barang,Petugas petugas,Masyarakat masyarakat,int index){
        do{
            this.idBarang.add(index); //Memasukkan data ke idBarang

            //Mengecheck apakah Barangnya masih ada
            barang.checkBarang();

            System.out.print("==== Masukkan id Petugas =====" + 
            "\nPetugas Dengan id : ");            
            int indexPetugas = input.nextInt();
            System.out.println(
                "Petugas Bernama : "+petugas.getNama(indexPetugas));        

            System.out.print("======= Lelang Berlangsung =======");
            System.out.print(
                "\nId Barang   : " + barang.getId(index) + 
                "\nDengan Nama : " + barang.getNamaBarang(index) +
                "\nHarga Awal  : " + barang.getHarga(index) + 
                "\nBerstatus   : " + barang.getStatus(index) + 
                "\n=================================\n"); 
            
            while(keluarProsesLelang){
                if(barang.getStatus(index) == false){
                    System.out.println("Barang yang akan dilelang sudah tidak ada!");                    
                    break;
                }
                System.out.print(
                    "\n=================================" +
                    "\nMasukkan index Masyarakat yang menawar!");
                int IndexPenawar = input.nextInt(); //Inputan idPenawar                    
                System.out.println(masyarakat.getNama(IndexPenawar) + " Silahkan masukkan Penawaran");
                int hargaTawar =  input.nextInt();                    
                if(max < hargaTawar){
                    //Jika sudah Valid baru dimasukkan ke Arraylist!
                    max = hargaTawar; 
                    setId(IndexPenawar);
                    setHarga(hargaTawar);
                }else{
                    System.out.println("Harga Tawar Tidak Valid!");
                }                    
                System.out.print("Apakah Ada Yang Ingin Menawar Lebih? true/false ");
                keluarLelang = input.nextBoolean();
                if(!keluarLelang){
                    barang.editStatus(index,false);
                    System.out.print(
                        "\nId Barang       : " + barang.getId(index) + 
                        "\nDengan Nama     : " + barang.getNamaBarang(index) +
                        "\nHarga Awal      : " + barang.getHarga(index) + 
                        "\nBerstatus       : " + barang.getStatus(index) + 
                        "\nDidapatkan oleh : " + masyarakat.getNama(IndexPenawar) +
                        "\nDengan Harga    : " + hargaTawar +
                        "\n=================================\n"); 
                }  
            }
            
           System.out.println("Apakah Anda Ingin melanjutkan lelang? true / false");
           keluarLelang = input.nextBoolean();                     

        }while(keluarLelang);
    }

    // ======== Method Setter ========
    public void setIdBarang(Barang barang,int index){
        this.idBarang.add(barang.getId(index));
    }
    @Override
    public void setId(int idPenawar) {
        this.idPenawar.add(idPenawar);
    }
    @Override
    public void setHarga(int harga) {
        this.hargaTawar.add(harga);
    }


    @Override
    public int getHarga(int index) {
        return this.hargaTawar.get(index);
    }
    @Override
    public int getId(int index) {
        return this.getId(index);
    }
}
