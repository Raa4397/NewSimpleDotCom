package Test;

import java.util.Scanner;

public class SimpleDotComGame {
    public static void main (String[] args) {
        int numOfGuesses = 0;
        Scanner scanner = new Scanner(System.in);

        SimpleDotCom theDotCom = new SimpleDotCom();

        int randomNum = (int)(Math.random() * 5) + 1;

        int[] locations = new int[]{randomNum, randomNum+1, randomNum + 2};

        theDotCom.setLocationCells(locations);

        boolean isAlive = true;

        while(isAlive == true) {
            System.out.println("enter a number");
            String userGuess = scanner.nextLine();


            String result = theDotCom.checkYourself(userGuess);

            numOfGuesses++;

            if (result.equals("7 guesses")) {
                isAlive = false;

                System.out.println("You are out of guesses.");
            }

            if (result.equals("Kill")) {
                isAlive = false;

                System.out.println("You took " + numOfGuesses + " guesses");
            }

        }

    }
}
