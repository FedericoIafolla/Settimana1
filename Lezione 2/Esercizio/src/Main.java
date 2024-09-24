import Esercizio1.PariDispariBisestile;
import Esercizio2.NumeroInLettere;
import Esercizio3.StringaSuddivisa;
import Esercizio4.ContoAllaRovescia;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Esercizio 1
        System.out.println("Esercizio 1:");
        PariDispariBisestile esercizio1 = new PariDispariBisestile();

        // Chiedi la stringa all'utente
        System.out.print("Inserisci una stringa: ");
        String inputString = scanner.nextLine();
        System.out.println("La stringa '" + inputString + "' ha lunghezza pari? " + esercizio1.stringaPariDispari(inputString));

        // Chiedi l'anno all'utente
        System.out.print("Inserisci un anno: ");
        int inputAnno = scanner.nextInt();
        System.out.println("L'anno " + inputAnno + " è bisestile? " + esercizio1.annoBisestile(inputAnno));

        // Esercizio 2
        System.out.println("\nEsercizio 2:");
        NumeroInLettere esercizio2 = new NumeroInLettere();
        esercizio2.chiediNumero();

        // Esercizio 3
        System.out.println("\nEsercizio 3:");
        StringaSuddivisa esercizio3 = new StringaSuddivisa();
        esercizio3.suddividiStringa();

        // Esercizio 4
        System.out.println("\nEsercizio 4:");
        ContoAllaRovescia esercizio4 = new ContoAllaRovescia();
        esercizio4.contaRovescia();

        // Chiudere lo scanner
        scanner.close();
    }
}
