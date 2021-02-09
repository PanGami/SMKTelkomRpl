public class UjiBus3 {
    public static void main(String[]args){
        Bus3 bus = new Bus3(5);
            bus.getPenumpang(17);
            bus.getPenumpang(24);
            bus.cetakPenumpang();
            // penambahan penumpang
            bus.addPenumpang(2); //tambah 2 penumpang
            bus.cetakPenumpang();
            //penambahan penumpang
            bus.addPenumpang(1); //tambah 1 penumpang
            bus.cetakPenumpang();
            //penambahan penumpang
            bus.addPenumpang(2); //tambah 2 penumpang
            bus.cetakPenumpang();
            //penambahan penumpang
            bus.addPenumpang(2); //tambah 2 penumpang
            bus.cetakPenumpang();
            
            System.out.println("Rata-rata : " + bus.getAverage());
    }
}
