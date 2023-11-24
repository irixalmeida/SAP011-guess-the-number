package main.java.corelogic.guessthenumber;

import java.util.Random;

public class GuessTheNumberGame {
    private static Random random = new Random();
    private static int targetNumber;

    // Método para definir o número alvo nos testes
    public static void setTargetNumber(int number) {
        targetNumber = number;
    }

    public static void main(String[] args) {
        targetNumber = random.nextInt(100) + 1; // Gera um número entre 1 e 100
        HumanPlayer humanPlayer = new HumanPlayer("Humano");
        com.iris.guessthenumber.ComputerPlayer computerPlayer = new com.iris.guessthenumber.ComputerPlayer();

        boolean isGameOver = false;
        while (!isGameOver) {
            isGameOver = checkGuess(humanPlayer);
            if (!isGameOver) {
                isGameOver = checkGuess(computerPlayer);
            }
        }
    }

    public static boolean checkGuess(Player player) {
        int guess = player.makeGuess();

        if (guess == targetNumber) {
            System.out.println(player.getName() + " venceu!");
            return true;
        } else if (guess < targetNumber) {
            System.out.println("Muito baixo!");
        } else {
            System.out.println("Muito alto!");
        }
        return false;
    }
}
