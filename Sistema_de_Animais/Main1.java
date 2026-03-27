public class Main1 {
    public static void main(String[] args) {
        Animal2 a[] = {
            new Animal2("Pai", 4),
            new Cachorro2("Floquinho", 3),
            new Gato2("Patrício", 7)
        };
        for (Animal2 i : a){
            i.emitirSom();
        }
    }
}
