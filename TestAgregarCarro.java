import static org.junit.Assert.assertNotNull;
import org.junit.Test;

public class TestAgregarCarro {

    @Test
    public void testAgregarCarro() {

        AlquilerController controller = new AlquilerController();
        Carro carro = new Carro();

        controller.agregarCarro(carro);

        assertNotNull(carro);
    }
}
