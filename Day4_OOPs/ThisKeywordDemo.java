package Day4_OOPs;

import java.util.Scanner;

class StudentThis {

    int id;
    String name;

    StudentThis(int id, String name) {

        this.id = id;
        this.name = name;

    }

    void display() {

        System.out.println("ID = " + id);
        System.out.println("Name = " + name);

    }

}

public class ThisKeywordDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter ID:");

        int id = sc.nextInt();

        sc.nextLine();

        System.out.println("Enter Name:");

        String name = sc.nextLine();

        StudentThis s1 = new StudentThis(id, name);

        s1.display();

        sc.close();

    }
}