public class VMain {
    public static void main(String[] args) {
        Veiculo1 v[] = {
            new Veiculo1("Generic"),
            new Carro1("BYD"),
            new Moto1("Suzuki")
        };
        for (Veiculo1 b : v){
            b.ligar();
        }
    }
}