public class Cliente {

    private int id;
    private String nombre;
    private String dpi;
    private String telefono;

    public int getId() {
        System.out.println("getId()");
        return id;
    }

    public void setId(int id) {
        System.out.println("setId()");
        this.id = id;
    }

    public String getNombre() {
        System.out.println("getNombre()");
        return nombre;
    }

    public void setNombre(String nombre) {
        System.out.println("setNombre()");
        this.nombre = nombre;
    }

    public String getDpi() {
        System.out.println("getDpi()");
        return dpi;
    }

    public void setDpi(String dpi) {
        System.out.println("setDpi()");
        this.dpi = dpi;
    }

    public String getTelefono() {
        System.out.println("getTelefono()");
        return telefono;
    }

    public void setTelefono(String telefono) {
        System.out.println("setTelefono()");
        this.telefono = telefono;
    }
}
