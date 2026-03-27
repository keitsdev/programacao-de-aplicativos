<<<<<<< HEAD
public class VMain {
    public static void main(String[] args) {
        Veiculo1 v[] = {
            Veiculo1(),
            Carro1("BYD"),
            Moto1("Suzuki")
        };
        for (Veiculo1 b : s){
            b.ligar();
        }
    }
}
=======
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
>>>>>>> 04c0746a7db3472e85dbfbeaa48b97510c609fc4