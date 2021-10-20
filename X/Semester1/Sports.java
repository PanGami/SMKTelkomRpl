import java.util.Scanner;

public class Sports {
    String nama, alamat, nomor_hp, email, kacamata_renang;

    Scanner getdata = new Scanner(System.in);

    public void setData() {
        //Nama
        System.out.println("Masukkan Nama Anda : ");
        this.nama = getdata.nextLine();
        //Alamat
        System.out.println("Masukkan Alamat Anda : ");
        this.alamat = getdata.nextLine();
        //Nomor Hp
        System.out.println("Masukkan Nomor Handphone Anda : ");
        this.nomor_hp = getdata.nextLine();
        //email
        System.out.println("Masukkan Alamat Email Anda : ");
        this.email = getdata.nextLine();
        //Thank you
        System.out.println("Terima Kasih telah mengisi Data\n");
        System.out.println("Silahkan pilih menu berikutnya");
        System.out.println("==================================");
    }

    public static void setBeli() {
        Scanner input = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        Scanner getdata = new Scanner(System.in);

        String kode_renang, kode_badminton;

        int bayarBadminton = 0;
        int bayarRenang=0;
        //int Alat Renang
        int kacamata_renang = 25000;
        int baju_renang = 150000;
        int topi_renang = 105000;
        int kaki_katak = 250000;
        int tas_renang = 280000;

        //int Badminton
        int shuttle_kok = 25000;
        int grip_badminton = 15000;
        int raket = 250000;
        int sepatu_badminton = 725000;
        int net_badminton = 60000;

        int jumlah, bayar;

        System.out.println("Silahkan Masukkan Nama Barang Renang : ");
        kode_renang = sc.nextLine();

        System.out.println("Silahkan Masukkan Nama Barang Badminton : ");
        kode_badminton = sc.nextLine();

        if (kode_renang.equals("kacamata renang")) {
            System.out.println("Barang Yang Anda Pilih Adalah : Kacamata Renang");
            System.out.println("Harga                         : Rp 25.000");
            System.out.println("Masukkan Jumlah Barang        : ");
            jumlah = input.nextInt();
            bayarRenang = jumlah * kacamata_renang;

            //System.out.println("Total Bayar : Rp " + bayar);
        }//Baju Renang
        else if(kode_renang.equals("baju renang")) {
            System.out.println("Barang Yang Anda Pilih Adalah : Baju Renang");
            System.out.println("Harga                         : Rp 150.000");
            System.out.println("Masukkan Jumlah Barang        : ");
            jumlah = input.nextInt();
            bayarRenang = jumlah * baju_renang;

            //System.out.println("Total Bayar : Rp " + bayar);
        }//Topi Renang
        else if (kode_renang.equals("topi renang")) {
            System.out.println("Barang Yang Anda Pilih Adalah : Topi Renang");
            System.out.println("Harga                         : Rp 105.000");
            System.out.println("Masukkan Jumlah Barang        : ");
            jumlah = input.nextInt();
            bayarRenang = jumlah * topi_renang;

            //System.out.println("Total Bayar : Rp " + bayar);
        }//Kaki Katak
        else if (kode_renang.equals("kaki katak")) {
            System.out.println("Barang Yang Anda Pilih Adalah : Kaki Katak");
            System.out.println("Harga                         : Rp 250.000");
            System.out.println("Masukkan Jumlah Barang        : ");
            jumlah = input.nextInt();
            bayarRenang = jumlah * kaki_katak;

            //System.out.println("Total Bayar : Rp " + bayar);
        }// Tas Renang
        else if (kode_renang.equals("tas renang")) {
            System.out.println("Barang Yang Anda Pilih Adalah : Tas Renang");
            System.out.println("Harga                         : Rp 280.000");
            System.out.println("Masukkan Jumlah Barang        : ");
            jumlah = input.nextInt();
            bayarRenang = jumlah * tas_renang;

            //System.out.println("Total Bayar : Rp " + bayar);
        }

        //Menu Badminton

        //Shuttle Kok
        if (kode_badminton.equals("shuttle kok")) {
            System.out.println("Barang Yang Anda Pilih Adalah : Shuttle Kok");
            System.out.println("Harga                         : Rp 25.000");
            System.out.println("Masukkan Jumlah Barang        : ");
            jumlah = input.nextInt();
            bayarBadminton = jumlah * shuttle_kok;

            //System.out.println("Total Bayar : Rp " + bayar);
        }//Grip Badminton
        else if (kode_badminton.equals("grip badminton")) {
            System.out.println("Barang Yang Anda Pilih Adalah : Grip Badminton");
            System.out.println("Harga                         : Rp 15.000");
            System.out.println("Masukkan Jumlah Barang        : ");
            jumlah = input.nextInt();
            bayarBadminton = jumlah * grip_badminton;

            //System.out.println("Total Bayar : Rp " + bayar);
        }//Raket
        else if (kode_badminton.equals("raket")) {
            System.out.println("Barang Yang Anda Pilih Adalah : Raket");
            System.out.println("Harga                         : Rp 250.000");
            System.out.println("Masukkan Jumlah Barang        : ");
            jumlah = input.nextInt();
            bayarBadminton = jumlah * raket;

            //System.out.println("Total Bayar : Rp " + bayar);
        }//Sepatu Badminton
        else if (kode_badminton.equals("sepatu badminton")) {
            System.out.println("Barang Yang Anda Pilih Adalah : Sepatu Badminton");
            System.out.println("Harga                         : Rp 725.000");
            System.out.println("Masukkan Jumlah Barang        : ");
            jumlah = input.nextInt();
            bayarBadminton = jumlah * sepatu_badminton;

            //System.out.println("Total Bayar : Rp " + bayar);
        }//Net Badminton
        else if (kode_badminton.equals("net badminton")) {
            System.out.println("Barang Yang Anda Pilih Adalah : Net Badminton");
            System.out.println("Harga                         : Rp 60.000");
            System.out.println("Masukkan Jumlah Barang        : ");
            jumlah = input.nextInt();
            bayarBadminton = jumlah * net_badminton;

            //System.out.println("Total Bayar : Rp " + bayar);
        }
        //Menu Tidak Terdaftar

        if (bayarRenang > 0 && bayarBadminton > 0) {
            int bayarTotal = bayarBadminton+bayarRenang;
            System.out.println("Total Bayar : Rp " + bayarTotal);
        }else{
            System.out.println("Maaf Barang Tidak Terdaftar");
        }
    }

