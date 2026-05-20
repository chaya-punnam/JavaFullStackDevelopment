package Day4_OOPs;

class Student {

    int id;
    String name;

    Student() {

        id = 101;
        name = "Chaya";

    }

    void display() {

        System.out.println("ID = " + id);
        System.out.println("Name = " + name);

    }

}

class ConstructorDemo {

    public static void main(String[] args) {

        Student s1 = new Student();

        s1.display();

    }
}
