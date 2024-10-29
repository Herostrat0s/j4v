import java.util.Scanner;
public class zodiac {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int day,month;

        System.out.println("What is your birth day: ");
        day = input.nextInt();

        System.out.println("What is your birth month: ");
        month = input.nextInt();

        switch (month) {
            case 1:
                if (day >= 1 && day<=31) {
                    if (day < 22) {
                    System.out.println("Your zodiac sign is Aries");
                }
                    else {
                    System.out.println("Your zodiac sign is Taurus");
                }
            }
                else {
                System.out.println("Please enter a valid date!!!");
            }
                break;
            default:
            System.out.println("Please enter valid birth date information!");

             /* case 2:
                if (day >=1 && day <= 28) {
                    if (day <22) {
                        System.out.println("Your zodiac sign is ");
                    }
                }
                    */ /* bro that's so fucking waste of time we get the idea xoxo */
            
        }
        input.close();
    }
}
