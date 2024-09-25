package Esercizio4;

import java.util.Random;

public class Articolo {
    private final String codice;
    private final String descrizione;
    private final double prezzo;

    public Articolo(String codice, String descrizione, double prezzo) {
        this.codice = codice;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
    }

    public String getCodice() {
        return codice;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public double getPrezzo() {
        return prezzo;
    }
}
