import java.util.Scanner;
public class circlearea {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the r: ");
        int r = input.nextInt();

        System.out.println("Please enter the angle: ");
        int alfa = input.nextInt();
        

        double pi = Math.PI;

        double area = pi * r * r;
        System.out.println("The area of circle is: " + String.format("%.1f", area));

        double perimeter = 2 * pi * r;
        System.out.println("The perimeter of circle is: " + String.format("%.1f", perimeter));

        double aoc_segment = ((pi * (r * r) * alfa) / 360);
        System.out.println("The area of circle segment is:" + String.format("%.1f", aoc_segment) );

    }
    
}
