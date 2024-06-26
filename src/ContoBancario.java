
public class ContoBancario {

    /*
    * ES3: Simulatore di Banca
    *
    * Definisci una classe ContoBancario con metodi per depositare denaro,
    * prelevare denaro e ottenere il saldo. Assicurati di gestire il caso in cui si
    * tenta di prelevare più denaro di quanto disponibile con un'eccezione.
     */
    private int saldo = 0;

    public int getSaldo() {
        return saldo;
    }

    public void deposita(int deposito) {
        saldo += deposito;
        System.out.println("Complimenti, hai appena depositato sul tuo conto: " + deposito + " euro.");
    }

    public void preleva(int prelievo) throws IllegalArgumentException {
        if (prelievo > saldo || prelievo < 0) {
            throw new IllegalArgumentException("Non puoi prelevare zero euro , o un importo maggiore del tuo saldo!");
        }
        saldo -= prelievo;
        System.out.println("Complimenti, hai appena prelevato dal tuo conto: " + prelievo + " euro.");

    }

    public void saldo() {
        System.out.println("Il tuo saldo è " + getSaldo());
    }

}
