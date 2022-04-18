import java.util.Scanner;

public class ExponentialNumbersCalculator {
    public static void main(String[] args) {
        int num;
        Scanner scan = new Scanner(System.in);
        System.out.println("Please type a maximum value you want to limit");
        num = scan.nextInt();
        for (int i = 1; i<=num; i*=4){
            System.out.println(i);
        }
        for (int j = 1; j<=num; j*=5){
            System.out.println(j);
        }
    }
}
