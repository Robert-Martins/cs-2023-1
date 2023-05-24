import java.util.ArrayList;
import java.util.List;

public class ProdutoTeste {

    public static void main(String args[]){
        List<Produto> carrinho = new ArrayList<>() {{
            add(new Mouse("Mouse ótico, Saída USB. 1.600 dpi", 100.00, "Gamehouse", "Gamer"));
            add(new Livro("Harry Potter", 200.00, "Abacadabra", "JK Rowling"));
            add(new Mouse("Mouse, Saída USB. 2.000 dpi", 30.00, "Microsoft", "Pessoal"));
            add(new Livro("O Pequeno Princípe", 120.00, "Abacadabra", "Saint-Exupéry"));
        }};
        carrinho.forEach(produto -> System.out.println(produto.getDescricao()));
    }

}
