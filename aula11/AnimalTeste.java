import java.util.ArrayList;
import java.util.List;

public class AnimalTeste {

    public static void main(String args[]){
        List<Animal> animals = new ArrayList<>() {{
            add(new Cachorro("Pocoyo", 12));
            add(new Cavalo("Pocoyo", 12));
            add(new Preguica("Pocoyo", 12));
        }};
        animals.forEach(Animal::emitirSom);
        Veterinario veterinario = new Veterinario();
        animals.forEach(veterinario::examinar);
        Zoologico zoologico = new Zoologico();
        zoologico.enjauldadosEmitirSom();
    }

}
