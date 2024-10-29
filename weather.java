import java.util.Scanner;
public class weather {
    public static void main(String[] args) {
        
        int heat;

        Scanner input = new Scanner(System.in);

        System.out.println("What is the heat of the weather today?: ");
        heat = input.nextInt();

        if (heat <5) {
            System.out.println("You can go for a ski!");
        }
        else if (heat >= 5 && heat <=25) {
            if (heat >= 5 && heat <=15) {
                System.out.println("You can go to the cinema!");
            }
            else if (heat >= 15 && heat <=25) {
                System.out.println("You can go to a picnic!");
            }

        }
        else {
            System.out.println("You can go to swimming! ");
        }

        input.close();
    }
}
