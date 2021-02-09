public class Modul2PboUjiBus { 
    public static void main(String[] args){ 
    
        //membuat objek busBesar dari Class Modul2PboBus
        Modul2PboBus busBesar = new Modul2PboBus(40);
        busBesar.cetak();
        
        //penambahan penumpang
        busBesar.addPenumpang(15); //menambahkan 15 penumpang
        busBesar.cetak();
        
        //penambahan penumpang
        busBesar.addPenumpang(5); //menambahkan 5 penumpang
        busBesar.cetak();
        
        //penambahan penumpang
        busBesar.addPenumpang(26); //menambahkan 26 penumpang
        busBesar.cetak();        
    }
}