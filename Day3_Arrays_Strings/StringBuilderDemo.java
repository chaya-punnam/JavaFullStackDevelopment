package Day3_Arrays_Strings;

import java.util.Scanner;

class StringBuilderDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter string:");

        String str = sc.nextLine();

        StringBuilder sb = new StringBuilder(str);

        sb.append(" Full Stack");

        System.out.println("After Append:");

        System.out.println(sb);

        sb.reverse();

        System.out.println("After Reverse:");

        System.out.println(sb);

        sc.close();

    }
}
