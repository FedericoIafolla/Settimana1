package Esercizio3;

import java.util.ArrayList;
import java.util.Date;

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
                    ", Prezzo: " + articolo.getPrezzo() +
                    ", Pezzi disponibili: " + articolo.getPezziDisponibili()); // Aggiunto pezzi disponibili
        }
        System.out.println("Totale: " + calcolaTotale() + "€");
    }

    public static void main(String[] args) {
        Cliente cliente = new Cliente("C001", "Giacomino", "Poretti", "giacomino.poretti@agg.com", new Date());

        // Utilizzo dei metodi per dimostrare che sono utilizzati
        System.out.println("Codice Cliente: " + cliente.getCodiceCliente());
        System.out.println("Email: " + cliente.getEmail());
        System.out.println("Data di Iscrizione: " + cliente.getDataIscrizione());

        Articolo articolo1 = new Articolo("A001", "Laptop", 1000, 10);
        Articolo articolo2 = new Articolo("A002", "Mouse", 25, 50);

        Carrello carrello = new Carrello(cliente);
        carrello.aggiungiArticolo(articolo1);
        carrello.aggiungiArticolo(articolo2);

        carrello.stampaCarrello();
    }
}
