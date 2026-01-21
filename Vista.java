public class Vista implements Interface {

    @Override
    public boolean Iniciar() {
        System.out.println("Vista iniciada");
        return true;
    }

    @Override
    public void agregarCarro() {
        System.out.println("Agregar carro desde la vista");
    }

    @Override
    public void agendarCarro() {
        System.out.println("Agendar carro desde la vista");
    }
}
