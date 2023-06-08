public class TestaAgenda {

    public static void main(String args[]) throws Exception {
        Agenda agenda = new Agenda();
        agenda.listaContatos();
        Contato contato = new Contato("Robert", "robert@robert");
        Contato contato1 = new Contato("Gilmar", "gilmar@gilmar");
        agenda.adicionaContato(contato);
        agenda.listaContatos();
        agenda.adicionaContato(contato1);
        agenda.listaContatos();
        agenda.buscaContato("Robert");
        agenda.removeContato("Gilmar");
        agenda.listaContatos();
    }

}
