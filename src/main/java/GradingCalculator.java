import java.util.Scanner;

public class GradingCalculator {
    public static void main(String[] args) {
        int mat, physics, science, history, music;
        Scanner inp = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = inp.next();

        System.out.println("Math Grade : ");
        mat= inp.nextInt();

        System.out.println("Physics Grade : ");
        physics= inp.nextInt();

        System.out.println("Science Grade : ");
        science= inp.nextInt();

        System.out.println("History Grade : ");
        history= inp.nextInt();

        System.out.println("Music Grade : ");
        music= inp.nextInt();

        int total = mat+physics+science+history+music;
        double result = total/5;
        System.out.println(result);
        if (result>60){
            System.out.println(name + " ACongratulations you passed!");

        }else
            System.out.println(name + "You failed");
    }

}
