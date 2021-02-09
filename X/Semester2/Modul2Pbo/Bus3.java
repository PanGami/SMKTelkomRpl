public class Bus3 {
    private double penumpang;
    private double maxPenumpang;    
    private double counter;

    
    public Bus3(double maxPenumpang){
        this.maxPenumpang = maxPenumpang;
        penumpang = 0;
    }
    // Method Mutator agar penumpang bertambah
    public void addPenumpang(double penumpang){
        double temp;
        temp = this.penumpang+penumpang;
        if(temp > maxPenumpang){
            System.out.println("Penumpang melebihi kuota");
        }else{
            this.penumpang=temp;
            counter++;
        }
    }

    public void getPenumpang(double password){
        if(password==24){
            System.out.println("Password Benar");
        }else{
            System.out.println("Password Salah");
        }
    }
    
    public double getAverage(){
        return penumpang/counter;
    }
    
    public void cetakPenumpang(){
        System.out.println("Penumpang Bus Sekarang= "+penumpang);
        System.out.println("Maksimum penumpang yang seharusnya adalah = "+ maxPenumpang);
    }
}