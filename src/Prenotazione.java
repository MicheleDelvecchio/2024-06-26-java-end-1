
public class Prenotazione {

    private Cliente cliente;
    private Camera camera;

    public Prenotazione(Camera camera, Cliente cliente) {
        setCamera(camera);
        setCliente(cliente);
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Camera getCamera() {
        return camera;
    }

    public void setCamera(Camera camera) {
        this.camera = camera;
    }

    @Override
    public String toString() {
        return "Camera numero: " + camera.getNumeroCamera();
    }

}
