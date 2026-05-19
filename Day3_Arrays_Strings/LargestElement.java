package Day3_Arrays_Strings;

import java.util.Scanner;

class LargestElement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size:");

        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter elements:");

        for(int i = 0; i < n; i++) {

            arr[i] = sc.nextInt();

        }

        int largest = arr[0];

        for(int i = 1; i < n; i++) {

            if(arr[i] > largest) {

                largest = arr[i];

            }

        }

        System.out.println("Largest = " + largest);

        sc.close();

    }
}