package Day4_OOPs;

import java.util.Scanner;

class StudentParameterized {

    int id;
    String name;

    StudentParameterized(int i, String n) {

        id = i;
        name = n;

    }

    void display() {

        System.out.println("ID = " + id);
        System.out.println("Name = " + name);

    }

}

public class ParameterizedConstructor {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter ID:");

        int id = sc.nextInt();

        sc.nextLine();

        System.out.println("Enter Name:");

        String name = sc.nextLine();

        StudentParameterized s1 =
                new StudentParameterized(id, name);

        s1.display();

        sc.close();

    }
}