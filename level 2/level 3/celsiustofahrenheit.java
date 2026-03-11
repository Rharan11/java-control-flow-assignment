import java.util.Scanner;

// Program to convert Celsius to Fahrenheit
class CelsiusToFahrenheit {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double celsius;

        System.out.print("Enter temperature in Celsius: ");
        celsius = input.nextDouble();

        double fahrenheitResult = (celsius * 9 / 5) + 32;

        System.out.println(celsius + " Celsius is " + fahrenheitResult + " Fahrenheit");

        input.close();
    }
}