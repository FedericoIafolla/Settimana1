package Esercizio3;

import java.util.Scanner;

public class StringaSuddivisa {
    public void suddividiStringa() {
        Scanner scanner = new Scanner(System.in);
        String input;

        while (true) {
            System.out.print("Inserisci una stringa (':q' per uscire): ");
            input = scanner.nextLine();
            if (input.equals(":q")) {
                break;
            }
            String[] caratteri = input.split("");
            System.out.println(String.join(",", caratteri));
        }
    }
}
