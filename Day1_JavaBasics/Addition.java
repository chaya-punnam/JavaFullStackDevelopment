import java.util.Scanner;

class Addition {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a, b;

        System.out.println("Enter first number:");

        a = sc.nextInt();

        System.out.println("Enter second number:");

        b = sc.nextInt();

        int sum = a + b;

        System.out.println("Sum = " + sum);

        sc.close();

    }
}