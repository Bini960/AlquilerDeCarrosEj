import java.util.List;

public class CarroView {

    public void mostrarCarros(List<Carro> carros) {
        System.out.println("mostrarCarros()");
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println("Mensaje: " + mensaje);
    }

    public Carro solicitarDatosCarro() {
        System.out.println("solicitarDatosCarro()");
        return new Carro();
    }

    public void solicitarDatosReserva() {
        System.out.println("solicitarDatosReserva()");
    }
}
