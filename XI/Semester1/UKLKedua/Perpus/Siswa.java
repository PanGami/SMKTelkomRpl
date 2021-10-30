package UKL_Kedua.Perpus;

import java.util.ArrayList;
public class Siswa implements User{
    // ==> Jika Status False berarti Siswa dengan id x dalam keadaan belum meminjam
 private ArrayList<String> namaSiswa = new ArrayList<String>();
 private ArrayList<String> alamat = new ArrayList<String>();
 private ArrayList<String> telepon = new ArrayList<String>();
 private ArrayList<Boolean> status = new ArrayList<Boolean>();
 
 public Siswa() {
 this.namaSiswa.add("Panca");
 this.alamat.add("Blitar Kabupaten");
 this.telepon.add("081216012735");
 this.status.add(false);
 
 
 this.namaSiswa.add("budi");
 this.alamat.add("Budi Santoso City");
 this.telepon.add("000000000001");
 this.status.add(false);
 }

 public int getJmlSiswa(){
    return this.namaSiswa.size();
 } 
 public void setStatus(boolean status){
     this.status.add(status);
 }
 public boolean getStatus(int idSiswa){
     return this.status.get(idSiswa);
 }
 public void editStatus(int idSiswa, Boolean status){
    this.status.set(idSiswa, status);;
 } 

 @Override
 public void setNama(String namaMember ){
 this.namaSiswa.add(namaMember);
 }
 
 @Override
 public void setAlamat(String alamat ){
 this.alamat.add(alamat);
 }
 @Override
 public void setTelepon(String telepon ){
 this.telepon.add(telepon);
 }
 
 @Override
 public String getNama(int idMember){
 return this.namaSiswa.get(idMember);
 }
 
 @Override
 public String getAlamat(int idMember){
 return this.alamat.get(idMember);
 }
 
 @Override
 public String getTelepon(int idMember){
 return this.telepon.get(idMember);
 } 
}
