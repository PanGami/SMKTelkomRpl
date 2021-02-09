
public class studi6No1 {
    public static void main(String[]args){
    
        int[] angka = new int[15];
        int kuadrat;
        
        for(int i=0; i<angka.length;i++){
        
            angka[i] = i +1;
        }
        
        for(int i = 0; i< angka.length;i++){
            
            if (angka[i] % 2 !=0 ){
            kuadrat = angka[i] * angka[i];
            System.out.println(angka[i] + " kuadrat " + kuadrat);
            
            }
            
        }
        
    }
}
