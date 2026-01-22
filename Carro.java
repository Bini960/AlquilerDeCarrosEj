public class Carro {

    private int id;
    private String marca;
    private String modelo;
    private int año;
    private double precioPorDia;
    private boolean disponible;

    public int getId() {
        System.out.println("getId()");
        return id;
    }

    public void setId(int id) {
        System.out.println("setId()");
        this.id = id;
    }

    public String getMarca() {
        System.out.println("getMarca()");
        return marca;
    }

    public void setMarca(String marca) {
        System.out.println("setMarca()");
        this.marca = marca;
    }

    public String getModelo() {
        System.out.println("getModelo()");
        return modelo;
    }

    public void setModelo(String modelo) {
        System.out.println("setModelo()");
        this.modelo = modelo;
    }

    public int getAño() {
        System.out.println("getAño()");
        return año;
    }

    public void setAño(int año) {
        System.out.println("setAño()");
        this.año = año;
    }

    public double getPrecioPorDia() {
        System.out.println("getPrecioPorDia()");
        return precioPorDia;
    }

    public void setPrecioPorDia(double precioPorDia) {
        System.out.println("setPrecioPorDia()");
        this.precioPorDia = precioPorDia;
    }

    public boolean isDisponible() {
        System.out.println("isDisponible()");
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        System.out.println("setDisponible()");
        this.disponible = disponible;
    }
}
