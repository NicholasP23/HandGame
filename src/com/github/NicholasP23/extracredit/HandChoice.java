package com.github.NicholasP23.extracredit;
public class HandChoice {

    private final String[] choice = {"rock","paper","scissors"};

    public String getChoice(){

        double random = Math.random();
        if(random <= .33){
            return choice[0];
        }
        else if(random <= .66){
            return choice[1];
        }
        else{
            return choice[2];
        }
    }

    public void winLose(String userInput){

        String computer = getChoice();
        System.out.println("Computer chose: " + computer);

        if (computer.equalsIgnoreCase(userInput)){
            System.out.println("ITS A TIE! Play again.");
        }
        else if (
                  (userInput.equalsIgnoreCase("rock") && computer.equalsIgnoreCase("paper")) ||
                  (userInput.equalsIgnoreCase("paper") && computer.equalsIgnoreCase("scissors")) ||
                  (userInput.equalsIgnoreCase("scissors") && computer.equalsIgnoreCase("rock"))
                )
        {
            System.out.println("You lost. Nerd.");
        }
        else System.out.println("You won by luck.");

    }
}
