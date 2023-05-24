import java.util.ArrayList;
import java.util.List;

public class Zoologico {

    private static final List<Animal> enjaulados = new ArrayList<>() {{
        add(new Cachorro("Pocoyo", 12));
        add(new Cavalo("Pocoyo", 12));
        add(new Cavalo("Pocoyo", 12));
        add(new Preguica("Pocoyo", 12));
        add(new Cachorro("Pocoyo", 12));
        add(new Cavalo("Pocoyo", 12));
        add(new Preguica("Pocoyo", 12));
        add(new Cavalo("Pocoyo", 12));
        add(new Preguica("Pocoyo", 12));
        add(new Cachorro("Pocoyo", 12));
    }};

    public void enjauldadosEmitirSom() {
        this.enjaulados.forEach(Animal::emitirSom);
    }

}
