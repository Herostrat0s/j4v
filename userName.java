import java.util.Scanner;
public class userName {
    
    public static void main(String[] args) {

        String userName, password, new_password; 

        Scanner inp = new Scanner(System.in);

        System.out.println("Please enter your username: ");
        userName = inp.nextLine();

        System.out.println("Please enter your password: ");
        password = inp.nextLine();

        if (userName.equals("caine")&& password.equals("himself")) {
            System.out.println("Your login is succesful!");
        }
        else {
            System.out.println("Please enter valid username and password! If you want to reset your password enter 1. If you want to quit enter 2: ");
             int choice = inp.nextInt();

            if (choice == 1) {
                inp.nextLine();
                System.out.println("Please enter your new password: ");
                new_password = inp.nextLine();
                        if (new_password.equals("himself")) {
                            System.out.println("You can't use same password as before! Please enter different password: ");
                        new_password = inp.nextLine();

                    }
                      else {
                    System.out.println("The new password is created");
                    }
                
             }

             else {
                System.out.println("You are exiting...");
             }
        }
        inp.close();
    }
}
