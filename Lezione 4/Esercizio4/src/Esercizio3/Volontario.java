package Esercizio3;

public class Volontario extends Persona {
    private int eta;
    private String cv;

    public Volontario(String nome, int eta, String cv) {
        super(nome); // Chiamata al costruttore di Persona
        this.eta = eta;
        this.cv = cv;
    }

    public int getEta() {
        return eta;
    }

    public String getCv() {
        return cv;
    }

    @Override
    public void checkIn() {
        System.out.println("Il volontario " + getNome() + " ha iniziato il suo servizio.");
    }

    public String getRuolo() {
        return "Volontario";
    }
}
