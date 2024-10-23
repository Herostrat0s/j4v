import java.util.Scanner;
public class area {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("What is the value of a: ");
        int a = input.nextInt();

        System.out.println("What is the value of b: ");
        int b = input.nextInt();

        System.out.println("What is the value of c: ");
        int c = input.nextInt();

        int u = (a+b+c);
        int perimeter = 2 * u;
        System.out.println("The perimeter of triangle is: " +  perimeter);

        int area = u * (u-a) * (u-b) * (u-c);
        System.out.println("The area of triangle is: " +  area);

    }
}
