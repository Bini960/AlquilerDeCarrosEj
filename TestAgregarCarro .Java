public class TestAgregarCarro {

    public void testAgregarCarro() {
        LugarAlquiler lugar = new LugarAlquiler("RentCar");
        Carro carro = new Carro("Toyota", "Yaris", "P123", 2022, "Sedan");

        lugar.agregarCarro(carro);

        assert lugar.getInventario().size() == 1;
    }
}

