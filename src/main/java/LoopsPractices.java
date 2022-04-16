import java.util.Scanner;

public class LoopsPractices {
    public static void main(String[] args) {
        int num;
        int total = 0;
        Scanner scan = new Scanner(System.in);
        do {
            System.out.println("Please type a number");
            num = scan.nextInt();
            if (num%4==0){
                total +=num;
            }
        }while (num%2==0);
        System.out.println(total);
        }

    }

