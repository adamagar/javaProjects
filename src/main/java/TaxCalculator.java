import java.util.Scanner;

public class TaxCalculator {
    public static void main(String[] args) {
        double price, totalPrice, taxRate =0.18;
        Scanner scan = new Scanner(System.in);
        System.out.print("What is the price of the product? ");
        price = scan.nextInt();
        totalPrice = (price*taxRate) + price;
        System.out.println("Total price you will pay " +totalPrice);
        System.out.println("Tax Rate = " + taxRate);
        System.out.println("Paid tax = " + price*taxRate);
    }
}
