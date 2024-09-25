package Esercizio3;

public class Articolo {
    private final String codice;            // Codice dell'articolo
    private final String descrizione;       // Descrizione dell'articolo
    private final double prezzo;             // Prezzo dell'articolo
    private final int pezziDisponibili;      // Numero pezzi disponibili a magazzino, dichiarato come final

    public Articolo(String codice, String descrizione, double prezzo, int pezziDisponibili) {
        this.codice = codice;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.pezziDisponibili = pezziDisponibili; // Assegnazione all'attributo
    }

    public String getCodice() {
        return codice; // Getter per il codice
    }

    public String getDescrizione() {
        return descrizione; // Getter per la descrizione
    }

    public double getPrezzo() {
        return prezzo; // Getter per il prezzo
    }

    public int getPezziDisponibili() {
        return pezziDisponibili; // Aggiunto getter per pezziDisponibili
    }
}
