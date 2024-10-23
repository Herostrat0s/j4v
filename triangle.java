import java.util.Scanner;
public class triangle {

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
       // Scanner c = new Scanner(System.in);

       System.out.println("What is the value of a:");
       int a = input.nextInt();
       System.out.println("What is the value of b:");
       int b = input.nextInt();


       double c = (Math.sqrt(a*a + b*b));
       System.out.println("The value of c is: " + c);






    }
}

