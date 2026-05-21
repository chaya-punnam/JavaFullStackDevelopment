package Day5_AdvancedJava;

interface A {

    void show();

}

interface B {

    void display();

}

class DemoInheritance implements A, B {

    public void show() {

        System.out.println("Show Method");

    }

    public void display() {

        System.out.println("Display Method");

    }

}

public class MultipleInheritanceDemo {

    public static void main(String[] args) {

        DemoInheritance d = new DemoInheritance();

        d.show();

        d.display();

    }
}