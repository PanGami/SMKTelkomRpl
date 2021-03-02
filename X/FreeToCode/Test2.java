
public class Test2 {
    int x;

    // kontruktor dengan parameter
    public Test2(int x) {
        x = x;
    }

     // memanggil konstruktor
    public static void main(String[] args) {
        Test2 myObj = new Test2(5);
        System.out.println("Nilai dari x = " + myObj.x);
    }
}

