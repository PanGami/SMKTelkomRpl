public class Modul2PboBus {
    private int penumpang;
    private int maxPenumpang;
    
    //konstruksi kelas Bus 
    public Modul2PboBus(int maxPenumpang){ 
        this.maxPenumpang = maxPenumpang; 
        penumpang =0; 
    } 

    //method mutator untuk menambahkan penumpang 
    public void addPenumpang(int penumpang){
        int temp;
        temp =this.penumpang+penumpang; 
        if(temp >= maxPenumpang){ 
         System.out.println("Penumpang melebihi kuota");
        }else{ 
         this.penumpang = temp;
        } 
    }

    public void cetak(){
        System.out.println("Penumpang Bus sekarang adalah "+ penumpang);
        System.out.println("Penumpang maksimum seharusnya adalah "+ maxPenumpang);
    }
}
