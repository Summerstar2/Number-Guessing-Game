import java.util.*;
import java.lang.Math;

class Number_Guessor {
    public static void main(String[] args) {
        boolean run = true;
        System.out.println(
                "This program will take input of 2 limits and then you will have to guess the number that the computer randomly generates.");
        while (run) {
            Scanner Upper = new Scanner(System.in);
            System.out.print("Enter the upper limit - ");
            int Upper_limit = Upper.nextInt();
            Scanner Lower = new Scanner(System.in);
            System.out.print("Enter the lower limit - ");
            int Lower_limit = Lower.nextInt();
            if (Upper_limit < Lower_limit) {
                boolean Run = true;
                while (Run) {
                    System.out.println("Lower limit cannot be higher than upper limit.");
                    System.out.print("Enter the lower limit - ");
                    int Lower_limit1 = Lower.nextInt();
                    if (Lower_limit1 < Upper_limit) {
                        break;
                    }
                    if (Lower_limit1 > Upper_limit) {
                        continue;
                    }
                }
            }
            int Random_Number = (int) (Math.random() * (Upper_limit - Lower_limit + 1) + Lower_limit);
            Scanner G = new Scanner(System.in);
            int Threshold = 5;
            int Tries = 0;
            System.out.print("Try guessing the number - ");
            int Guess = G.nextInt();
            boolean Guesses = true;
            while (Guesses) {
                if (Guess == Random_Number) {
                    System.out.println("Congratulations! You guessed the number in " + Tries + " tries!");
                    break;
                }
                if (Tries == Threshold) {
                    System.out.println("You have run out of tries!");
                    System.out.println("The correct number was " + Random_Number);
                    break;
                } else {
                    System.out.println("Wrong guess, try again!");
                    System.out.print("Guess the number - ");
                    Guess = G.nextInt();
                    Tries = Tries + 1;
                    continue;
                }
            }
            Scanner A = new Scanner(System.in);
            System.out.print("Do you want to use this program again? (Yes/No) ");
            String Again = A.nextLine();
            if (Again.equals("Yes")) {
                continue;
            }
            if (Again.equals("No")) {
                break;
            }
            Upper.close();
            Lower.close();
            G.close();
            A.close();
        }
    }
}