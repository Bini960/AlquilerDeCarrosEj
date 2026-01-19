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
    public void agregarCarro(Carro carro) {
        if (carro == null || carro.getPlaca() == null) {
            return;
        }
        for (Carro existente : inventario) {
            if (carro.getPlaca().equals(existente.getPlaca())) {
                return;
            }
        }
        inventario.add(carro);
    }

    @Override
    public void agendarCarro(String placa) {
        if (placa == null) {
            return;
        }
        for (Carro existente : inventario) {
            if (placa.equals(existente.getPlaca())) {
                existente.setDisponibilidad(false);
                return;
            }
        }
    }

    public List<Carro> getInventario() {
        return this.inventario;
    }
}
