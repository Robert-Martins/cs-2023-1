import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Agenda {

    List<Contato> contatos = new ArrayList<>();

    public List<Contato> getContatos() {
        return contatos;
    }

    public void setContatos(List<Contato> contatos) {
        this.contatos = contatos;
    }

    public void adicionaContato(Contato novoContato){
        List<Contato> contatos = this.getContatos();
        contatos.add(novoContato);
        this.setContatos(contatos);
        System.out.println("Contato adicionado");
    }

    public Contato buscaContato(String chave) throws Exception {
        Contato contato = this.getContatos().stream()
                .filter(cnt -> this.verificaChave(cnt, chave))
                .findFirst()
                .orElseThrow(() -> new Exception("Contato não encontrado"));
        this.printaContato(contato);
        return contato;
    }

    public void removeContato(String chave){
        try {
            Contato remove = this.buscaContato(chave);
            List<Contato> contatos = this.getContatos();
            contatos.remove(remove);
            System.out.println("Contato removido");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Contato não encontrado");
        }
    }

    public void listaContatos(){
        this.getContatos().forEach(this::printaContato);
    }

    private void printaContato(Contato contato){
        System.out.println("Nome: " + contato.nome + ", Email: " + contato.email + "\n");
    }

    private boolean verificaChave(Contato contato, String chave){
        return contato.nome.equalsIgnoreCase(chave) || contato.email.equalsIgnoreCase(chave);
    }

}
