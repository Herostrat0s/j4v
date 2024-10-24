import java.util.Scanner;
public class grocery {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        double apple = 3.67;
        double pear = 2.14;
        double tomato = 1.11;
        double banana = 0.95;
        double eggplant = 5.00;

        System.out.println("Please tell me how many kgs apple you bought: ");
        double apple_bought = input.nextInt();
        System.out.println("Please tell me how many kgs pear you bought: ");
        double pear_bought = input.nextInt();
        System.out.println("Please tell me how many kgs tomato you bought: ");
        double tomato_bought = input.nextInt();
        System.out.println("Please tell me how many kgs banana you bought: ");
        double banana_bought = input.nextInt();
        System.out.println("Please tell me how many kg eggplant you bought: ");
        double eggplant_bought = input.nextInt();

        double total_cost = ((apple * apple_bought) + (pear * pear_bought) + (tomato * tomato_bought) + (banana * banana_bought)
        + (eggplant * eggplant_bought));
        System.out.println("Total cost of your grocery is:  "+  total_cost);

        input.close();
    }
    
}
