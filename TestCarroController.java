import static org.junit.Assert.assertNotNull;
import org.junit.Test;

public class TestCarroController {

    @Test
    public void testCrearCarroController() {
        CarroController controller = new CarroController();
        assertNotNull(controller);
    }
}
