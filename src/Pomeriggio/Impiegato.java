package Pomeriggio;

public class Impiegato {

    private String name;
    private double salario;

    public Impiegato(String name, double salario) {
        setName(name);
        setSalario(salario);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void aumentaSalario(int percentuale) throws IllegalArgumentException {
        if (percentuale <= 0) {
            throw new IllegalArgumentException("La percentuale non può essere 0 o negativa");
        }

        double aumento = getSalario() * percentuale / 100.0;
        double nuovoSalario = getSalario() + aumento;
        setSalario(nuovoSalario);
    }

    @Override
    public String toString() {
        return "Nome impiegato: " + getName() + " | Salario: " + getSalario();
    }
}
