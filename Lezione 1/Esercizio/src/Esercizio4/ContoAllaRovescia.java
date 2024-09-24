package Esercizio4;

import java.util.Scanner;

public class ContoAllaRovescia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String risposta;

        do {
            // Chiede all'utente di inserire un numero intero
            System.out.print("Inserisci un numero intero per il conto alla rovescia: ");
            int numero = scanner.nextInt();

            // Esegue il conto alla rovescia
            for (int i = numero; i >= 0; i--) {
                System.out.println(i);
            }

            // Chiede all'utente se vuole ricominciare
            System.out.print("Vuoi fare un altro conto alla rovescia? (sì/no): ");
            risposta = scanner.next().toLowerCase();  // Legge la risposta e la converte in minuscolo

        } while (risposta.equals("sì"));

        System.out.println("Programma terminato.");
        scanner.close();
    }
}
