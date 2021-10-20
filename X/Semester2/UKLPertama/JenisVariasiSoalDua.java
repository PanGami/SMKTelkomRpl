// Buatlah program untuk menghitung berapa biaya yang harus dikeluarkan mahasiswa yang menampilkan 
// Output <<<<<<<<<<<<<
// id mahasiswa, nama mahasiswa, jalur masuk,kategori Pendapatan,
// jumlah biaya yang dikeluarkan,alamat
// Input <<<<<<<<<<<
// id pelanggan, Pendapatan orang tua dan jumlah bulan SPP yang akan dibayar
package UKLPertama;
import java.util.Scanner;
public class JenisVariasiSoalDua {    
    public static void main(String[] args) {
        try{                        
            int DSP=0,SPP=0,totalBiaya=0;
            String alamat = "",jalurMasuk="",kategori="";
            String[]pelanggan ={"Mira","Nina","Oemar","Pena"};        
            Scanner input = new Scanner(System.in);
            System.out.println("Masukkan ID Pelanggan");
            int id = input.nextInt();
            System.out.println("Masukkan Pendapatan Orang tua anda");
            int penOrtu = input.nextInt();
            System.out.println("Berapa Bulan SPP yang akan dibayar?");
            int bulanSPP = input.nextInt();

            switch(id){
                case 1:
                    jalurMasuk = "SBMPTN";
                    alamat = "Sawojajar";
                    break;
                case 2:
                    jalurMasuk = "SNMPTN";
                    alamat = "Kedung kandang";
                    break;
                case 3:
                    jalurMasuk = "Mandiri";
                    alamat = "Ijen";
                    break;
                case 4:
                    jalurMasuk = "SBMPTN";
                    alamat = "Dinoyo";
                    break;
                default:
                    throw new Exception("TERDAPAT KESALAHAN PADA INPUT ID!");
            }
            
            if(penOrtu>10000000) kategori = "A";
            else if(penOrtu>=2000000)kategori = "B";
            else if(penOrtu<2000000)kategori = "C";
            else throw new Exception("TERDAPAT KESALAHAN PADA INPUT PENDAPATAN!");
            
            if(jalurMasuk.equalsIgnoreCase("SBMPTN")){
                switch(kategori){
                    case "A":
                        DSP = 5000000;
                        SPP = 500000;
                        break;
                    case "B":
                        DSP = 15000000;
                        SPP = 1000000;
                        break;
                    case "C":
                        DSP = 30000000;
                        SPP = 2000000;
                        break;
                    default:
                        throw new Exception("TERDAPAT KESALAHAN PADA PERHITUNGAN DSP SPP!");
                }
            }else if(jalurMasuk.equalsIgnoreCase("SNMPTN")){
                switch(kategori){
                    case "A":
                        DSP = 7000000;
                        SPP = 500000;
                        break;
                    case "B":
                        DSP = 15000000;
                        SPP = 1000000;
                        break;
                    case "C":
                        DSP = 35000000;
                        SPP = 2000000;
                        break;
                    default:
                        throw new Exception("TERDAPAT KESALAHAN PADA PERHITUNGAN DSP SPP!");
                }
            }else if(jalurMasuk.equalsIgnoreCase("Mandiri")){
                switch(kategori){
                    case "A":
                        DSP = 10000000;
                        SPP = 1000000;
                        break;
                    case "B":
                        DSP = 25000000;
                        SPP = 2000000;
                        break;
                    case "C":
                        DSP = 50000000;
                        SPP = 3000000;
                        break;
                    default:
                        throw new Exception("TERDAPAT KESALAHAN PADA PERHITUNGAN DSP SPP!");
                }
            }else throw new Exception("TERDAPAT KESALAHAN PADA INPUT PENDAPATAN!");
            
            totalBiaya = DSP + (SPP*bulanSPP);
            System.out.println("\t====== Print Out Info ======");
            System.out.println("ID Mahasiswa         \t:" + id);
            System.out.println("Nama Mahasiswa       \t:" + pelanggan[id-1]);
            System.out.println("Jalur Masuk Mahasiswa\t:" + jalurMasuk);            
            System.out.println("Alamat Pelanggan     \t:" + alamat);
            System.out.println("Kategori Pendapatan  \t:" + kategori);
            System.out.println("\t    ====== TAGIHAN ======");
            System.out.println("Biaya DSP            \t:" + DSP);
            System.out.println("Biaya SPP            \t:" + SPP + " x " + bulanSPP + " Bulan");
            System.out.println("Total Biaya          \t:" + totalBiaya + " Rp");
        }catch(Exception e){System.err.println(e);}
    }
}
