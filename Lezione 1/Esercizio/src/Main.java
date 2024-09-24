import Esercizio1.PariDispariBisestile;
import Esercizio2.NumeroInLettere;
import Esercizio3.StringaSuddivisa;
import Esercizio4.ContoAllaRovescia;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Esercizio 1: PariDispari e Bisestile
        System.out.println("Esercizio 1: Verifica stringa pari/dispari e anno bisestile.");
        System.out.print("Inserisci una stringa: ");
        String inputStringa = scanner.nextLine();
        System.out.println("La stringa è pari: " + PariDispariBisestile.stringaPariDispari(inputStringa));

        System.out.print("Inserisci un anno: ");
        int inputAnno = scanner.nextInt();
        System.out.println("L'anno è bisestile: " + PariDispariBisestile.annoBisestile(inputAnno));

        // Esercizio 2: Numero in lettere
        System.out.println("\nEsercizio 2: Stampa il numero in lettere.");
        NumeroInLettere.main(null);  // Richiama direttamente il main dell'esercizio 2

        // Esercizio 3: Suddivisione stringa in caratteri
        System.out.println("\nEsercizio 3: Suddividi la stringa in caratteri separati da virgola.");
        StringaSuddivisa.main(null);  // Richiama direttamente il main dell'esercizio 3

        // Esercizio 4: Conto alla rovescia con ripetizione
        System.out.println("\nEsercizio 4: Conto alla rovescia.");
        ContoAllaRovescia.main(null);  // Richiama direttamente il main dell'esercizio 4

        scanner.close();
    }
}
