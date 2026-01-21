public class Carro {

    private String marca;
    private String modelo;
    private String placa;
    private int anio;
    private String tipoDeCarro;
    private boolean disponibilidad;

    public Carro() {
        System.out.println("Carro creado");
    }

    public String getPlaca() {
        System.out.println("Obteniendo placa");
        return placa;
    }

    public boolean isDisponible() {
        System.out.println("Verificando disponibilidad");
        return disponibilidad;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
        System.out.println("Disponibilidad actualizada");
    }
}
