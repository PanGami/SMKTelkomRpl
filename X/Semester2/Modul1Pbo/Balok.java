package Satu;
public class Balok {
        private int panjang, lebar, tinggi, volume, luasPermukaan;
    public void setPanjang(int p)
    {
    panjang = p;
    }
    public void setLebar(int l)
    {
    lebar = l;
    }
    public void setTinggi(int t)
    {
    tinggi = t;
    }
    public void setVolume()
    {
    volume = panjang * tinggi * lebar;
    }
    public void setLuasPermukaan()
    {
    luasPermukaan = 2 * panjang * lebar + 2 * panjang * tinggi + 2 * lebar * tinggi;
    }
    public int getPanjang()
    {
    return panjang;
    }
    public int getLebar()
    {
    return lebar;
    }
    public int getTinggi()
    {
    return tinggi;
    }
    public int getVolume()
    {
    return volume;
    }
    public int getLuasPermukaan()
    {
    return luasPermukaan;
    }
}
