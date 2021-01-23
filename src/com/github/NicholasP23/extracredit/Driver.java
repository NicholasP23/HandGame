package com.github.NicholasP23.extracredit;

import java.util.Scanner;

public class Driver {

    public static void main(String[] args) {
            HandChoice random = new HandChoice();
            Scanner choice = new Scanner(System.in);
            Scanner play = new Scanner(System.in);

            System.out.print("How many times do you wanna play? ");
            int counter = play.nextInt();

            while (counter < 0){
                System.out.print("enter a positive number (<1)");
                counter = play.nextInt();
            }

            do {

                System.out.print("Please pick a hand choice: ");
                String userInput = choice.next();

                while (
                        !userInput.equalsIgnoreCase("rock") &&
                        !userInput.equalsIgnoreCase("paper") &&
                        !userInput.equalsIgnoreCase("scissors")
                ) {
                    System.out.println("Wrong input, please chose: rock, paper, or scissors");
                    userInput = choice.next();
                }

                random.winLose(userInput);
                counter--;

                // Just for neatness
                System.out.println("");
            }while(!(counter == 0));
    }
}
