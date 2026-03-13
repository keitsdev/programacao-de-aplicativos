public class MainV {
    public static void main(String[] args) {
        CarroV car1 = new CarroV("BYD", 2025, 4);
        MotoV mot1 = new MotoV("Honda", 2024, 500);

        car1.exibirInfos();
        mot1.exibirInfos();
    }
}