import java.util.ArrayList;
import java.util.List;

public class LugarAlquiler implements Interface {

    private List<Carro> inventario;
    private String nombre;

    public LugarAlquiler(String nombre) {
        this.nombre = nombre;
        this.inventario = new ArrayList<>();
    }

    @Override
    public boolean iniciar() {
        return true;
    }

    @Override
    public void agregarCarro() {
        // lógica futura
    }

    @Override
    public void agendarCarro() {
        // lógica futura
    }

    public void agregarCarro(Carro carro) {
        inventario.add(carro);
    }

    public List<Carro> getInventario() {
        return this.inventario;
    }
}
