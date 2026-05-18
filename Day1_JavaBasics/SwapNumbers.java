import java.util.Scanner;

class SwapNumbers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a, b, temp;

        System.out.println("Enter first number:");

        a = sc.nextInt();

        System.out.println("Enter second number:");

        b = sc.nextInt();

        temp = a;
        a = b;
        b = temp;

        System.out.println("After Swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        sc.close();

    }
}