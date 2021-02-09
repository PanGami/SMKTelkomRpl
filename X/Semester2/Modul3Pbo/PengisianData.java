public class PengisianData {
    public static void main(String[]args){
        //Membuat objek lagi yaitu menu1
        KantinSatu menu1 = new KantinSatu("Koki Panca Nugraha",5000,15000,"Ikan Ikanan enak");
        
        //Detail menu1
        System.out.println("\n1) Inilah Detailnya!\n    1a) Pemasak : " + menu1.namaKoki + " | Modal membuat perMakanan: "+ menu1.modalPerMakanan +" | Kami menjual seharga: "
                            + menu1.hargaJual +" \n        |Motto kami adalah: "+ menu1.motto() +" | Nama makanan: " + menu1.namaMakanan+"\n");
        //Get Profit and Tax
	System.out.println("    2a) Pengatur keuangan: " + menu1.namaKoki + " menambahkan pesan Kami mendapatkan keuntungan (belum pajak)" + menu1.keuntungan() + 
                            " Dengan pajak perMakanan" + menu1.getPajak());
        
        //Membuat objek lagi yaitu menu2
        KantinDua menu2 = new KantinDua("Koki Panca Nugraha lagi ",1000,70000,"Makanan Viral","IG Panca XR3 No.29",999999);
        
        //Detail menu2
        System.out.println("\n1) Inilah Detailnya!\n    1a) Pemasak: " + menu2.namaKoki + " | Modal membuat perMakanan: "+ menu2.modalPerMakanan +" | Kami menjual seharga: "
                            + menu2.hargaJual +" \n        |Motto kami adalah: "+ menu2.motto() +" | Nama makanan: " + menu2.namaMakanan+"\n");
        //Get keuntungan dan pajak
	System.out.println("    2b) Pengatur keuangan: " + menu2.namaKoki + " menambahkan pesan Kami mendapatkan keuntungan (belum pajak)" + menu2.keuntungan() + 
                            " Dengan pajak perMakanan" + menu2.getPajak());
        //Get Akun
        System.out.println("\n    2c) Jangan lupa Follow  \"" + menu2.akunIG + "\" Yang udah mengikuti " + menu2.pengikutIG +" Ayoo jangan ketingalann!!! "
                + "Khusus hanya di SMK Telkom!");
    }
}
