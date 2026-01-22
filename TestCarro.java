import static org.junit.Assert.assertNotNull;
import org.junit.Test;

public class TestCarro {

    @Test
    public void testCrearCarro() {
        Carro carro = new Carro();
        assertNotNull(carro);
    }
}
