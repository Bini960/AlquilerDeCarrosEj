import java.util.ArrayList;
import java.util.List;

public class AlquilerController {

    private String nombreEmpresa;
    private List<Carro> inventario;
    private List<Alquiler> historialAlquileres;
    private Vista vista;

    public AlquilerController() {
        inventario = new ArrayList<>();
        historialAlquileres = new ArrayList<>();
        System.out.println("AlquilerController creado");
    }

    public boolean Iniciar() {
        System.out.println("Sistema iniciado");
        return true;
    }

    public void agregarCarro(Carro c) {
        System.out.println("Carro agregado");
    }

    public void agendarCarro(String placa) {
        System.out.println("Carro agendado con placa: " + placa);
    }

    public void mostrarDisponibles() {
        System.out.println("Mostrando carros disponibles");
    }
}
