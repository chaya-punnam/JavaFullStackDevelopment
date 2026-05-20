package Day4_OOPs;

import java.util.Scanner;

class Addition {

    void add(int a, int b) {

        System.out.println("Sum = " + (a + b));

    }

    void add(int a, int b, int c) {

        System.out.println("Sum = " + (a + b + c));

    }

}

class MethodOverloading {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Addition obj = new Addition();

        System.out.println("Enter 2 numbers:");

        int a = sc.nextInt();
        int b = sc.nextInt();

        obj.add(a, b);

        System.out.println("Enter 3 numbers:");

        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();

        obj.add(x, y, z);

        sc.close();

    }
}
