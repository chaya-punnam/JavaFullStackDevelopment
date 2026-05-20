package Day4_OOPs;

import java.util.Scanner;

class Employee {

    private int salary;

    public void setSalary(int salary) {

        this.salary = salary;

    }

    public int getSalary() {

        return salary;

    }

}

class EncapsulationDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Employee e = new Employee();

        System.out.println("Enter Salary:");

        int salary = sc.nextInt();

        e.setSalary(salary);

        System.out.println("Salary = " + e.getSalary());

        sc.close();

    }
}
