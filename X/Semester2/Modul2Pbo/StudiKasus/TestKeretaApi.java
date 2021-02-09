// Panca Nugraha Wicaksana_29_XR3
package Dua;
public class TestKeretaApi {
    public static void main(String[]args){        
        
    // Membuat kereta baru dengan maksimal penumpang x
    KeretaApi keretaA = new KeretaApi(35);
        
        // Mengisi nilai
        keretaA.addNamaPenumpang('Z');
        keretaA.addhargaTiket(35000);
        keretaA.cetakPenumpang();
        // penambahan penumpang
        keretaA.addPenumpang(30); //tambah 30 penumpang
        keretaA.cetakPenumpang();
        //penambahan penumpang
        keretaA.addPenumpang(3); //tambah 3 penumpang
        keretaA.cetakPenumpang();
        //penambahan penumpang
        keretaA.addPenumpangBaru(2); //tambah 2 penumpang khusus
        keretaA.cetakPenumpang();
        keretaA.addPenumpangBaru(1); //tambah 1 penumpang khusus       
        keretaA.getPenumpangBaru();
        // sebanyak x penumpang telah membayar
        keretaA.addPembayaran(35);      
        keretaA.cetak();
    }    
}
