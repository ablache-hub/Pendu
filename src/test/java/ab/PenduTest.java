package ab;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Unit test for simple App.
 */
class PenduTest {
    /**
     * Rigorous Test.
     */

    @Test
    public void generationSqueletteMot() {
        List<String> arrayExpected = Arrays.asList("_", "_", "_", "_", "_", "_", "_", "_", "_", "_");
        assertEquals(arrayExpected, Pendu.generationSqueletteMot("Terminator"));
        List<String> arrayExpected2 = Arrays.asList("_", "_", "_", "_");
        assertEquals(arrayExpected2, Pendu.generationSqueletteMot("test"));
    }

    @Test
    public void motEnArray() {

        List<String> arrayExpected = Arrays.asList("t", "e", "s", "t");
        assertEquals(arrayExpected, Pendu.motEnArray("test"));
        List<String> arrayExpected2 = Arrays.asList("s", "i", "m", "p", "l", "o", "n");
        assertEquals(arrayExpected2, Pendu.motEnArray("simplon"));
    }

    @Test
    public void checkerSiLettresRestantes() {

        List<String> arrayIn = Arrays.asList("t", "_", "s", "t");
        assertEquals(true, Pendu.checkerSiLettresRestantes(arrayIn));
        List<String> arrayIn2 = Arrays.asList("s", "i", "m", "p", "l", "o", "n");
        assertEquals(false, Pendu.checkerSiLettresRestantes(arrayIn2));
    }

}
