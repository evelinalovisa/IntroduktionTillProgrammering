package inlamning;

import java.util.Scanner;

public class StopMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Stop stop = new Stop();

        System.out.println("Skriv din text på hur många rader du vill. Skriv 'stop' på en egen rad när du tröttnar: ");

        while (true) {
            String rad = scanner.nextLine();

            if (rad.equals("stop")) {
                break;
            }

            stop.laggTillRad(rad);
        }

        System.out.println("Antal tecken (exklusive raden med 'stop'): " + stop.getAntalTecken());
        System.out.println("Antal rader (exklusive raden med 'stop'): " + stop.getAntalRader());
    }

}
