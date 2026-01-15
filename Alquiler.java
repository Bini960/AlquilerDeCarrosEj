public class Alquiler {

    private String nombreCliente;
    private int CUI;
    private String fecha;
    private float precio;
    private int diasDeRenta;

    public Alquiler(String nombreCliente, int CUI, String fecha, float precio, int diasDeRenta) {
        this.nombreCliente = nombreCliente;
        this.CUI = CUI;
        this.fecha = fecha;
        this.precio = precio;
        this.diasDeRenta = diasDeRenta;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public int getCUI() {
        return CUI;
    }

    public String getFecha() {
        return fecha;
    }

    public float getPrecio() {
        return precio;
    }

    public int getDiasDeRenta() {
        return diasDeRenta;
    }
}
