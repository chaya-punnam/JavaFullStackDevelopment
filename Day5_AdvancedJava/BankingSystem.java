package Day5_AdvancedJava;

import java.util.Scanner;

class BankAccount {

    private int accountNumber;
    private String customerName;
    private double balance;

    BankAccount(int accountNumber,
                String customerName,
                double balance) {

        this.accountNumber = accountNumber;
        this.customerName = customerName;
        this.balance = balance;

    }

    void deposit(double amount) {

        balance = balance + amount;

        System.out.println(amount +
                " Deposited Successfully");

    }

    void withdraw(double amount) {

        if(amount <= balance) {

            balance = balance - amount;

            System.out.println(amount +
                    " Withdrawn Successfully");

        }
        else {

            System.out.println("Insufficient Balance");

        }

    }

    void checkBalance() {

        System.out.println("Current Balance = " +
                balance);

    }

    void displayDetails() {

        System.out.println("Account Number = " +
                accountNumber);

        System.out.println("Customer Name = " +
                customerName);

        System.out.println("Balance = " +
                balance);

    }

}

public class BankingSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Account Number:");

        int accNo = sc.nextInt();

        sc.nextLine();

        System.out.println("Enter Customer Name:");

        String name = sc.nextLine();

        System.out.println("Enter Initial Balance:");

        double balance = sc.nextDouble();

        BankAccount b1 =
                new BankAccount(accNo, name, balance);

        int choice;

        do {

            System.out.println("\n--- BANK MENU ---");

            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Account Details");
            System.out.println("5. Exit");

            System.out.println("Enter Choice:");

            choice = sc.nextInt();

            switch(choice) {

                case 1:

                    System.out.println(
                            "Enter Deposit Amount:");

                    double depositAmount =
                            sc.nextDouble();

                    b1.deposit(depositAmount);

                    break;

                case 2:

                    System.out.println(
                            "Enter Withdraw Amount:");

                    double withdrawAmount =
                            sc.nextDouble();

                    b1.withdraw(withdrawAmount);

                    break;

                case 3:

                    b1.checkBalance();

                    break;

                case 4:

                    b1.displayDetails();

                    break;

                case 5:

                    System.out.println(
                            "Thank You");

                    break;

                default:

                    System.out.println(
                            "Invalid Choice");

            }

        } while(choice != 5);

        sc.close();

    }
}