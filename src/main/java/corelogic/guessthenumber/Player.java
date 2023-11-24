package main.java.corelogic.guessthenumber;


public abstract class Player {
    protected String name;
    protected int[] guesses;

    public abstract int makeGuess();

    public String getName() {
        return name;
    }

    public int[] getGuesses() {
        return guesses;
    }
}