import java.util.Scanner;

public class CashierProgram {
    public static void main(String[] args) {
        double appleKg, apple = 3.67, tomatoesKg, tomatoes = 3.8, bananaKg, banana = 1.5, total;
        Scanner scan = new Scanner(System.in);
        System.out.println("How many kilos apple did you buy?");
        appleKg = scan.nextDouble();
        System.out.println("How many kilos tomatoes did you buy?");
        tomatoesKg = scan.nextDouble();
        System.out.println("How many kilos banana did you buy?");
        bananaKg = scan.nextDouble();
        total = (apple*appleKg)+(tomatoes*tomatoesKg)+(banana*bananaKg);
        System.out.println("Total price is " + total);
    }
}
