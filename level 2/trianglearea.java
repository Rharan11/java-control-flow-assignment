import java.util.Scanner;

// Program to calculate area of triangle
class TriangleArea {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Variables
        double base;
        double height;

        System.out.print("Enter base in cm: ");
        base = input.nextDouble();

        System.out.print("Enter height in cm: ");
        height = input.nextDouble();

        // Area calculation
        double areaCm = 0.5 * base * height;

        // Convert to inches
        double areaInches = areaCm / (2.54 * 2.54);

        System.out.println("Area in square cm: " + areaCm);
        System.out.println("Area in square inches: " + areaInches);

        input.close();
    }
}