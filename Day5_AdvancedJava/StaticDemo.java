package Day5_AdvancedJava;

class StudentStatic {

    int id;
    String name;

    static String college = "ABC College";

    StudentStatic(int i, String n) {

        id = i;
        name = n;

    }

    void display() {

        System.out.println(id + " " + name + " " + college);

    }

}

public class StaticDemo {

    public static void main(String[] args) {

        StudentStatic s1 =
                new StudentStatic(101, "Chaya");

        StudentStatic s2 =
                new StudentStatic(102, "Java");

        s1.display();

        s2.display();

    }
}