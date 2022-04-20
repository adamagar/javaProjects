import java.util.Scanner;

public class DigitAddition {
    public static void main(String[] args) {
        int num;
        Scanner scan = new Scanner(System.in);
        System.out.println("Please type a number");
        num = scan.nextInt();
        int total,result = 0;
        while (num != 0) {
            total = num % 10;
            result += total;
            num = num / 10;
        }
        System.out.println(result);
    }
}
