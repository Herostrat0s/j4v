import java.util.Scanner;
public class calc {
    public static void main(String[] args) {
        
        int n1,n2,select;

        Scanner input = new Scanner(System.in);

        System.out.println("Please insert first number: ");
        n1 = input.nextInt();
        System.out.println("Please insert second number: ");
        n2 = input.nextInt();

        System.out.println("Please choose the operation you want to perform: 1 - Summary / 2 - Substution / 3 - Multiplation / 4 - Division: ");
        select = input.nextInt();

        switch (select) {
            case 1:
                System.out.println("The result is = " + (n1+n2));
                
            break;
            case 2:
                System.out.println("The result is = " + (n1-n2));

            break;
            case 3:
                System.out.println("The result is = " + (n1*n2));

            break;
            case 4:
            System.out.println("The result is = " + (n1/n2));

            default:
                System.out.println("Please enter a valid operation!");
                break;
        }
        
        input.close();

    }
}
