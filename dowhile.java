import java.util.Scanner;
public class dowhile {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int password;
        boolean askPassword = true;

        do {
            System.out.println("Please enter your password: ");
            password = input. nextInt();

            if (password == 123) {
                System.out.println("Password is correct! You are logging in...");
                askPassword = false;
            }
            else {
                System.out.println("Password is incorrect! Please try again. ");
            }


        } while(askPassword);

        input.close();
    }
    
}
