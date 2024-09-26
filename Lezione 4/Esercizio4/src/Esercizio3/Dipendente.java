package Esercizio3;

public abstract class Dipendente extends Persona {
    private String matricola;
    private double stipendio;
    private String dipartimento;

    public Dipendente(String nome, String matricola, double stipendio, String dipartimento) {
        super(nome); // Chiamata al costruttore di Persona
        this.matricola = matricola;
        this.stipendio = stipendio;
        this.dipartimento = dipartimento;
    }

    public String getMatricola() {
        return matricola;
    }

    public double getStipendio() {
        return stipendio;
    }

    public String getDipartimento() {
        return dipartimento;
    }

    public void setDipartimento(String dipartimento) {
        this.dipartimento = dipartimento;
    }

    public abstract double calculateSalary();
    public abstract String getRuolo();

    @Override
    public void checkIn() {
        System.out.println("Il dipendente " + getNome() + " ha iniziato il suo turno.");
    }
}
