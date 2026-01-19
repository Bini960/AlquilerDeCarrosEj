import org.junit.Test;
import static org.junit.Assert.*;

public class TestAgendarCarro {

    @Test
    public void testCambioDeDisponibilidad() {

        // Constructor
        Carro carro = new Carro("Mazda", "3", "P-999", 2023, "Sedan", true);

        // Ejecuta el método que cambia el estado
        carro.agendarCarro();

        // Verificación
        assertFalse("El carro debería estar ocupado ahora", carro.getDisponibilidad());
    }
}