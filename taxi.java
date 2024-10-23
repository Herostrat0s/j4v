import java.util.Scanner;
public class taxi {
    
    public static void main(String[] args) {
        
        // variables
        int km;
        double perKm = 2.20, total, start=10;


        Scanner input = new Scanner(System.in);

        System.out.println("What is the distance that you have been travelled: ");
        km = input.nextInt();

        int opening = 10;

        total = km * perKm;

        total += start;

        total = (total <20) ? 20: total;
        System.out.println("The total price is: " +  total + "$");


    }
}
