import java.util.Scanner;

// Program to perform basic arithmetic operations
class BasicCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Taking user inputs
        double number1;
        double number2;

        System.out.print("Enter first number: ");
        number1 = input.nextDouble();

        System.out.print("Enter second number: ");
        number2 = input.nextDouble();

        // Arithmetic operations
        double addition = number1 + number2;
        double subtraction = number1 - number2;
        double multiplication = number1 * number2;
        double division = number1 / number2;

        // Display results
        System.out.println("Addition: " + addition);
        System.out.println("Subtraction: " + subtraction);
        System.out.println("Multiplication: " + multiplication);
        System.out.println("Division: " + division);

        input.close();
    }
}