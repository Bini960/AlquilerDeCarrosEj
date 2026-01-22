import java.time.LocalDate;

public class Reserva {

    private int id;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private Carro carro;
    private Cliente cliente;

    public int getId() {
        System.out.println("getId()");
        return id;
    }

    public void setId(int id) {
        System.out.println("setId()");
        this.id = id;
    }

    public LocalDate getFechaInicio() {
        System.out.println("getFechaInicio()");
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        System.out.println("setFechaInicio()");
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() {
        System.out.println("getFechaFin()");
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        System.out.println("setFechaFin()");
        this.fechaFin = fechaFin;
    }

    public Carro getCarro() {
        System.out.println("getCarro()");
        return carro;
    }

    public void setCarro(Carro carro) {
        System.out.println("setCarro()");
        this.carro = carro;
    }

    public Cliente getCliente() {
        System.out.println("getCliente()");
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        System.out.println("setCliente()");
        this.cliente = cliente;
    }

    public int calcularDias() {
        System.out.println("calcularDias()");
        return 0;
    }

    public double calcularTotal() {
        System.out.println("calcularTotal()");
        return 0.0;
    }
}
