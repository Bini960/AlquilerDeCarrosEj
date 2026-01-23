import static org.junit.Assert.assertEquals;
import org.junit.Test;
import java.util.List;

public class TestListarCarrosDisponibles {

    @Test
    public void testListarCarrosDisponibles() {
        CarroController controller = new CarroController();

        Carro carroDisponible = new Carro();
        Carro carroNoDisponible = new Carro();
        carroNoDisponible.setDisponible(false);

        controller.agregarCarro(carroDisponible);
        controller.agregarCarro(carroNoDisponible);

        List<Carro> disponibles = controller.listarCarrosDisponibles();
        assertEquals(1, disponibles.size());
    }
}