public class Mouse extends Produto {

    private String tipo;

    public Mouse(String descricao, double preco, String nomeLoja, String tipo) {
        super(descricao, preco, nomeLoja);
        this.tipo = tipo;
    }

    public String getDescricao() {
        return this.tipo + " " + this.getProdutoDescricao();
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
