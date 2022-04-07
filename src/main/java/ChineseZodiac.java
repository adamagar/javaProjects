import java.util.Scanner;

public class ChineseZodiac {
    public static void main(String[] args) {
        int year, remain;
        Scanner scan = new Scanner(System.in);
        System.out.println("Please type your birth year");
        year = scan.nextInt();
        remain = year%12;
        switch (remain){
            case 1:
                System.out.println("Your Chinese Zodiac is: Monkey");
                break;
            case 2:
                System.out.println("Your Chinese Zodiac is: Chicken");
                break;
            case 3:
                System.out.println("Your Chinese Zodiac is: Dog");
                break;
            case 4:
                System.out.println("Your Chinese Zodiac is: Pig");
                break;
            case 5:
                System.out.println("Your Chinese Zodiac is: Mouse");
                break;
            case 6:
                System.out.println("Your Chinese Zodiac is: Ox");
                break;
            case 7:
                System.out.println("Your Chinese Zodiac is: Tiger");
                break;
            case 8:
                System.out.println("Your Chinese Zodiac is: Rabbit");
                break;
            case 9:
                System.out.println("Your Chinese Zodiac is: Dragon");
                break;
            case 10:
                System.out.println("Your Chinese Zodiac is: Snake");
                break;
            case 11:
                System.out.println("Your Chinese Zodiac is: Horse");
                break;
            case 12:
                System.out.println("Your Chinese Zodiac is: Sheep");
                break;

        }
    }
}
