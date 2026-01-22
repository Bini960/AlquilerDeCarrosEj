public class Main {

    public static void main(String[] args) {
        System.out.println("Sistema de Alquiler de Carros iniciado");

        CarroController controller = new CarroController();
        CarroView view = new CarroView();

        view.mostrarMensaje("Bienvenido al sistema");
    }
}
