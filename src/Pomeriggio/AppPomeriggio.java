package Pomeriggio;

public class AppPomeriggio {

    /**
     * ---------------------------------------------------------------------------
     * ES5: Sistema di Votazione
     *
     * Crea classi per Candidato e Elettore, dove ogni Elettore può votare per
     * un Candidato. Implementa un meccanismo usando mappe per tenere traccia
     * dei voti ricevuti da ogni candidato. Assicurati di gestire le eccezioni
     * per casi come doppi voti o voti a candidati non esistenti.
     *
     * *
     * ---------------------------------------------------------------------------
     *
     * ES6: Sistema di Prenotazione Hotel
     *
     * Definisci classi per Camera, Cliente, e Prenotazione. Utilizza una mappa
     * per associare clienti a prenotazioni e una lista di camere disponibili.
     * Implementa metodi per effettuare, modificare e cancellare prenotazioni,
     * assicurandoti di gestire eccezioni come camere non disponibili o
     * cancellazioni tardive.
     *
     * ---------------------------------------------------------------------------
     *
     * ES7: Impiegato e Manager
     *
     * Crea una classe Impiegato con attributi come nome, salario e metodi per
     * aumentaSalario(int percentuale). Deriva da questa una classe Manager che
     * aggiunge l'attributo bonus. Il metodo aumentaSalario del manager dovrebbe
     * considerare anche il bonus nell'aumento. Mostra come puoi utilizzare il
     * polimorfismo per gestire diversi tipi di impiegati in un array di tipo
     * Impiegato.
     *
     * ---------------------------------------------------------------------------
     *
     * ES8: Sistema di Prenotazione Alberghiera
     *
     * Progetta una classe astratta CameraAlbergo con metodi come calcolaCosto()
     * e numeroLetti(). Deriva da questa diverse classi specifiche come
     * CameraSingola, CameraDoppia e Suite. Implementa calcolaCosto in modo
     * diverso per ogni tipo di camera. Utilizza una collezione per gestire
     * tutte le camere disponibili in un albergo.
     *
     * ---------------------------------------------------------------------------
     */
    public static void main(String[] args) {
        // votoTest();
        // albergoTest();
        jobsTest();
    }

    public static void votoTest() {
        Votazione votazione = new Votazione();

        Candidato c1 = new Candidato("Renzi");
        Candidato c2 = new Candidato("Salvini");
        Candidato c3 = new Candidato("Vannacci");
        Candidato c4 = new Candidato("Meloni");
        Candidato c5 = new Candidato("Berlusconi");

        votazione.aggiungiCandidato(c1);
        votazione.aggiungiCandidato(c2);
        votazione.aggiungiCandidato(c3);
        votazione.aggiungiCandidato(c4);
        votazione.aggiungiCandidato(c5);

        Elettore e1 = new Elettore("Michele");
        Elettore e2 = new Elettore("Paolo");
        Elettore e3 = new Elettore("Luca");
        Elettore e4 = new Elettore("Silvio");

        try {
            votazione.voto(e1, c1);
            votazione.voto(e2, c2);
            votazione.voto(e3, c5);
            votazione.voto(e4, c5);
            votazione.voto(e2, c5); // HA GIA VOTATO
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        votazione.mostraRisultati();
    }

    public static void albergoTest() {
        Albergo hotel = new Albergo();

        Camera camera1 = new Camera("101");
        Camera camera2 = new Camera("102");
        Camera camera3 = new Camera("103");
        Camera camera4 = new Camera("104");
        Camera camera5 = new Camera("105");
        Camera camera6 = new Camera("106");

        hotel.aggiungiCamera(camera1);
        hotel.aggiungiCamera(camera2);
        hotel.aggiungiCamera(camera3);
        hotel.aggiungiCamera(camera4);
        hotel.aggiungiCamera(camera5);

        Cliente cliente1 = new Cliente("Mario");
        Cliente cliente2 = new Cliente("Luigi");
        Cliente cliente3 = new Cliente("Giovanni");
        Cliente cliente4 = new Cliente("Roberto");
        Cliente cliente5 = new Cliente("Carla");

        try {
            hotel.booking(cliente1, camera1);
            hotel.booking(cliente2, camera2);
            hotel.booking(cliente3, camera3);
            hotel.booking(cliente4, camera4);
            hotel.booking(cliente5, camera5);

            hotel.mostraPrenotazioni();
            hotel.removeBooking(cliente1); // RIMUOVO   
            hotel.mostraPrenotazioni();
            hotel.aggiungiCamera(camera6); // AGGIUNGO UNA NUOVA CAMERA
            hotel.modifyBooking(cliente5, camera6); // MODIFICO LA CAMERA DEL CLIENTE 5
            hotel.mostraPrenotazioni();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public static void jobsTest() {
        Impiegato imp1 = new Impiegato("Mario Rossi", 3000);
        Manager man1 = new Manager("Luigi Verdi", 4000, 500);

        Impiegato[] dipendenti = {imp1, man1};

        for (Impiegato imp : dipendenti) {
            imp.aumentaSalario(10);
        }

        for (Impiegato imp : dipendenti) {
            System.out.println("Nome: " + imp.getName() + ", Salario: " + imp.getSalario());
        }
    }
}
