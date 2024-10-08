package Esercizio2;

public class Dirigente extends Dipendente {
    private double bonus;

    public Dirigente(String matricola, double stipendio, String dipartimento, double bonus) {
        super(matricola, stipendio, dipartimento);
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        return getStipendio() + bonus; // Salario base più bonus
    }

    @Override
    public String getRuolo() {
        return "Dirigente"; // Ruolo specifico
    }
}
