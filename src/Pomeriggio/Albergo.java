package Pomeriggio;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Albergo {

    private List<Camera> roomsAv = new ArrayList<>();
    private Map<Cliente, Prenotazione> prenotazioni = new HashMap<>();

    public void aggiungiCamera(Camera camera) {
        roomsAv.add(camera);
    }

    public void booking(Cliente cliente, Camera camera) throws Exception {
        if (!roomsAv.contains(camera)) {
            throw new Exception("La camera " + camera.getNumeroCamera() + " non è disponibile o non esiste");
        }

        Prenotazione prenotazione = new Prenotazione(camera, cliente);
        prenotazioni.put(cliente, prenotazione);
        roomsAv.remove(camera);

        System.out.println("Prenotazione effettuata correttamente");
    }

    public void removeBooking(Cliente cliente) throws Exception {
        Prenotazione prenotazione = prenotazioni.remove(cliente);
        if (prenotazione == null) {
            throw new Exception("Non puoi rimuovere una prenotazione non esistente!");
        }

        roomsAv.add(prenotazione.getCamera());

        System.out.println("Cancellazione effettuata correttamente!");
    }

    public void modifyBooking(Cliente cliente, Camera nuovaCamera) throws Exception {
        Prenotazione prenotazione = prenotazioni.get(cliente);
        if (prenotazione == null) {
            throw new Exception("Non puoi modificare una prenotazione non esistente!");
        }

        Camera cameraVecchia = prenotazione.getCamera();
        roomsAv.add(cameraVecchia);

        prenotazione.setCamera(nuovaCamera);
        prenotazioni.put(cliente, prenotazione);
        roomsAv.remove(nuovaCamera);

        System.out.println("Prenotazione modificata correttamente!");
    }

    public void mostraPrenotazioni() {
        for (Map.Entry<Cliente, Prenotazione> entry : prenotazioni.entrySet()) {
            Cliente cliente = entry.getKey();
            Prenotazione prenotazione = entry.getValue();
            System.out.println("Cliente: " + cliente + ", Prenotazione: " + prenotazione);
        }
    }

}
