import java.util.Scanner;

public class SquareAreaCircumferenceCalculator {
    public static void main(String[] args) {
        double r, pi = 3.14, area, circumference;
        Scanner scan = new Scanner(System.in);
        System.out.println("Please provide Radius of the circle");
        r = scan.nextDouble();
        area = pi*r*r;
        circumference = 2*pi*r;
        System.out.println("Area is " + area);
        System.out.println("Circumference is " + circumference);
    }
}
