package Esercizio3;

public abstract class Persona implements CheckIn {
    protected String nome;

    public Persona(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public abstract void checkIn(); // Metodo astratto da implementare
}
