class GerenteLegal implements Bonus {
    public void calcularBonus(double salario){
        System.out.println("Bônus do gerente: " + (salario * 0.3));
    }
}