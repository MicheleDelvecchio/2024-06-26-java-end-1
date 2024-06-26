package Mattino;

import java.util.ArrayList;
import java.util.List;

public class ElencoTelefonico {

    /* ES4: Elenco Telefonico
    *
    * Implementa una classe Contatto che rappresenti un contatto telefonico con
    * nome e numero di telefono (stringa). Crea una classe ElencoTelefonico che
    * gestisca una lista di contatti. Includi metodi per aggiungere, rimuovere e
    * cercare contatti. Gestisci eventuali eccezioni relative all'inserimento di
    * numeri di telefono non validi.
    *
     */
    private List<Contatto> rubrica = new ArrayList<>();

    public List<Contatto> getRubrica() {
        return rubrica;
    }

    public void setRubrica(List<Contatto> rubrica) {
        this.rubrica = rubrica;
    }

    public void aggiungiContatto(Contatto nuovoContatto) {
        rubrica.add(nuovoContatto);
        System.out.println("Contatto aggiunto correttamente!");
    }

    public void rimuoviContatto(String name) {
        boolean contattoTrovato = false;

        for (int x = 0; x < rubrica.size(); x++) {
            if (rubrica.get(x).getName().equalsIgnoreCase(name)) {
                rubrica.remove(x);
                System.out.println("Contatto eliminato con successo!");
                contattoTrovato = true;
                break;
            }
        }

        if (!contattoTrovato) {
            System.out.println("Contatto non presente nella rubrica!");
        }
    }

    public void cercaContatto(String name) {
        for (int x = 0; x < rubrica.size(); x++) {
            if (rubrica.get(x).getName().equalsIgnoreCase(name)) {
                System.out.println("Ecco il contatto che hai cercato:" + "\n" + rubrica.get(x).toString());
            }
        }
    }

    public void rubricaDetails() {
        for (int y = 0; y < rubrica.size(); y++) {
            System.out.println(rubrica.get(y).toString());
        }
    }
}
