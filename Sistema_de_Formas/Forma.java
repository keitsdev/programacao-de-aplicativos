class Forma {
    private double area;

    void calcularArea(){
        System.out.println("O valor da área é: " + this.area);
    }

    void calcularArea(double lado){
        System.out.println("O valor da área é: " + (lado^2));
    }

    void calcularArea(double base, double altura){
        System.out.println("O valor da área é: " + (base*altura));
    }
}