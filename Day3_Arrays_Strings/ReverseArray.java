package Day3_Arrays_Strings;

import java.util.Scanner;

class ReverseArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size:");

        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter elements:");

        for(int i = 0; i < n; i++) {

            arr[i] = sc.nextInt();

        }

        System.out.println("Reverse Array:");

        for(int i = n - 1; i >= 0; i--) {

            System.out.println(arr[i]);

        }

        sc.close();

    }
}
