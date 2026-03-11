import java.util.Scanner;

// Program to swap two numbers
class SwapNumbers {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number1;
        int number2;

        System.out.print("Enter first number: ");
        number1 = input.nextInt();

        System.out.print("Enter second number: ");
        number2 = input.nextInt();

        // Swapping
        int temp = number1;
        number1 = number2;
        number2 = temp;

        System.out.println("Swapped numbers are: " + number1 + " and " + number2);

        input.close();
    }
}