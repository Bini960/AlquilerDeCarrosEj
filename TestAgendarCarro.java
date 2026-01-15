public class TestAgendarCarro {

    public void testCambioDeDisponibilidad() {
        //Crea un carro disponible
        Carro carro = new Carro("Mazda", "3", "P-999", 2023, "Sedan", true);

        //Ejecutar la acción 
        carro.agendarCarro();

        //Verificar que la disponibilidad ahora sea false
        assert carro.getDisponibilidad() == false;
    }
}