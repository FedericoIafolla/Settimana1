package Esercizio2;

import java.util.Scanner;

public class NumeroInLettere {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;

        do {
            System.out.print("Inserisci un numero intero tra 0 e 3: ");
            numero = scanner.nextInt();

            switch (numero) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("Uno");
                    break;
                case 2:
                    System.out.println("Due");
                    break;
                case 3:
                    System.out.println("Tre");
                    break;
                default:
                    System.out.println("Errore: numero non valido. Riprova.");
                    break;
            }
        } while (numero < 0 || numero > 3);

        scanner.close();
    }
}
