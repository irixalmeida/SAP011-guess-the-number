import main.java.corelogic.guessthenumber.GuessTheNumberGame;
import main.java.corelogic.guessthenumber.Player;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import static org.junit.jupiter.api.Assertions.*;

class GuessTheNumberGameTest {
    @Test
    void testGuessTooHigh() {
        GuessTheNumberGame.setTargetNumber(50);

        Player mockPlayer = Mockito.mock(Player.class);
        Mockito.when(mockPlayer.makeGuess()).thenReturn(60);

        assertFalse(GuessTheNumberGame.checkGuess(mockPlayer));
    }
    @Test
    void testGuessTooLow() {
        GuessTheNumberGame.setTargetNumber(50);

        Player mockPlayer = Mockito.mock(Player.class);
        Mockito.when(mockPlayer.makeGuess()).thenReturn(40);

        assertFalse(GuessTheNumberGame.checkGuess(mockPlayer));
    }

    @Test
    void testCorrectGuess() {
        GuessTheNumberGame.setTargetNumber(50);

        Player mockPlayer = Mockito.mock(Player.class);
        Mockito.when(mockPlayer.makeGuess()).thenReturn(50);

        assertTrue(GuessTheNumberGame.checkGuess(mockPlayer));
    }
}
