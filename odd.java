import java.util.Scanner;

public class odd {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int num= 0, count=0, sum=0;
        System.out.print("Please enter the number: ");
        num = input.nextInt();

          do  {
            System.out.print("Please enter the number: ");
            num = input.nextInt();
            if (num % 2 == 0 && num % 4 == 0) {
                sum += num;
                count++;
            }
        } while (num % 2 == 0);

        System.out.println("The odd number is: " + num);
        System.out.println("The sum of even numbers is: " + sum);
    }
}
