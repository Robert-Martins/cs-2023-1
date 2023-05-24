public abstract class Produto {

    private String descricao;

    private double preco;

    private String nomeLoja;

    public Produto(String descricao, double preco, String nomeLoja) {
        this.descricao = descricao;
        this.preco = preco;
        this.nomeLoja = nomeLoja;
    }

    public String getDescricao() {
        return "Produto de informática";
    }

    public String getProdutoDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getNomeLoja() {
        return nomeLoja;
    }

    public void setNomeLoja(String nomeLoja) {
        this.nomeLoja = nomeLoja;
    }

}
