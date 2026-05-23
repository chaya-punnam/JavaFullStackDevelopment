package Day6_ExceptionHandling;

public class FinallyDemo {

    public static void main(String[] args) {

        try {

            int a = 10 / 0;

        }
        catch(Exception e) {

            System.out.println(
                    "Exception Handled");

        }
        finally {

            System.out.println(
                    "Finally Block Executed");

        }

    }
}