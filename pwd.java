import java.util.Scanner;

public class pwd {

    public static void main(String[] args) {

        int password;
        boolean isPasswordTrue =  false;

        Scanner inp = new Scanner(System.in);

        while (!isPasswordTrue) {
            System.out.print("Please enter your password: ");
            password = inp.nextInt();

            if (password == 123) {
                System.out.println("Password is correct. You are logging in...");
                isPasswordTrue = true;
            }
            else {
                System.out.println("Wrong!");
            }
        }

        inp.close();
    }  


    
    
}
