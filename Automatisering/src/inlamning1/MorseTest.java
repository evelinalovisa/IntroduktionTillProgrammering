package inlamning1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MorseTest {
    private final MorseLogik converter = new MorseLogik();

    @Test
    public void testIndividualLetters() {
        //Test för bokstaven F
        assertEquals("..-.", converter.textToMorse("F"));
        assertEquals("F", converter.morseToText("..-."));
    }

    @Test
    public void testMultipleLettersWithoutSpaces() {
        //Test för HELLO till Morse och tillbaka
        assertEquals(".... . .-.. .-.. ---", converter.textToMorse("HELLO"));
        assertEquals("HELLO", converter.morseToText(".... . .-.. .-.. ---"));
    }

    @Test
    public void testEmptyStrings() {
        //Testa tom text till Morse
        assertEquals("", converter.textToMorse(""));
        //Testa tom Morse till text
        assertEquals("", converter.morseToText(""));
    }

    @Test
    public void testMixedUpperLowerCase() {
        //Testa text med små bokstäver till Morse
        assertEquals(".... . .-.. .-.. ---", converter.textToMorse("hello"));
        //Testa Morse till text som förväntas bli stora bokstäver
        assertEquals("HELLO", converter.morseToText(".... . .-.. .-.. ---"));
    }

    @Test
    public void testLongerString() {
        //Testa en längre text till Morse
        assertEquals(".... . .-.. .-.. ---   - .... .. ...   .. ...   .-   - . ... -   --- ..-.   -- --- .-. ... .   -.-. --- -.. .   - .-. .- -. ... .-.. .- - .. --- -.",
                converter.textToMorse("HELLO THIS IS A TEST OF MORSE CODE TRANSLATION"));
        //Testa längre Morse tillbaka till text
        assertEquals("HELLO THIS IS A TEST OF MORSE CODE TRANSLATION",
                converter.morseToText(".... . .-.. .-.. ---   - .... .. ...   .. ...   .-   - . ... -   --- ..-.   -- --- .-. ... .   -.-. --- -.. .   - .-. .- -. ... .-.. .- - .. --- -."));
    }

}