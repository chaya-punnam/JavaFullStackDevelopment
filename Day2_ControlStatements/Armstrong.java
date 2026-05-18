package Day2_ControlStatements;

import java.util.Scanner;

class Armstrong {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num, temp, rem, sum = 0;

        System.out.println("Enter number:");

        num = sc.nextInt();

        temp = num;

        while(num > 0) {

            rem = num % 10;

            sum = sum + (rem * rem * rem);

            num = num / 10;

        }

        if(sum == temp) {

            System.out.println("Armstrong Number");

        }
        else {

            System.out.println("Not Armstrong");

        }

        sc.close();

    }
}
