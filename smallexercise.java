import java.util.Scanner;

public class smallexercise {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        for (boolean run = true; run;) {
            System.out.println("Please enter a number: ");
            int num = input.nextInt();
            if (num <0) {
                run = false;
            }
        }
        input.close();
    }
}
