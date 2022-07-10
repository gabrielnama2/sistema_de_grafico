package projetos.sistema_de_grafico.model;

public class Pessoa {
    private String sexo;
    private String nome;
    private String estado_civil;

    public Pessoa(String sexo, String nome, String estado_civil) {
        this.sexo = sexo;
        this.nome = nome;
        this.estado_civil = estado_civil;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "sexo=" + sexo + ", nome=" + nome + ", estado_civil=" + estado_civil + '}';
    }
    
    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEstado_civil() {
        return estado_civil;
    }

    public void setEstado_civil(String estado_civil) {
        this.estado_civil = estado_civil;
    }
}
