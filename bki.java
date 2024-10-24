import java.util.Scanner;
public class bki {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your weight: ");
        int weight = input.nextInt();
        
        System.out.println("Please enter your height(m): ");
        double height = input.nextDouble();

        double bmi = (weight / (height * height));
        System.err.println("Your body mass index is: " + bmi);

        String result = (bmi >24) ? "Fatso piggy-piggy" : "You're chad bro" ;
        System.out.println(result);

        input.close();
 
    }
}
