import java.util.Scanner;
public class numbers {

    public static void main(String[] args) {

        int a,b,c;

        Scanner input = new Scanner(System.in);

        System.out.println("Please provide the value of a: ");
        a = input.nextInt();
        System.out.println("Please provide the value of b: ");
        b = input.nextInt();
        System.out.println("Please provide the value of c: ");
        c = input.nextInt();

        if (a > b &&  a > c) {
            if (b>c) {
                System.out.println("The correct order is: a>b>c !");
            }
            else {
                System.out.println("The correct order is a>c>b");
            }
        }
        else if (b > a &&  b > c) {
            if (a>c) {
                System.out.println("The correct order is: b>a>c !");
            }
            else {
                System.out.println("The correct order is b>c>a");
            }
        }
        else {
            if (a >b) {
                System.out.println("The correct order is c>a>b");
            }
            else {
                System.out.println("The correct order is c>b>a");
            }
        }
        input.close();
    }
}

