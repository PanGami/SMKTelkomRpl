// KantinDua karena suatu hal tertentu menjadi eksis di Medsos
// Sehingga terdapat akun khusus milik kantinDua
public class KantinDua extends KantinSatu{
    public String akunIG;
    public int pengikutIG;
    public KantinDua(String nk,int mpm,int hj,String nm,String nig,int pig){
        super(nk,mpm,hj,nm);
        akunIG = nig;
        pengikutIG = pig;        
    }
    public String ig(){
        return (akunIG + " dengan pengikut sebanyak " 
                + pengikutIG + " KANTIN VIRALLL!!! \n Jangan lupa"
                + " Follow akun IG kantin ini ya!");
    }
}
