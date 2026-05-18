import java.util.Scanner;

class CelsiusToFahrenheit {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double celsius;

        System.out.println("Enter temperature in Celsius:");

        celsius = sc.nextDouble();

        double fahrenheit = (9.0 / 5.0) * celsius + 32;

        System.out.println("Temperature in Fahrenheit = " + fahrenheit);

        sc.close();

    }
}