import java.util.Scanner;

public class AirplaneTicketFee {
    public static void main(String[] args) {
        int age, isOneWay;
        double distance, feeOfKm = 0.1;

        Scanner scan = new Scanner(System.in);
        System.out.println("How old are you");
        age = scan.nextInt();
        System.out.println("Please type the travel distance in KM");
        distance = scan.nextInt();
        System.out.println("Type 1 for oneway, 2 for round ticket");
        isOneWay = scan.nextInt();
        double total = feeOfKm * distance;
        if (isOneWay == 1) {
            total = total;
        } else {
            total = total * 0.8;
        }
        if (age < 0) {
            System.out.println("Please type valid age");
        }
        else if (distance < 1) {
            System.out.println("Please type valid distance");
        }
        else if (isOneWay != 1 && isOneWay != 2) {
            System.out.println("Please type 1 or 2");
        }
        else {
            if (age < 12) {
                System.out.println("Total fee = $" + total * 0.5);
            } else if (age < 24) {
                System.out.println("Total fee = $" + total * 0.9);
            } else if (age > 65) {
                System.out.println("Total fee = $" + total * 0.7);
            }
        }
    }
}

