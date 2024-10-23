import java.util.Scanner;
public class tax {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("What is the price of product:");
        int pre_tax_price = input.nextInt();

        if (pre_tax_price > 1000) {
        double after_tax_price = pre_tax_price + pre_tax_price * 0.18;
        System.out.println("The after tax price is: " +String.format("%.1f", after_tax_price));
        double tax_price = pre_tax_price * 0.18f;
        System.out.println("The tax added is: " +String.format("%.1f", tax_price));
        }

        else { 
        double after_tax_price = pre_tax_price + pre_tax_price * 0.08;
        System.out.println("The after tax price is: " +String.format("%.1f", after_tax_price));
        double tax_price = pre_tax_price * 0.08f;
        System.out.println("The tax added is: " +String.format("%.1f", tax_price));
        }
    }
}
