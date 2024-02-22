import java.util.Random;

/**
 * project
 */
public class project {

    public static void main(String[] args) {
        // Create a new instance of the Random class
        Random r = new Random();
        // Generate a random number between 0 (inclusive) and 200 (inclusive) and assign

        // it to the variable FindMe
        int Randomly = r.nextInt(201);
        int prix = 0;

        while (Randomly != prix) {
System.out.println("please enter a number : between  0 & 200 ! ");
        }
        System.out.println("Yesss champion you did it !!!!" + Randomly);
    }
}
