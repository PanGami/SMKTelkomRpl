
package UKLPertama;
import java.util.Scanner;
public class test {
    
    public static void main(String[] args) {
        
        String[]pelanggan={"Mira","Nina","Oemar","Pena"};
        String masuk="",alamat="",kategori="";
        int DSP=0,SPP=0,total=0;
        Scanner input = new Scanner(System.in);
        System.out.println("MASUKKAN ID PELANGGAN!");        
        int id = input.nextInt();
        System.out.println("Masukkan Pendapatan Ortu!");
        int penOrtu = input.nextInt();
        System.out.println("Berapa bulan SPP yg Akan dibayar?");
        int bulan = input.nextInt();
        
        switch(id){
            case 1:
                masuk = "SBMPTN";
                alamat = "Sawojajar";                
                break;
            case 2:
                masuk = "SNMPTN";
                alamat = "Kedung kandang";                
                break;
            case 3:
                masuk = "Mandiri";
                alamat = "Ijen";                
                break;
            case 4:
                masuk = "SBMPTN";
                alamat = "Dinoyo";                
                break;                                        
        }
        if(penOrtu>10000000){
            kategori = "A";
        }else if(penOrtu >=2000000){
            kategori = "B";
        }else if(penOrtu <2000000){
            kategori = "C";
        }
        
        if(masuk.equalsIgnoreCase("SBMPTN")){
            switch(kategori){
                case "A":
                    DSP+=5000000;
                    SPP+=500000;
                    break;
                case "B":
                    DSP+=15000000;
                    SPP+=100000;
                    break;
                case "C":
                    DSP+=30000000;
                    SPP+=2000000;
                    break;                    
            }                    
        }else if(masuk.equalsIgnoreCase("SNMPTN")){
            switch(kategori){
                case "A":
                    DSP+=7000000;
                    SPP+=500000;
                    break;
                case "B":
                    DSP+=17000000;
                    SPP+=100000;
                    break;
                case "C":
                    DSP+=35000000;
                    SPP+=2000000;
                    break;                    
            }
        }else if(masuk.equalsIgnoreCase("Mandiri")){
            switch(kategori){
                case "A":
                    DSP+=10000000;
                    SPP+=1000000;
                    break;
                case "B":
                    DSP+=25000000;
                    SPP+=2000000;
                    break;
                case "C":
                    DSP+=50000000;
                    SPP+=3000000;
                    break;                    
            }
        }
        total+=DSP;
        total+= bulan*SPP;
        System.out.println("============OUTPUT============");
        System.out.println("ID Mahasiswa   : \t"+ id);
        System.out.println("Nama Mahasiswa : \t"+ pelanggan[id-1]);
        System.out.println("Jalur masuk    : \t"+masuk);
        System.out.println("Kategori       : \t"+kategori);
        System.out.println("JUMLAH BIAYA   : \t"+total);
        System.out.println("DSP            : \t"+DSP);
        System.out.println("SPP            : \t"+SPP);
        
    }
}
