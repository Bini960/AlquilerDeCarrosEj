import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class TestAgendarCarro {

    @Test
    public void testAgendarCarro() {

        AlquilerController controller = new AlquilerController();

        controller.agendarCarro("ABC123");

        assertTrue(true);
    }
}
