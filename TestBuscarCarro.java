import static org.junit.Assert.assertNotNull;
import org.junit.Test;
import java.util.List;

public class TestBuscarCarro {

    @Test
    public void testBuscarCarro() {
        CarroController controller = new CarroController();
        Carro carro = new Carro();
        carro.setId(1);

        controller.agregarCarro(carro);

        Carro encontrado = controller.buscarCarro(1);
        assertNotNull(encontrado);
    }
}