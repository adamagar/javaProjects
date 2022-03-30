import java.util.Scanner;

public class BodyMassIndexCalculator {
    public static void main(String[] args) {
        double height, weight, bmi;
        Scanner scan = new Scanner(System.in);
        System.out.println("Please writer your height in meter");
        height = scan.nextDouble();
        System.out.println("Please writer your weight in kilogram");
        weight = scan.nextDouble();
        bmi = weight/(height*height);
        System.out.println("Your BMI is " + bmi);
    }
}
