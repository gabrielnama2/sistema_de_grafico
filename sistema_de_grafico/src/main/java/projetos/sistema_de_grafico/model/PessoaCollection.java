package projetos.sistema_de_grafico.model;
import java.util.ArrayList;
import java.util.List;

public class PessoaCollection {
    //private List<Pessoa> pessoas;
    public ArrayList<Pessoa> pessoas;
    public PessoaCollection() {
        this.setPessoas(new ArrayList<Pessoa>());
    }
    public void incluir(Pessoa pessoa){
        pessoas.add(pessoa);
        //System.out.println("\nCOLLECTION: \n" + this.pessoas);
    }

    //public void setPessoas(List<Pessoa> pessoas) {
    public void setPessoas(ArrayList<Pessoa> pessoas) {
        this.pessoas = pessoas;
    }
    
    //TESTAR ESSES MÉTODOS
    public void listar() {
        for (Pessoa pessoa : pessoas) {
            System.out.println(pessoas.toString());
        }
    }
    
    public void imprimir(){
        for(int i = 0; i < pessoas.size(); i++) {
            System.out.println(pessoas.toString());
        }
    }

    public List<Pessoa> getPessoas() {
        return pessoas;
    }
}
