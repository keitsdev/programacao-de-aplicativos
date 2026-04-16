class VendedorLegal implements Bonus {
    public void calcularBonus(double salario){
        System.out.println("Bônus do vendedor: " + (salario * 0.2));
    }
}