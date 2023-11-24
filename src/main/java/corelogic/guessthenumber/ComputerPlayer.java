package main.java.corelogic.guessthenumber;

import java.util.Random;

public class ComputerPlayer extends Player {
    private Random random = new Random();

    public ComputerPlayer() {
        this.name = "Computador";
        this.guesses = new int[100];
    }

    @Override
    public int makeGuess() {
        int guess = random.nextInt(100) + 1;
        System.out.println("O Computador adivinhou: " + guess);

        return guess;
    }
}
