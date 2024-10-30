import java.util.Scanner;

public class fourandfive {

    public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);

    int num, powernum;

    System.out.print("Please enter the number: ");
    num = input.nextInt(); 

    System.out.println("The power of 4 until the given number is: ");
    for(powernum=1; powernum <= num; powernum*=4){
        System.out.println(powernum);
    }
    System.out.println("The power of 5 until number is: ");
    for(powernum=1; powernum <= num; powernum*=5){
        System.out.println(powernum);
    }
   /*  System.out.println("Power of 5 until the given number is: ");
    for(powernum=1; powernum <= num; powernum*=5){
        System.out.print(powernum);
    } */



    input.close();
    }
    

    
    
}
