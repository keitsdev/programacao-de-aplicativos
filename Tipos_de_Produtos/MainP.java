public class MainP {
    public static void main(String[] args){
        Eletronico el1 = new Eletronico("Celular", 990.85f, "1 ano");
        Alimento al1 = new Alimento("Arroz", 35.90f, "13/09/2026");

        el1.mostrarProd();
        al1.mostrarProd();
    }
}