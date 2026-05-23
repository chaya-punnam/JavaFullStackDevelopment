package Day7_Collections;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<String> list =
                new ArrayList<String>();

        System.out.println(
                "Enter 3 Names:");

        for(int i = 0; i < 3; i++) {

            list.add(sc.nextLine());

        }

        System.out.println(
                "ArrayList Elements:");

        for(String name : list) {

            System.out.println(name);

        }

        sc.close();

    }
}