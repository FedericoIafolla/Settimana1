package Esercizio4;

import java.util.ArrayList;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class Carrello {
    private final Cliente cliente;
    private final ArrayList<Articolo> articoli;

    public Carrello(Cliente cliente) {
        this.cliente = cliente;
        this.articoli = new ArrayList<>();
    }

    public void aggiungiArticolo(Articolo articolo) {
        articoli.add(articolo);
    }

    public void rimuoviArticolo(String codice) {
        articoli.removeIf(articolo -> articolo.getCodice().equals(codice));
    }

    public double calcolaTotale() {
        double totale = 0;
        for (Articolo articolo : articoli) {
            totale += articolo.getPrezzo();
        }
        return totale;
    }

    public void stampaCarrello() {
        System.out.println("Cliente: " + cliente.getNome() + " " + cliente.getCognome());
        System.out.println("Data di iscrizione: " + cliente.getDataIscrizione());
        System.out.println("Articoli nel carrello:");
        for (Articolo articolo : articoli) {
            System.out.println("Codice: " + articolo.getCodice() +
                    ", Descrizione: " + articolo.getDescrizione() +
                    ", Prezzo: " + articolo.getPrezzo() + "€");
        }
        System.out.println("Totale: " + calcolaTotale() + "€");
    }

    public static String generaCodice(int lunghezza) {
        Random random = new Random();
        StringBuilder codice = new StringBuilder();
        for (int i = 0; i < lunghezza; i++) {
            codice.append(random.nextInt(10));
        }
        return codice.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci il nome del cliente: ");
        String nome = scanner.nextLine();
        System.out.print("Inserisci il cognome del cliente: ");
        String cognome = scanner.nextLine();
        System.out.print("Inserisci l'email del cliente: ");
        String email = scanner.nextLine();

        Cliente cliente = new Cliente(generaCodice(5), nome, cognome, email, new Date());
        Carrello carrello = new Carrello(cliente); // Creiamo un'istanza del Carrello

        System.out.println("Registrazione cliente completata.");
        System.out.println("Codice Cliente: " + cliente.getCodiceCliente());
        System.out.println("Nome: " + cliente.getNome());
        System.out.println("Cognome: " + cliente.getCognome());
        System.out.println("Email: " + cliente.getEmail());

        System.out.print("Vuoi procedere a registrare un articolo? (y/n): ");
        if (!scanner.nextLine().equalsIgnoreCase("y")) {
            System.out.println("Chiusura del programma.");
            return;
        }

        while (true) {
            System.out.print("Inserisci la descrizione dell'articolo: ");
            String descrizione = scanner.nextLine();
            double prezzo = Math.round((Math.random() * 100) * 100.0) / 100.0;
            Articolo articolo = new Articolo(generaCodice(3), descrizione, prezzo);
            carrello.aggiungiArticolo(articolo);

            System.out.println("Articolo registrato. Codice Articolo: " + articolo.getCodice() + ", Prezzo: " + articolo.getPrezzo() + "€");

            System.out.print("Vuoi registrare un altro articolo? (y/n): ");
            if (!scanner.nextLine().equalsIgnoreCase("y")) {
                break;
            }
        }

        System.out.print("Vuoi rimuovere un articolo? (y/n): ");
        if (scanner.nextLine().equalsIgnoreCase("y")) {
            System.out.print("Inserisci il codice dell'articolo da rimuovere: ");
            String codiceDaRimuovere = scanner.nextLine();
            carrello.rimuoviArticolo(codiceDaRimuovere);
            System.out.println("Articolo rimosso.");
        }

        System.out.print("Vuoi procedere all'acquisto? (y/n): ");
        if (scanner.nextLine().equalsIgnoreCase("y")) {
            System.out.println("Grazie per l'acquisto!");
        } else {
            System.out.println("Chiusura del programma.");
        }

        scanner.close();
    }
}
