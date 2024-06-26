
public class Contatto {

    /* ES4: Elenco Telefonico
 *
 * Implementa una classe Contatto che rappresenti un contatto telefonico con
 * nome e numero di telefono (stringa). Crea una classe ElencoTelefonico che
 * gestisca una lista di contatti. Includi metodi per aggiungere, rimuovere e
 * cercare contatti. Gestisci eventuali eccezioni relative all'inserimento di
 * numeri di telefono non validi.
 *
     */
    private String name;
    private String telefono;

    public Contatto(String name, String telefono) {
        setName(name);
        try {
            setTelefono(telefono);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) throws Exception {
        if (telefono.length() < 10 || telefono.length() > 16) {
            throw new Exception("Il numero deve essere compreso tra 10 e 16 caratteri.");
        }
        this.telefono = telefono;
    }

    public String toString() {
        return "Nome: " + getName() + "\n"
                + "Telefono: " + getTelefono();
    }

}
