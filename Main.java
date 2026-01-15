public class Main {

    public static void main(String[] args) {

        Carro carro = new Carro(
                "Toyota",
                "Corolla",
                "P-123ABC",
                2022,
                "Sedan",
                true
        );

        LugarAlquiler lugar = new LugarAlquiler("RentCar UVG");
        lugar.agregarCarro(carro);

        System.out.println("Sistema iniciado correctamente");
    }
}
