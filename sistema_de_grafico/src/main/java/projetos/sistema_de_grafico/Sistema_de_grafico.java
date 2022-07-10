package projetos.sistema_de_grafico;
import projetos.sistema_de_grafico.model.Pessoa;
import projetos.sistema_de_grafico.model.PessoaCollection;
import projetos.sistema_de_grafico.presenter.LeituraArquivo;

public class Sistema_de_grafico {

    public static void main(String[] args) {
        LeituraArquivo leitura_arquivo = new LeituraArquivo("pessoas.csv");
    }
}
