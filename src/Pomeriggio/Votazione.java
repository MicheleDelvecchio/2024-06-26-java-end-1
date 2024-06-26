package Pomeriggio;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Votazione {

    private Map<String, Integer> candidati = new HashMap<>();
    private Set<String> elettoriVotanti = new HashSet<>();

    public void aggiungiCandidato(Candidato candidato) {
        if (!candidati.containsKey(candidato.getName())) {
            candidati.put(candidato.getName(), 0);
            System.out.println(candidato.getName() + " aggiunto alla lista di candidati!");
        }
    }

    public void voto(Elettore elettore, Candidato candidato) throws Exception {
        if (elettoriVotanti.contains(elettore.getName())) {
            throw new Exception("L'elettore " + elettore.getName() + " ha già votato!");
        } else if (!candidati.containsKey(candidato.getName())) {
            throw new Exception("Il candidato " + candidato.getName() + " non esiste!");
        }

        candidati.put(candidato.getName(), candidati.get(candidato.getName()) + 1);
        elettoriVotanti.add(elettore.getName());
        System.out.println(elettore.getName() + " ha votato per " + candidato.getName());
    }

    public void mostraRisultati() {
        for (Map.Entry<String, Integer> entry : candidati.entrySet()) {
            System.out.println("Candidato " + entry.getKey() + ": " + entry.getValue() + " voti");
        }
    }
}
