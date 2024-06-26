package Pomeriggio;

public class Manager extends Impiegato {

    private int bonus;

    public Manager(String name, double salario, int bonus) {
        super(name, salario);
        setBonus(bonus);
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    @Override
    public void aumentaSalario(int percentuale) throws IllegalArgumentException {
        super.aumentaSalario(percentuale);
        double nuovoSalario = getSalario() + bonus;
        setSalario(nuovoSalario);
    }

    @Override
    public String toString() {
        return "Nome Manager: " + getName() + " | Bonus: " + getBonus() + " | Salario: " + getSalario();
    }

}
