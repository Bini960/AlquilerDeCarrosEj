public class Alquiler {

    private String nombreCliente;
    private int CUI;
    private String fecha;
    private float precio;
    private int diasDeRenta;
    private Carro carroRentado;

    public Alquiler() {
        System.out.println("Alquiler creado");
    }

    public String getDetalles() {
        System.out.println("Mostrando detalles del alquiler");
        return "Detalles del alquiler";
    }

    public Carro getCarroRentado() {
        System.out.println("Obteniendo carro rentado");
        return carroRentado;
    }
}
