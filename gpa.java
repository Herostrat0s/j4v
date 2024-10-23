import java.util.Scanner;
public class gpa {

    public static void main(String[] args) {
        
    
    // variables
    int mat,phys,lang,musc,hist;
    
    // input 
    Scanner input = new Scanner(System.in);

    // outputs
    System.err.println("Please enter your math score:");
    mat = input.nextInt();

    System.err.println("Please enter your physics score:");
    phys = input.nextInt();
    
    System.err.println("Please enter your language score:");
    lang = input.nextInt();

    System.err.println("Please enter your music score:");
    musc = input.nextInt();

    System.err.println("Please enter your history score:");
    hist = input.nextInt();

    int sum = (mat + phys + lang + musc + hist);
    double gpa = sum / 6;

    System.err.println(gpa);

    String result = (gpa >= 50)? "passed": "failed";
    System.out.println("You have " + result + "!");

    

}

}