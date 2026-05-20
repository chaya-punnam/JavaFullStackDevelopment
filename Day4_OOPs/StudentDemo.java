package Day4_OOPs;

import java.util.Scanner;
class Student {
    int id;
    String name;
    void input() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Student ID:");
        id = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Student Name:");
        name = sc.nextLine();

    }

    void display() {
        System.out.println("Student ID = " + id);
        System.out.println("Student Name = " + name);
    }

}
class StudentDemo {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.input();
        s1.display();
    }
}
