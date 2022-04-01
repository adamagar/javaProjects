import java.util.Scanner;

public class EventAdvisor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What is temperature today?");
        int temp = scan.nextInt();
        if (temp<5){
            System.out.println("You should go for skating");

        } else if (temp<25){
            if(temp<=15){
                System.out.println("You should go for Cinema");
            }
            if(temp>=15){
                System.out.println("You should go for a picnic");
            }

        }else {
            System.out.println("You should go for swimming");
        }

    }
}
