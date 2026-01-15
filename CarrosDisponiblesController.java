import java.util.ArrayList;

public class CarrosDisponiblesController {

    private Carro carro;

    public CarrosDisponiblesController(Carro carro) {
        this.carro = carro;
    }

    public ArrayList<Carro> getCarrosDisponibles() {
        ArrayList<Carro> disponibles = new ArrayList<>();

        if (carro.getDisponibilidad()) {
            disponibles.add(carro);
        }

        return disponibles;
    }
}
