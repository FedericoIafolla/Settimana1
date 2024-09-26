package Esercizio2;

public class DipendenteFullTime extends Dipendente {
    public DipendenteFullTime(String matricola, double stipendio, String dipartimento) {
        super(matricola, stipendio, dipartimento);
    }

    @Override
    public double calculateSalary() {
        return getStipendio(); // Stipendio fisso
    }

    @Override
    public String getRuolo() {
        return "Dipendente Full-Time"; // Ruolo specifico
    }
}
