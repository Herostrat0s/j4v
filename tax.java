import java.util.Scanner;
public class tax {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("What is the price of product:");
        int pre_tax_price = input.nextInt();

        double after_tax_price = pre_tax_price + pre_tax_price * 0.18;
        System.out.println("The after tax price is: " + after_tax_price);

        double tax_price = pre_tax_price * 0.18f;
        System.out.println("The tax added is: " +String.format("%.1f", tax_price));
    }
}
