import static org.junit.Assert.assertEquals;
import org.junit.Test;
import java.util.List;

public class TestAgregarCarro {

    @Test
    public void testAgregarCarro() {
        CarroController controller = new CarroController();
        Carro carro = new Carro();

        controller.agregarCarro(carro);

        List<Carro> disponibles = controller.listarCarrosDisponibles();
        assertEquals(1, disponibles.size());
    }
}
