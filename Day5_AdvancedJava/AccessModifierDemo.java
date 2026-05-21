package Day5_AdvancedJava;

class AccessDemo {

    private int salary = 50000;

    void showSalary() {

        System.out.println("Salary = " + salary);

    }

}

public class AccessModifierDemo {

    public static void main(String[] args) {

        AccessDemo a = new AccessDemo();

        a.showSalary();

    }
}