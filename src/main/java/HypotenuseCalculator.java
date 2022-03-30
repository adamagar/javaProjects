import java.util.Scanner;

public class HypotenuseCalculator {
    public static void main(String[] args) {
        double a,b,c;
        Scanner scan = new Scanner(System.in);
        System.out.println("Please write the base of the 90 degrees angle");
        a = scan.nextDouble();
        System.out.println("Please write the altitude of the 90 degrees angle");
        b= scan.nextDouble();
        c = Math.sqrt((a*a) + (b*b));
        System.out.println("Hypotenuse is " + c );
    }
}
