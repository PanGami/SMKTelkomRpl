package Metic;
// Inisialisasi dapat seperti dibawah 
//    Tipe_data nama_array[];
//            Atau
//    Tipe_data [] nama_array;
//
//    Dengan Deklarasi panjang array => tipe_data nama_array[] = new tipe_data[panjang array];
//          Contoh => String hari[] = new String[3];
//    Dengan Deklarasi + Inisialisasi => tipe_data nama_array[] = {data,data,data,...};
//          Contoh => String hari[] = {"Senin","Selasa","Rabu"};
//    
//    Selain Array dengan satu [] (satu dimensi), dimensi array dapat ditambahkan
//    Cukup dengan menambahkan [] maka dimensi juga akan bertambah contoh
//    Array 2 Dimensi => Tipe_data [][] nama_array; Gambaran seperti Baris dan kolom 
//    Array 3 Dimensi => Tipe_data [][][] nama_array; Gambaran seperti Kotak dengan panjang lebar dan tinggi
//
//    Untuk menampilkan Array tidak dapat langsung, beberapa cara untuk menampilkan adalah
//    Memanggil dengan => namaArray[index nomer array], contoh hari[0] *bernilai "senin";
//    Dengan For loop dan dengan For-each Loop, berikut penulisan for-each loop
//    
//    for (type var : array) 
//    { 
//       statements using var;
//    }

public class Array {
    public static void main(String[] args) {
        int[]array ={1,2,3,4,5,6,7,8,9,10};
        try{
            for(int i=0;i<array.length;i++){
                System.out.println(array[i]);
            }
        }catch(Exception e){
            System.out.println("Ada Error dengan info "+e);
        }    
    }
}
