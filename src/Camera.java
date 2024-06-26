
public class Camera {

    private String numeroCamera;

    public Camera(String numeroCamera) {
        setNumeroCamera(numeroCamera);
    }

    public String getNumeroCamera() {
        return numeroCamera;
    }

    public void setNumeroCamera(String numeroCamera) {
        this.numeroCamera = numeroCamera;
    }

    @Override
    public String toString() {
        return "Numero " + getNumeroCamera();
    }

}
