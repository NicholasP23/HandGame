package com.github.nicholasp23.inclass6_1;

public enum HandChoice {
    ROCK("rock"),
    PAPER("paper"),
    SCISSORS("scissors"),
    TAPE("tape"),
    LIGHTER("lighter");

    private final String getName;

    HandChoice(String name) {
        this.getName = name;
    }

}
