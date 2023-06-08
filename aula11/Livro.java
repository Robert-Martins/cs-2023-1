public class Livro extends Produto {

    private String autor;

    public Livro(String descricao, double preco, String nomeLoja, String autor) {
        super(descricao, preco, nomeLoja);
        this.autor = autor;
    }

    public String getDescricao() {
        return this.autor + " " + this.getProdutoDescricao();
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
}
