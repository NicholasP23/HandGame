package com.github.nicholasp23.inclass6_1;

import static com.github.nicholasp23.inclass6_1.HandChoice.*;

public class Game {
    int wins = 0;
    int loses = 0;
    int ties = 0;

    public HandChoice getChoice(){

        double random = Math.random();
        if(random <= .2){
            return ROCK;
        }
        else if(random <= .4){
            return PAPER;
        }
        else if(random <= .6){
            return SCISSORS;
        }
        else if(random <= .8) {
            return TAPE;
        }
        else{
            return LIGHTER;
        }
    }

    public void winLose(Game userInput){

        HandChoice computer = getChoice();
        System.out.println("Computer chose: " + computer);

        if (computer.equals(userInput)){
            System.out.println("ITS A TIE! Play again.");
            ties++;
        }
        else if (
                (userInput.equals(ROCK) && computer.equals(PAPER)) ||
                (userInput.equals(PAPER) && computer.equals(SCISSORS)) ||
                (userInput.equals(SCISSORS) && computer.equals(HandChoice.TAPE)) ||
                (userInput.equals(HandChoice.TAPE) && computer.equals(HandChoice.LIGHTER)) ||
                (userInput.equals(HandChoice.LIGHTER) && computer.equals(ROCK))
        )
        {
            System.out.println("You lost. Nerd.");
            loses++;
        }
        else {
            System.out.println("You won by luck.");
            wins++;
        }
    }

    @Override
    public String toString(){
        return "Game over. Here are your results:\n" +
                "Wins: " + wins + "\nLoses: " + loses + "\nTies: " + ties;
    }

    public HandChoice stringToEnum (String input){
        if(input.equalsIgnoreCase("rock")){
            return ROCK;
        }
        else if(input.equalsIgnoreCase("paper")){
            return PAPER;
        }
        else if(input.equalsIgnoreCase("scissors")){
            return SCISSORS;
        }
        else if(input.equalsIgnoreCase("tape")){
            return TAPE;
        }
        else if(input.equalsIgnoreCase("lighter")){
            return LIGHTER;
        }
        else{
            return null;
        }

    }

}
