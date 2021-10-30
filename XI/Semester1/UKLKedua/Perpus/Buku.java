package UKL_Kedua.Perpus;

import java.util.ArrayList;
public class Buku {
 
 private ArrayList<String> namaBuku = new ArrayList<String>();
 private ArrayList<Integer> stok = new ArrayList<Integer>();
 private ArrayList<Integer> harga = new ArrayList<Integer>();
 
 public Buku() {
 this.namaBuku.add("PanBuku01");
 this.stok.add(10);
 this.harga.add(1000);
 this.namaBuku.add("PanBuku02");
 this.stok.add(20);
 this.harga.add(2000);
 this.namaBuku.add("PanBuku03");
 this.stok.add(30);
 this.harga.add(3000);
 }
 public int getJmlBuku(){
 return this.namaBuku.size();
 }
 public void setNamaBuku(String namaBuku){
 this.namaBuku.add(namaBuku);
 }
 public String getNamaBuku(int idBuku){
 return this.namaBuku.get(idBuku);
 } 
 
 public void setStok(int stok ){
 this.stok.add(stok);
 }
 public int getStok(int idBuku){
 return this.stok.get(idBuku);
 } 
 public void editStok(int idBuku, int stok){
 this.stok.set(idBuku, stok);
 } 
 public void setHarga(int harga ){
 this.harga.add(harga);
 }
 public int getHarga(int idBuku){
 return this.harga.get(idBuku);
 } 
}

