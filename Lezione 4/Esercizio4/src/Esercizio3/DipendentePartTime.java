package Esercizio3;

public class DipendentePartTime extends Dipendente {
    private double oreLavorate;
    private double tariffaOraria;

    public DipendentePartTime(String nome, String matricola, double oreLavorate, double tariffaOraria, String dipartimento) {
        super(nome, matricola, tariffaOraria * oreLavorate, dipartimento);
        this.oreLavorate = oreLavorate;
        this.tariffaOraria = tariffaOraria;
    }

    @Override
    public double calculateSalary() {
        return oreLavorate * tariffaOraria; // Calcolo in base alle ore lavorate
    }

    @Override
    public String getRuolo() {
        return "Dipendente Part Time";
    }
}
