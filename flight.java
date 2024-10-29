import java.util.Scanner;
public class flight {

    public static void main(String[] args) {
        
        int km,type,age;
        double price,age_price,last_price;

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your distance: ");
        km = input.nextInt();
        if (km <= 0) {
            System.out.println("Please enter a valid distance: ");
            input.nextInt();
        }
        
        System.out.println("Please enter your flight type: 1-One sided / 2-Two sided: ");
        type = input.nextInt();
        if (type != 1 & type != 2) {
            System.out.println("Please enter a valid flight type: ");
            input.nextInt();
        }
        
        System.out.println("Please enter your age: ");
        age = input.nextInt();
        if (age <= 0) {
            System.out.println("Please enter a valid age: ");
            input.nextInt();
        }

        price = (km * 0.1);

        if (age < 12) {
            price = price - (price *= 0.5);
            /* System.out.println("Your ticket price is: " + price); */
        }
        else if (age >= 12 & age <= 24) {
            price = price - (price *= 0.1);
            /* System.out.println("Your ticket price is: " + price); */
        }
        else {
            price = price - (price *= 0.3);
           /* System.out.println("Your ticket price is: " + price); */
        }

        if (type == 2) {
            price = (price - (price *= 0.2)) * 2;
            System.out.println("The total price is: " + price);
        }

        else {
            System.out.println("The total price is: " + price);
        }
        input.close();



    }
    
}
