package UKL_Kedua.Lelang02;
import java.util.ArrayList;
import java.util.Scanner;

public class Lelang implements interfaceClass01{
    private ArrayList<Integer> idPenawar = new ArrayList<Integer>();
    private ArrayList<Integer> idBarang = new ArrayList<Integer>();
    private ArrayList<Integer> hargaTawar = new ArrayList<Integer>();

    boolean keluarLelang = true;
    boolean keluarProsesLelang = true;
    int max = 0;
    Scanner input = new Scanner(System.in);

    public void prosesLelang(Barang barang,Petugas petugas,Masyarakat masyarakat,int index){
        do{
            System.out.println("========= MEMULAI PELELANGAN =========");
            barang.checkBarang();
            System.out.print("Konfirmasikan index barang lagi ! ");
            index = input.nextInt();
            this.idBarang.add(index); //Memasukkan data ke idBarang                        

            System.out.print("\n======== Masukkan id Petugas =========" + 
            "\nPetugas Dengan id : ");            
            int indexPetugas = input.nextInt();
            System.out.println(
                "Petugas Bernama : "+petugas.getNama(indexPetugas));        

            System.out.print("\n========= Lelang Berlangsung =========");
            System.out.print(
                "\nId Barang   : " + barang.getId(index) + 
                "\nDengan Nama : " + barang.getNamaBarang(index) +
                "\nHarga Awal  : " + barang.getHarga(index) + 
                "\nBerstatus   : " + barang.getStatus(index) + 
                "\n======================================\n"); 
            
            while(keluarProsesLelang){
                if(barang.getStatus(index) == false){
                    System.out.println("Barang yang akan dilelang sudah tidak ada!");                    
                    break;
                }
                System.out.print(
                    "\n======================================" +
                    "\n\nMasukkan index Masyarakat yang menawar! ");
                int IndexPenawar = input.nextInt(); //Inputan idPenawar                    
                barang.getHarga(index); 
                System.out.println(masyarakat.getNama(IndexPenawar) + " Silahkan masukkan Penawaran");                
                int hargaTawar =  input.nextInt();                    
                if(barang.getHarga(index) < hargaTawar){
                    if(max < hargaTawar){ // Mengecheck apakah Valid atau tidak                    
                        max = hargaTawar; 
                        setId(IndexPenawar);
                        setHarga(hargaTawar);
                    }else{
                        System.out.println("Harga Tawar Tidak Valid!");
                }
                }else{System.out.println("Mohon Masukkan harga diatas harga Awal!");}                    
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
                        "\nDengan Harga    : " + max +
                        "\n=====================================\n"); 
                }  
            }
            
           System.out.println("Apakah Anda Ingin melanjutkan lelang? true / false");
           keluarLelang = input.nextBoolean();                     

        }while(keluarLelang);
    }

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
