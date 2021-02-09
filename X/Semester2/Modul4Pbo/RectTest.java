public class RectTest{
    public static void main(String[] args){ //Method main
    Rect nilai1=new Rect(1,1,4,4); //membuat objek bernama nilai1
    Rect nilai2=new Rect(2,3,5,6); //membuat objek bernama nilai2
    Rect u = nilai2.union(nilai1);     
    Rect i = nilai2.intersection(nilai1);
    
    if(u.isInside(nilai1.x1, nilai2.y1))
            System.out.println("<" + nilai2.x1 + "," + nilai2.y1 + "> "
                    + "is inside the union");
        System.out.println(nilai1 + " union " + nilai2 + " = " + u);
        System.out.println(nilai1 + " intersect " + nilai2 + " = " + i);
    }
}
