import org.junit.Test;
import static org.junit.Assert.*;

public class TestAgregarCarro {

    @Test 
    public void testAgregarCarro() {
        LugarAlquiler lugar = new LugarAlquiler("RentCar");
        // constructor
        Carro carro = new Carro("Toyota", "Yaris", "P123", 2022, "Sedan", true);

        lugar.agregarCarro(carro);

        assertEquals("La lista debería tener 1 carro", 1, lugar.getInventario().size());
    }
}