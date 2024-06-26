package Mattino;

public class App {

    public static void main(String[] args) throws Exception {
        // teatroTest();
        // studenteTest();
        // contoTest();
        rubricaTest();
    }

    public static void teatroTest() {

        Prenotazioni prn = new Prenotazioni();

        try {
            prn.bookingSeat(2);
            prn.bookingSeat(1);
            prn.bookingSeat(0);
            prn.deleteBooking(2);
            prn.isBooked(2);
            prn.deleteBooking(5);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Errore: " + e.getMessage());
        }

    }

    public static void studenteTest() {
        Studente s1 = new Studente("Michele", "053fwq13");
        Studente s2 = new Studente("Mario", "fdg4234");

        try {
            s1.aggiugniVoto(6.5);
            s1.aggiugniVoto(4.5);
            s1.aggiugniVoto(8.5);

            s2.aggiugniVoto(12.32);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            s1.calcoloMedia();
            s2.calcoloMedia();
        } catch (ArithmeticException a) {
            System.out.println(a.getMessage());
        }

        System.out.println(s1.toString());
        System.out.println(s2.toString());
    }

    public static void contoTest() {
        ContoBancario utente1 = new ContoBancario();

        try {
            utente1.deposita(214);
            utente1.deposita(21);
            utente1.deposita(1002);
            utente1.saldo();
            utente1.preleva(241);
            utente1.saldo();
        } catch (IllegalArgumentException i) {
            System.out.println(i.getMessage());
        }

    }

    public static void rubricaTest() {

        ElencoTelefonico et = new ElencoTelefonico();
        try {
            Contatto c1 = new Contatto("Manuel", "324323413243");
            et.aggiungiContatto(c1);
            Contatto c2 = new Contatto("Mamma", "32321342342");
            et.aggiungiContatto(c2);
            Contatto c3 = new Contatto("Giuseppe", "32054924231");
            et.aggiungiContatto(c3);
            et.rubricaDetails();
            et.cercaContatto("manuel");
            et.rimuoviContatto("manuel");
            et.rubricaDetails();
            Contatto c4 = new Contatto("Sbagliato", "4324");
            et.rubricaDetails();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

/**
 * TODO:
 *
 * ES0: Creare un repository su GitHub con il seguente nome:
 * 2024-06-26-java-end-1
 *
 * Caricare tutti gli esercizi in un unico progetto sulla stessa repo
 *
 *
 * ES1: Sistema di Prenotazioni
 *
 * Crea una classe Prenotazione che possa essere utilizzata da un teatro per
 * tenere traccia delle prenotazioni dei posti. Utilizza un array di booleani
 * per rappresentare i posti: true se il posto è prenotato, false altrimenti.
 * Implementa metodi per prenotare un posto, annullare la prenotazione e
 * verificare se un o piu' posti sono disponibili.
 *
 * ---------------------------------------------------------------------------
 *
 * ES2: Registro Studenti
 *
 * Crea una classe Studente con attributi come nome, matricola, e voti (usa un
 * ArrayList). Aggiungi metodi per aggiungere voti, calcolare la media dei voti,
 * e stampare i dettagli dello studente. Implementa la gestione delle eccezioni
 * per evitare errori nell'inserimento dei voti.
 *
 * ---------------------------------------------------------------------------
 *
 * ES3: Simulatore di Banca
 *
 * Definisci una classe ContoBancario con metodi per depositare denaro,
 * prelevare denaro e ottenere il saldo. Assicurati di gestire il caso in cui si
 * tenta di prelevare più denaro di quanto disponibile con un'eccezione.
 *
 * ---------------------------------------------------------------------------
 *
 * ES4: Elenco Telefonico
 *
 * Implementa una classe Contatto che rappresenti un contatto telefonico con
 * nome e numero di telefono (stringa). Crea una classe ElencoTelefonico che
 * gestisca una lista di contatti. Includi metodi per aggiungere, rimuovere e
 * cercare contatti. Gestisci eventuali eccezioni relative all'inserimento di
 * numeri di telefono non validi.
 *
 */
