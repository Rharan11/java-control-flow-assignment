import java.util.Scanner;

// Program to calculate side of square
class SquareSide {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double perimeter;

        System.out.print("Enter perimeter of square: ");
        perimeter = input.nextDouble();

        double side = perimeter / 4;

        System.out.println("Side length of square is: " + side);

        input.close();
    }
}