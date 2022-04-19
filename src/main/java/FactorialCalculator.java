import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please type a number to calculate of Factorial");
        int num = scan.nextInt();
        int total =1;
        while (num>1){
            total *= num;
            num--;

        }
        System.out.println(total);
    }
}
