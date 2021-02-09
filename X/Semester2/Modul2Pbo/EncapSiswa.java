public class EncapSiswa {
    private String name;
    private String address;
    private int absen;
    
    public int getAbsen(){
        return absen;
    }
    
    public String getName(){
        return name;
    }
    
    public String getAddress(){
        return address;
    }
    
    public void setAbsen(int newAbsen){
        absen = newAbsen;
    }
    
    public void setName(String newName){
        name = newName;
    }
    
    public void setAddress (String newAddress){
        address = newAddress;
    }
    
    public void getAddress(String newAddress){
        address = newAddress;
    }
}
