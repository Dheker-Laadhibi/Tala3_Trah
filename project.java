import java.util.Random;
import java.util.Scanner;

public class project {

    public static void main(String[] args) {
        // UserName 
    
        // Create a new instance of the Random class
        Random r = new Random();
        // Generate a random number between 0 (inclusive) and 200 (inclusive) and assign it to the variable Randomly
        int Randomly = r.nextInt(201);
        int prix = 0;

        // Repeat until the user wins
        Scanner scan = new Scanner(System.in); // Create the scanner outside the loop
        while (Randomly != prix) {
            System.out.println("Please enter a number between 0 & 200: ");
            prix = scan.nextInt();

            if (Randomly > prix) {
                System.out.println("You need to increase the entered value.");
            } else if (Randomly < prix) {
                System.out.println("You need to decrease the entered value.");
            }
        }
        scan.close(); // Closing the scanner outside the loop

        // Win
        System.out.println("Yesss champion you did it ! The number was: " + Randomly);
    }
}
