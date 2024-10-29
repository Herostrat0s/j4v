import java.util.Scanner;

public class exam {
    public static void main(String[] args) {
        
        int math, lang, chem,music;
        int total_score, total_weight;

        total_score = 0;
        total_weight = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your mathematics note: ");
        math = input.nextInt();
        if (math > 0 && math < 100) {
            total_score += math * 6;
            total_weight += 6;
        }
        System.out.println("Please enter your language note: ");
        lang = input.nextInt();
        if (lang > 0 && lang < 100) {
            total_score += lang * 5;
            total_weight += 5;
        }
        System.out.println("Please enter your chemistry note: ");
        chem = input.nextInt();
        if (chem > 0 && chem < 100) {
            total_score += chem * 4;
            total_weight += 4;
        }
        System.out.println("Please enter your music note: ");
        music = input.nextInt();
        if (music > 0 && music < 100) {
            total_score += music * 2;
            total_weight += 2;
        }

        int grade = (total_score / total_weight);
        System.out.println("Your average grade is: " + grade); 

        if (grade < 55) {
            System.out.println("You failed the class! ");
        }
        else {
            System.out.println("You succesfully completed the class! ");
        
        }
        input.close();
    }
}
