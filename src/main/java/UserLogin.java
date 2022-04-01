import java.util.Scanner;

public class UserLogin {
    public static void main(String[] args) {
        String username,password,passwordReset, newPassword;
        Scanner scan = new Scanner(System.in);
        System.out.println("Please type your user name");
        username = scan.nextLine();
        System.out.println("Please type your password");
        password = scan.nextLine();

        if (username.equals("admin")&&password.equals("admin123")){
            System.out.println("You successfully logged in");
        }else {
            System.out.println("Your credentials are wrong\nDo you want to reset your password(Y/N)");
            passwordReset = scan.nextLine();
            if (passwordReset.equals("Y")){
                System.out.println("Please type your new password");
                newPassword = scan.nextLine();
                if (newPassword.equals("admin123")){
                    System.out.println("Please type different one than your previous password");
                }else {
                    System.out.println("You changed your password successfully");
                }
            }
        }

    }
}
