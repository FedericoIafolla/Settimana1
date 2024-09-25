package Esercizio1;

import java.util.Scanner;

public class RettangoloDinamico {
    private double altezza;
    private double larghezza;

    public RettangoloDinamico(double altezza, double larghezza) {
        this.altezza = altezza;
        this.larghezza = larghezza;
    }

    public double getAltezza() {
        return altezza;
    }

    public void setAltezza(double altezza) {
        this.altezza = altezza;
    }

    public double getLarghezza() {
        return larghezza;
    }

    public void setLarghezza(double larghezza) {
        this.larghezza = larghezza;
    }

    public double calcolaArea() {
        return altezza * larghezza;
    }

    public double calcolaPerimetro() {
        return 2 * (altezza + larghezza);
    }

    public static void stampaRettangolo(RettangoloDinamico r) {
        System.out.println("Area: " + r.calcolaArea());
        System.out.println("Perimetro: " + r.calcolaPerimetro());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String continua;

        do {
            // Richiesta all'utente di inserire le misure
            System.out.print("Inserisci l'altezza del rettangolo: ");
            double altezza = scanner.nextDouble();

            System.out.print("Inserisci la larghezza del rettangolo: ");
            double larghezza = scanner.nextDouble();

            // Creazione del rettangolo con le misure fornite dall'utente
            RettangoloDinamico rettangolo = new RettangoloDinamico(altezza, larghezza);

            // Stampa dei dati del rettangolo
            stampaRettangolo(rettangolo);

            // Chiedi all'utente se vuole calcolare un altro rettangolo
            System.out.print("Vuoi calcolare un altro rettangolo? (y/n): ");
            continua = scanner.next();

        } while (continua.equalsIgnoreCase("y")); // Continua se l'utente risponde "y"

        scanner.close(); // Chiusura dello scanner
        System.out.println("Programma terminato.");
    }
}
