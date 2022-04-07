import java.util.Scanner;

public class LeapYearFinder {
    public static void main(String[] args) {
        int year, remain;
        Scanner scan = new Scanner(System.in);
        System.out.println("Please type a year");
        year = scan.nextInt();
        if (year%100 !=0){
            remain = year%4;
        }else {
            remain = year%400;
        }
        if (remain ==0){
            System.out.println(year + " is a leap year");
        }else {
            System.out.println(year + " is not a leap year");
        }

    }
}
