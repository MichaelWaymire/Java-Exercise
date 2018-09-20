import java.util.Scanner;
import java.util.Random;

public class HighLow {

    public static void main(String[] args) {

        //Variables
        Random randomNumber = new Random();
        Scanner kbd = new Scanner(System.in);
        int computerValue = randomNumber.nextInt(100);
        int numberOfTries = 0;
        int success = 0;
        int guess = 0;


        while(true) {
            computerValue = randomNumber.nextInt(100);
            numberOfTries = 0;
            while (true) {
                System.out.println("Pick a number between 1 and 100: ");
                guess = kbd.nextInt();
                numberOfTries++;

                if (guess < 1 || guess > 100) System.out.println("Not what i'm looking for! Try again");
                else if (guess == computerValue) {
                    System.out.println("Look at you go! It took you " +
                            numberOfTries + " tried to get it right!" + " The number was: " + computerValue);
                    // leave the first loop
                    break;
                }
                else if (guess < computerValue) System.out.println("Too low, try again!");
                else if (guess > computerValue) System.out.println("Too high, try again!");
            }

            System.out.println("Do you want to play again? (1:Yes/2:No)");
            // if input is not yes leave second loop
            if(kbd.nextInt() != 1) break;
        }


    }

//    public static String lowHigh(){
//        //Generates a Randome number between 1 and 100
////        Random randomizer = new Random();
////        int rand = randomizer.nextInt(100)+1;
////        System.out.println(rand);
////
////        int randomNumber = rand;
//
//        //Allows input
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Figure out that number! Guess between 1-100");
//
//
//        //The number the player gave
//        int numberGiven = scanner.nextInt();
//
//
//        do {
//            Random randomizer = new Random();
//            int rand = randomizer.nextInt(100)+1;
//            System.out.println(rand);
//            int randomNumber = rand;
//
//            if (rand > numberGiven) {
//                System.out.println("To low! Number guessed: " + numberGiven);
//            } else if (rand < numberGiven) {
//                System.out.println("To high! Number guessed: " + numberGiven);
//            } else {
//                System.out.println("You got it! the number is: " + rand);
//            }
//        }while(numberGiven == );
//        return lowHigh();
//
//    }
}
