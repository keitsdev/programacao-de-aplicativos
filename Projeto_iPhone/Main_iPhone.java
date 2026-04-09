public class Main_iPhone {
    public static void main(String[] args) {
        Aparelho a[] = {
            new ReprodutorMusical("iTunes", "SPECIALZ", "03:59"),
            new Telefone("iPhone", "(71) 99999-9999", "(81) 88888-8888"),
            new Navegador("Safari", "www.safari.com", "raças de cachorro")
        };

        for (Aparelho i : a){
            i.showDados();
        }
    }
}