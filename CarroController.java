import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class CarroController implements InterfaceGestionCarro {

    private List<Carro> listaCarros = new ArrayList<>();
    private List<Reserva> listaReservas = new ArrayList<>();

    @Override
    public void agregarCarro(Carro carro) {
        listaCarros.add(carro);
    }

    @Override
    public List<Carro> listarCarrosDisponibles() {
        List<Carro> disponibles = new ArrayList<>();

        for (Carro carro : listaCarros) {
            if (carro.isDisponible()) {
                disponibles.add(carro);
            }
        }
        return disponibles;
    }

    public Carro buscarCarro(int id) {
        for (Carro carro : listaCarros) {
            if (carro.getId() == id) {
                return carro;
            }
        }
        return null;
    }

    public void agendarCarro(int idCarro, Cliente cliente,
                             LocalDate fechaInicio, LocalDate fechaFin) {
    }
}
