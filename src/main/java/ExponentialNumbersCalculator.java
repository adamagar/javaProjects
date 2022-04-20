import java.util.Scanner;

public class ExponentialNumbersCalculator {
    public static void main(String[] args) {
        int bottom, top;
        Scanner scan = new Scanner(System.in);
        System.out.println("Please type the bottom number");
        bottom = scan.nextInt();
        System.out.println("Please type the top number");
        top = scan.nextInt();
        int total = 1;
        for (int i = 1; i<=top; i++){
            total *= bottom;
        }
        System.out.println(total);
    }
}
