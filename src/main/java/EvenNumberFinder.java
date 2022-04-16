import java.util.Scanner;

public class EvenNumberFinder {
    public static void main(String[] args) {
        int num;
        Scanner scan = new Scanner(System.in);
        System.out.println("Please type a number");
        num = scan.nextInt();
        int i = 1;
        while (i<=num){
                if (i%2==0){
                    System.out.println(i);
                }
            i++;
        }
    }
}

