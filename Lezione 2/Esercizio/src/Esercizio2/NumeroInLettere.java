package Esercizio2;

import java.util.Scanner;

public class NumeroInLettere {
    public void chiediNumero() {
        Scanner scanner = new Scanner(System.in);
        int numero;

        while (true) {
            System.out.print("Inserisci un numero intero tra 0 e 3: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Errore: inserisci un numero valido!");
                scanner.next(); // Consuma l'input non valido
            }
            numero = scanner.nextInt();

            switch (numero) {
                case 0:
                    System.out.println("Zero");
                    return;
                case 1:
                    System.out.println("Uno");
                    return;
                case 2:
                    System.out.println("Due");
                    return;
                case 3:
                    System.out.println("Tre");
                    return;
                default:
                    System.out.println("Errore: numero fuori dal range, riprova.");
            }
        }
    }
}
