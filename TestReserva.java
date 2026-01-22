import static org.junit.Assert.assertNotNull;
import org.junit.Test;

public class TestReserva {

    @Test
    public void testCrearReserva() {
        Reserva reserva = new Reserva();
        assertNotNull(reserva);
    }
}
