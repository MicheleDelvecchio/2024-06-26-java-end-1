
import java.util.ArrayList;
import java.util.List;

public class Studente {

    /*
    *  ES2: Registro Studenti
    *
    * Crea una classe Studente con attributi come nome, matricola, e voti (usa un
    * ArrayList). Aggiungi metodi per aggiungere voti, calcolare la media dei voti,
    * e stampare i dettagli dello studente. Implementa la gestione delle eccezioni
    * per evitare errori nell'inserimento dei voti.
    *
     */
    private String name;
    private String matricola;
    private List<Double> voti = new ArrayList<>();

    public Studente(String name, String matricola) {
        setName(name);
        setMatricola(matricola);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMatricola() {
        return matricola;
    }

    public void setMatricola(String matricola) {
        this.matricola = matricola;
    }

    public List<Double> getVoti() {
        return voti;
    }

    public void setVoti(List<Double> voti) {
        this.voti = voti;
    }

    public void aggiugniVoto(double voto) throws Exception {
        if (voto > 10.0 || voto < 0.0) {
            throw new Exception("I voti possono andare da un minimo di 0 ad un massimo di 10");
        }
        voti.add(voto);
        System.out.println("Voto aggiunto correttamente");
    }

    public Double calcoloMedia() throws ArithmeticException {
        double tot = 0.0;
        double media = 0.0;
        for (double x : voti) {
            tot += x;
        }
        if (voti.size() <= 0) {
            throw new ArithmeticException("Non ci sono voti per calcolare la media!");
        } else {
            media = tot / voti.size();
            return media;
        }
    }

    public String toString() {
        double media = 0.0;
        try {
            media = calcoloMedia();
        } catch (ArithmeticException e) {
            return "-----------------------------------" + "\n"
                    + "Nome: " + getName() + "\n"
                    + "Matricola: " + getMatricola() + "\n"
                    + "Media: Nessun voto disponibile";
        }
        return "-----------------------------------" + "\n"
                + "Nome: " + getName() + "\n"
                + "Matricola: " + getMatricola() + "\n"
                + "Media: " + media;
    }
}
