public class Lote {

    private int numeroLote;
    private String estado;
    private Carro carroEstacionado;

    public Lote() {
        System.out.println("Lote creado");
    }

    public void estacionarCarro(Carro c) {
        System.out.println("Carro estacionado en el lote");
    }

    public void liberarLote() {
        System.out.println("Lote liberado");
    }

    public boolean estaOcupado() {
        System.out.println("Verificando si el lote está ocupado");
        return false;
    }
}
