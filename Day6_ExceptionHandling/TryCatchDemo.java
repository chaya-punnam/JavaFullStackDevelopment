package Day6_ExceptionHandling;
public class TryCatchDemo {
    public static void main(String[] args) {
        try {
            int a = 10 / 0;
            System.out.println(a);

        }
        catch(ArithmeticException e) {
            System.out.println(
                    "Cannot Divide By Zero");

        }
        System.out.println("Program Continues");
    }
}