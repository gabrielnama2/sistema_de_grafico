package projetos.sistema_de_grafico.presenter;
import java.io.BufferedReader;
import java.io.FileReader;
import projetos.sistema_de_grafico.model.Pessoa;
import projetos.sistema_de_grafico.model.PessoaCollection;

public class LeituraArquivo {
    
    PessoaCollection pessoas;

    public LeituraArquivo(String nome_arquivo) {
        //LISTA PARA ARMAZENAR AS PESSOAS DO ARQUIVO
        pessoas = new PessoaCollection();
        
        //ABRE E LÊ O ARQUIVO
        try{
        FileReader fr = new FileReader(nome_arquivo);
        BufferedReader bf = new BufferedReader(fr);
        String linha = bf.readLine();
        
        //IMPRIME QUE ESTÁ SENDO LIDO DO ARQUIVO
        linha = bf.readLine();
            while(linha != null){
                String[] dados = linha.split(",");
                Pessoa pessoa = new Pessoa(dados[0], dados[1], dados[2]);
                
                //SALVA AS PESSOAS NA LISTA
                pessoas.incluir(pessoa);
                //System.out.println("\nPESSOA:\n" + "\nNome: " + pessoa.getNome() + "\nSexo: " + pessoa.getSexo()+ "\nEstado civil: " + pessoa.getEstado_civil());
                linha = bf.readLine();
                
            }
            
            //IMPRIME A LISTA DE PESSOAS
            //pessoas.listar();
        }
        
        catch(Exception e){
            e.printStackTrace();
            System.out.println("Erro no arquivo!"+System.getProperty("user.dir"));
        }
    }

    public PessoaCollection getPessoaCollection() {
        return pessoas;
    }
}
