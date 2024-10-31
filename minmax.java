import java.util.Scanner;

public class minmax {

    public static void main(String[] args) {

        int max, min, n, i;

        Scanner input = new Scanner(System.in); 
        
        do {
        System.out.print("How many numbers you will enter: ");
         n = input.nextInt();

        if (n<= 0) {
            System.out.println("Please enter a valid number!");
        }
    }while (n <= 0);

            System.out.println("Please enter the first number: ");
            int first_Number = input.nextInt();

             max = first_Number;
             min = first_Number;

        for (i =2; i <=n; i++) {
                System.out.println("Please enter "+ i + "th number: ");
                int number = input.nextInt();

                if (number > max) {
                    max = number;
                }

                if (number < min) {
                    min = number;
                } 
            }
            System.out.println("The max number is : " + max);
            System.err.println("The min number is: " +  min);
            
            input.close();
 }

        


        
    }