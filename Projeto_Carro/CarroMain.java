public class CarroMain {
    public static void main(String[] args) {

        Carro car = new Carro("BYD", 0, 250);

        System.out.println(car.getVelAtual());
        car.acelerar(60);
        car.acelerar(80);
        System.out.println(car.getVelAtual());

        car.frear(50);
    }
}
