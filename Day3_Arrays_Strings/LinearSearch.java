package Day3_Arrays_Strings;

import java.util.Scanner;

class LinearSearch {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size:");

        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter elements:");

        for(int i = 0; i < n; i++) {

            arr[i] = sc.nextInt();

        }

        System.out.println("Enter key:");

        int key = sc.nextInt();

        boolean found = false;

        for(int i = 0; i < n; i++) {

            if(arr[i] == key) {

                found = true;

                break;

            }

        }

        if(found) {

            System.out.println("Element Found");

        }
        else {

            System.out.println("Element Not Found");

        }

        sc.close();

    }
}
