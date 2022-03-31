import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please type first number");
        double n1 = scan.nextDouble();
        System.out.println("Please type second number");
        double n2 = scan.nextDouble();
        System.out.println("1-Addition\n2-Deduction\n3-Multiply\n4-Divide");
        System.out.println("Which operation do you chose?");
        int select = scan.nextInt();

        switch (select){
            case 1:
                System.out.println("Result = " + (n1+n2));
            break;
            case 2:
                System.out.println("Result = " + (n1-n2));
                break;
            case 3:
                System.out.println("Result = " + (n1*n2));
                break;
            case 4:
                if (n2 ==0){
                    System.out.println("Please chose a number bigger than zero");
                    break;
                }else {
                    System.out.println("Result = " + (n1/n2));
                    break;

                }

            default:
                System.out.println("Please choose an option between 1-4");
        }

    }
}
