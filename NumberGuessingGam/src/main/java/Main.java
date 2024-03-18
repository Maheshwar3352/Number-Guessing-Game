
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String play = "yas";

        while (play.equals("yas")) {
            Random rand = new Random();
            int randNum = rand.nextInt(100);
            int guess = -1;
            int tries = 0;

            while (guess != randNum) {
                System.out.print("Guess a number between 1 and 100: ");
                guess = reader.nextInt();
                tries++;

                if (guess == randNum) {
                    System.out.println("Awesome! You guess the number!");
                    System.out.println("If only took you"+tries+"guess!");
                    System.out.println("Would you like to play agin? Yas or No: ");
                    play = reader.next().toLowerCase();

                } else if (guess > randNum) {
                    System.out.println("Your guess is too high, try again.");
                } else {
                    System.out.println("Your guess is too low, try again.");
                }
            }
        }
        reader.close();
    }

}
