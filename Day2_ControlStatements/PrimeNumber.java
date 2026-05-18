package Day2_ControlStatements;

import java.util.Scanner;

class PrimeNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num, count = 0;

        System.out.println("Enter number:");

        num = sc.nextInt();

        for(int i = 1; i <= num; i++) {

            if(num % i == 0) {

                count++;

            }

        }

        if(count == 2) {

            System.out.println("Prime Number");

        }
        else {

            System.out.println("Not Prime");

        }

        sc.close();

    }
}
