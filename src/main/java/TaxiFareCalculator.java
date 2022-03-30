import java.util.Scanner;

public class TaxiFareCalculator {
    public static void main(String[] args) {
        double km, start = 2.5, totalFee;
        int kmFee = 2;
        Scanner scan = new Scanner(System.in);
        System.out.println("How many kilometres you will use the taxi?");
        km = scan.nextDouble();
        totalFee= (km*kmFee)+start;
        totalFee = (totalFee<20)? 20:totalFee;
        System.out.println("Total fee is " + totalFee);
    }
}
