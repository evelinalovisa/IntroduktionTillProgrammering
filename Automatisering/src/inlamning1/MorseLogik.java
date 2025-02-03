package inlamning1;

import java.util.HashMap;
import java.util.Map;

public class MorseLogik {

    private static final Map<Character, String> textToMorseMap = new HashMap<>();
    private static final Map<String, Character> morseToTextMap = new HashMap<>();

    static {
        textToMorseMap.put('A', ".-");
        textToMorseMap.put('B', "-...");
        textToMorseMap.put('C', "-.-.");
        textToMorseMap.put('D', "-..");
        textToMorseMap.put('E', ".");
        textToMorseMap.put('F', "..-.");
        textToMorseMap.put('G', "--.");
        textToMorseMap.put('H', "....");
        textToMorseMap.put('I', "..");
        textToMorseMap.put('J', ".---");
        textToMorseMap.put('K', "-.-");
        textToMorseMap.put('L', ".-..");
        textToMorseMap.put('M', "--");
        textToMorseMap.put('N', "-.");
        textToMorseMap.put('O', "---");
        textToMorseMap.put('P', ".--.");
        textToMorseMap.put('Q', "--.-");
        textToMorseMap.put('R', ".-.");
        textToMorseMap.put('S', "...");
        textToMorseMap.put('T', "-");
        textToMorseMap.put('U', "..-");
        textToMorseMap.put('V', "...-");
        textToMorseMap.put('W', ".--");
        textToMorseMap.put('X', "-..-");
        textToMorseMap.put('Y', "-.--");
        textToMorseMap.put('Z', "--..");

        for (Map.Entry<Character, String> entry : textToMorseMap.entrySet()) {
            morseToTextMap.put(entry.getValue(), entry.getKey());
        }
    }

    public String textToMorse(String text) {
        if (text.isEmpty()) return "";
        StringBuilder morse = new StringBuilder();
        for (char c : text.toUpperCase().toCharArray()) {
            if (c == ' ') {
                morse.append("   ");
            } else {
                String morseSymbol = textToMorseMap.get(c);
                if (morse.length() > 0 && morse.charAt(morse.length() - 1) != ' ' && c != ' ') {
                    morse.append(" ");
                }
                morse.append(morseSymbol);
            }
        }
        return morse.toString();
    }


    public String morseToText(String morse) {
        if (morse == null || morse.isEmpty()) {
            return "";
        }

        StringBuilder decodedText = new StringBuilder();
        String[] morseWords = morse.split("   ");

        for (String word : morseWords) {
            String[] morseLetters = word.split(" ");

            for (String morseLetter : morseLetters) {
                Character decodedChar = morseToTextMap.get(morseLetter);
                if (decodedChar != null) {
                    decodedText.append(decodedChar);
                } else {

                    return "";
                }
            }
            decodedText.append(" ");
        }

        return decodedText.toString().trim();
    }
    public static boolean containsInvalidCharacters(String text) {
        return !text.matches("[a-zA-Z\\s]+");
    }
}
