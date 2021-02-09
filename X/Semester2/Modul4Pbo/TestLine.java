public class TestLine{
    public static void main (String []args){
        Line obj1 = new Line (1,3,5,7);
        Line obj2 = new Line (3,7,9,11);
        System.out.println("========================================");
        System.out.println ("Apakah Nilai a>b  : "+obj1.isGreater(obj1,obj2));
        System.out.println ("Apakah Nilai a<b  : "+obj1.isLess(obj1,obj2));
        System.out.println ("Apakah Nilai a==b : "+obj1.isEqual(obj1,obj2));
        System.out.println("========================================");
    }
}
