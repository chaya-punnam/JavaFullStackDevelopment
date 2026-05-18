package Day2_ControlStatements;

import java.util.Scanner;

class Calculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a, b, choice;

        System.out.println("Enter 2 numbers:");

        a = sc.nextInt();
        b = sc.nextInt();

        System.out.println("1.Add");
        System.out.println("2.Subtract");
        System.out.println("3.Multiply");

        choice = sc.nextInt();

        switch(choice) {

            case 1:
                System.out.println("Sum = " + (a + b));
                break;

            case 2:
                System.out.println("Difference = " + (a - b));
                break;

            case 3:
                System.out.println("Product = " + (a * b));
                break;

            default:
                System.out.println("Invalid Choice");

        }

        sc.close();

    }
}
