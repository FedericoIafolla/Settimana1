package Esercizio3;

public class DipendenteFullTime extends Dipendente {
    public DipendenteFullTime(String nome, String matricola, double stipendio, String dipartimento) {
        super(nome, matricola, stipendio, dipartimento);
    }

    @Override
    public double calculateSalary() {
        return getStipendio(); // Stipendio mensile fisso
    }

    @Override
    public String getRuolo() {
        return "Dipendente Full Time";
    }
}
