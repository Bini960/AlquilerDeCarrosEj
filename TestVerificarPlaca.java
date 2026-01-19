import org.junit.Test;
import static org.junit.Assert.*;

public class TestVerificarPlaca {

    @Test
    public void testPlacaCorrecta() {
        // Crea un carro con la placa "GUA-123"
        Carro carro = new Carro("Toyota", "Yaris", "GUA-123", 2020, "Hatchback", true);

        //consulta el dato
        String placaReal = carro.getPlaca();

        assertEquals("La placa no coincide", "GUA-123", placaReal);
    }
}