    public void tampil() {
        System.out.println("Nama\t \t \t: " + this.nama);
        System.out.println("Alamat\t \t \t: " + this.alamat);
        System.out.println("Nomor Handphone\t: " + this.nomor_hp);
        System.out.println("Alamat Email\t: " + this.email + "\n");
    }

    public static void main(String[] args) {
        Scanner getint = new Scanner(System.in);

        int a = 0, z = 0, menu = 0;



        Sports[] sprt = new Sports[100];
        Sports[] beli = new Sports[100];
        beli[a] = new Sports();

        //Awalan
        System.out.println("=================================");
        System.out.println("| Selamat Datang di Sports Jaya |");
        System.out.println("================================= \n");
        System.out.println("Silahkan Pilih Menu Dibawah");
        System.out.println("============================= \n");
        
        while (menu != 4) {
            System.out.println("Menu :\n 1. Input Data\n 2. View Data\n 3. Daftar Barang\n 4. Beli Barang\n Pilih Menu : ");

            menu = getint.nextInt();

            if (menu == 1) {
                z++;
                sprt[z] = new Sports();
                sprt[z].setData();
            } else if (menu == 2) {
                if (z < 1) {
                    System.out.println("Maaf, data masih kosong \n");
                } else {
                    a = 0;
                    while (a < z) {
                        a++;
                        System.out.println("Data " + a);
                        sprt[a].tampil();
                    }
                }
            } else if (menu == 3) {
                //Alat Renang
                System.out.println("Alat Renang");
                System.out.println("1. Kacamata Renang\t: Rp 25.000");
                System.out.println("2. Baju Renang\t \t: Rp 150.000");
                System.out.println("3. Topi Renang\t \t: RP 105.000");
                System.out.println("4. Kaki Katak\t \t: Rp 250.000");
                System.out.println("5. Tas Renang\t \t: Rp 280.000\n");

                //Badminton
                System.out.println("Alat Badminton");
                System.out.println("6. Shuttle Kok\t \t \t: Rp 25.000");
                System.out.println("7. Grip Badminton\t \t: Rp 15.000");
                System.out.println("8. Raket\t \t \t \t: Rp 250.000");
                System.out.println("9. Sepatu Badminton\t \t: Rp 725.000");
                System.out.println("10. Net Badminton\t \t: Rp 60.000\n");
            } else if (menu == 4)
                setBeli();
        }
    }
}