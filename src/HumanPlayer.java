package com.iris.guessthenumber;

package main.java.corelogic.guessthenumber;

public class HumanPlayer extends Player {
    private Scanner scanner = new Scanner(System.in);

    public HumanPlayer(String name) {
        this.name = name;
        this.guesses = new int[100];
    }

    @Override
    public int makeGuess() {
        System.out.print("Digite seu palpite: ");
        int guess = scanner.nextInt();

        return guess;
    }
}
