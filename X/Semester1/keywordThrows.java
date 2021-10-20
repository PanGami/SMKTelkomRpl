//keywordThrows
public class keywordThrows {

    public static void test(int n)
            throws NullPointerException, ArithmeticException {
        if (n < 0) {
            throw new NullPointerException(
                    "KESALAHAN: null pointer");
        } else {            
            throw new ArithmeticException(
                    "KESALAHAN: arithmetic exception");
        }
    }

    public static void main(String[] args) {
        try {
                     //test(-12); // menimbulkan eksepsi NullPointerException
            test(0); // menimbulkan eksepsi ArithmeticException
        } catch (Exception e) {
            System.out.println("Eksepsi ditangkap di sini...");
            System.out.println(e.getMessage());
        } finally{
            System.out.println("Statement Finally");
        }
        System.out.println("Statemen setelah blok try-catch");
    }
}
