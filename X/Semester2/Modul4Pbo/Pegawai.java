public class Pegawai{
    String nama;
    int gaji;
    Pegawai(){
    }
    Pegawai(String nm){
        this.nama=nm;
        System.out.println("Pegawai");
    }
    public int gaji(){
        return 0;
    }
}

class Direktur extends Pegawai{
    private static final int gajiDir=100000;
    private static final int tunjangan=50000;
    
    public int gaji(){
        return gajiDir;
    }
    public int tunjangan(){
        return tunjangan;
    }
}

class Staf extends Pegawai{
    private static final int gajiStaf=50000;
    private static final int bonusStaf=10000;
    
    public int gaji(){
        return gajiStaf;
    }
    public int Bonus(){
        return bonusStaf;
    }
}