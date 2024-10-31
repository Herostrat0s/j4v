import java.util.Scanner;

public class main {
    
    public static void main(String[] args) {
        String username, password;
        Scanner input = new Scanner(System.in);

        int chance = 3;
        int balance = 20500;

        int select;

        while (chance > 0) {
            System.out.println("What is your username: ");
            username = input.nextLine();

            System.out.println("What is your password: ");
            password = input.nextLine();

            if (username.equals("caine") && password.equals("himself")) {
                System.out.println("Welcome to your bank account!");

                do {
                    System.out.println("1 - Money Deposit\n" + "2 - Money Draw\n" + "3 - Balance Query\n" + "4 - Quit");
                    System.out.print("Please select the operation you want: ");
                    select = input.nextInt();

                    switch (select){ 
                        case 1:
                            System.out.println("Money amount is: " + balance);
                            System.out.println("How much money do you want to deposit: ");
                            int deposit = input.nextInt();
                            balance += deposit;
                            System.out.println("New balance is: " + balance);
                            break;

                        case 2:
                            System.out.println("Money amount is: " + balance);
                            System.out.println("How much money do you want to draw: ");
                            int draw = input.nextInt();
                            if (draw > balance) {
                                System.out.println("You cant draw more than your balance");
                                break;
                            }
                            balance -= draw;
                            System.out.println("New balance is: " + balance);
                            break;

                        case 3:
                            System.out.println("Money amount is: " + balance);
                            break;


                    }


                }
                while (select !=4);
                    System.out.println("You are exiting. See you soon...");
                    break;
            }
            else {
                chance--;
                System.out.println("The username or password is incorrect. Please try again.");

                if (chance==0) {
                    System.err.println("Your account has been blocked. Please contact with your bank.");
                }
                else {
                    System.out.println("Your chance left is: " + chance);
                }
            }
        }
    }
}
