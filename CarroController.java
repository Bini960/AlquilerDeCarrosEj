import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class CarroController implements InterfaceGestionCarro {

    private List<Carro> listaCarros = new ArrayList<>();
    private List<Reserva> listaReservas = new ArrayList<>();

    @Override
    public void agregarCarro(Carro carro) {
        System.out.println("agregarCarro()");
        listaCarros.add(carro);
    }

    @Override
    public List<Carro> listarCarrosDisponibles() {
        System.out.println("listarCarrosDisponibles()");
        return listaCarros;
    }

    public void agendarCarro(int idCarro, Cliente cliente,
                             LocalDate fechaInicio, LocalDate fechaFin) {
        System.out.println("agendarCarro()");
    }

    public Carro buscarCarro(int id) {
        System.out.println("buscarCarro()");
        return null;
    }
}
