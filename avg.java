import java.util.Scanner;

public class avg {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int num, divide, sum=0, count=0;

        
         
        System.out.print("Please enter the number: ");
        num = input.nextInt();

        for (divide = 1; divide <= num; divide++) {
            if (divide % 3 == 0 && divide % 4 == 0) {
                sum +=divide;
                count++;
                System.out.println(divide);
            }
        }
        if (count > 0){
            double avg = (double) sum / count;
            System.out.println("The average of numbers that divisible by 3 and 4 is: " + avg);
        }
        else {
            System.out.println("There are no numbers that are divisible by 3 and 4.");
        }
        
        input.close();
    }
    
}
