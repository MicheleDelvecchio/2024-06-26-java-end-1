
public class Prenotazioni {

    private boolean[] postiTeatro = new boolean[15];

    public boolean[] getPostiTeatro() {
        return postiTeatro;
    }

    public void setPostiTeatro(boolean[] postiTeatro) {
        this.postiTeatro = postiTeatro;
    }

    public boolean controlloNumeroPosto(int seat) {
        return seat >= 0 && seat < postiTeatro.length;
    }

    public void isBooked(int seat) {
        if (controlloNumeroPosto(seat)) {
            if (postiTeatro[seat]) {
                System.out.println("Il posto " + seat + " è gia prenotato!");

            } else {
                System.out.println("Il posto " + seat + " non è ancora prenotato!");
            }
        } else {
            System.out.println("Numero posto non valido!");
        }
    }

    public void bookingSeat(int seat) throws IndexOutOfBoundsException {
        if (seat < 0 || seat >= postiTeatro.length) {
            throw new IndexOutOfBoundsException("Numero di posto non valido: " + seat);
        }
        if (!postiTeatro[seat]) {
            postiTeatro[seat] = true;
            System.out.println("Complimenti, hai appena prenotato il posto " + seat + "!");
        } else {
            System.out.println("Spiacenti, il posto " + seat + " è già prenotato.");
        }
    }

    public void deleteBooking(int seat) {
        if (controlloNumeroPosto(seat)) {
            if (postiTeatro[seat]) {
                postiTeatro[seat] = false;
                System.out.println("Posto " + seat + " cancellato correttamente!");
            } else {
                System.out.println("Non puoi eliminare un posto non prenotato!");
            }
        } else {
            System.out.println("Numero posto " + "(" + seat + ") non valido!");
        }
    }
}
