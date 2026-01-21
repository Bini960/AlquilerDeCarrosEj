import static org.junit.Assert.assertNull;
import org.junit.Test;

public class TestVerificarPlaca {

    @Test
    public void testVerificarPlaca() {

        Carro carro = new Carro();

        String placa = carro.getPlaca();

        assertNull(placa);
    }
}
