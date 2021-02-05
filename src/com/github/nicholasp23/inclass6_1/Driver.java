package com.github.nicholasp23.inclass6_1;

import java.util.Scanner;

public class Driver {

    public static void main(String[] args) {
            Game user = new Game();
            Game computer = new Game();
            Scanner choice = new Scanner(System.in);
            int counter = 0;
            System.out.print("How many times do you wanna play? ");
            try {
                counter = choice.nextInt();
                while (counter < 0) {
                    System.out.print("enter a positive number (<1)");
                    counter = choice.nextInt();
                }
            }catch (Exception e){
                System.out.println("That is a no no. rerun program!");
                return;
            }

            do {

                System.out.print("Please pick a hand choice: ");
                String userInput = choice.next();
                user.stringToEnum(userInput);

                while (
                        !userInput.equalsIgnoreCase(String.valueOf(HandChoice.ROCK)) &&
                        !userInput.equalsIgnoreCase(String.valueOf(HandChoice.PAPER)) &&
                        !userInput.equalsIgnoreCase(String.valueOf(HandChoice.SCISSORS)) &&
                        !userInput.equalsIgnoreCase(String.valueOf(HandChoice.TAPE)) &&
                        !userInput.equalsIgnoreCase(String.valueOf(HandChoice.LIGHTER))
                                            ) {
                    System.out.println("Wrong input, please chose: rock, paper, scissors, tape, or lighter");
                    userInput = choice.next();
                    user.stringToEnum(userInput);
                }

                computer.winLose(user);
                counter--;

                // Just for neatness
                System.out.println("");
            }while(!(counter == 0));

            user.toString();
    }
}
