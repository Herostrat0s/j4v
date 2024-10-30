import java.util.Scanner;

public class factorial {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Please write down the n value: ");
        int n = input.nextInt();

        System.out.print("Please write down the r value: ");
        int r = input.nextInt();


        // Factorial Calculation. I get some help from chatGPT ugh...
        long nFakt = 1;
        for (int i=1; i<=n; i++) {
            nFakt *= i;
        }

        long rFakt = 1;
        for (int i=1; i<r; i++)
            rFakt *= i;

        long nMinusrFakt = 1;
        for (int i = 1; i < (n-r); i++){
            nMinusrFakt *= i;
        } 

        long combination = nFakt / (rFakt * nMinusrFakt);

        System.out.println("C("+ n + ", "+ r + ")= " + combination);



        input.close();
    }
}
