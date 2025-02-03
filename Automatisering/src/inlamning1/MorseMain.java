package inlamning1;

import java.util.Scanner;

public class MorseMain {
    public static void main(String[] args) {
        MorseLogik converter = new MorseLogik();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hej på dig och välkommen till programmet Morse2000.");
        System.out.println("Skriv 'text' för att konvertera text till Morse, eller 'morse' för att konvertera Morse till text.");

        String choice = scanner.nextLine().toLowerCase();

        if (choice.equals("text")) {
            System.out.println("Skriv den text du vill konvertera till Morse:");
            String textInput = scanner.nextLine();

            if (textInput.isEmpty()) {
                System.out.println("Du måste skriva in en text.");
            } else if (MorseLogik.containsInvalidCharacters(textInput)) {
                System.out.println("Texten får endast innehålla bokstäver mellan A-Z samt mellanslag.");
            } else {
                String morseOutput = converter.textToMorse(textInput);
                System.out.println("Morse: " + morseOutput);
            }

        } else if (choice.equals("morse")) {
            System.out.println("Skriv den Morse du vill konvertera till text");
            String morseInput = scanner.nextLine();
            String textOutput = converter.morseToText(morseInput);
            System.out.println("Text: " + textOutput);
        } else {
            System.out.println("Du kan bara välja 'text' eller 'morse'. Försök igen.");
        }

        scanner.close();
    }
}
