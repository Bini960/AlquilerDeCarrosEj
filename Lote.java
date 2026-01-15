public class Lote {

    private boolean disponibilidad;
    private String estado;

    public Lote(boolean disponibilidad, String estado) {
        this.disponibilidad = disponibilidad;
        this.estado = estado;
    }

    public boolean isDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
