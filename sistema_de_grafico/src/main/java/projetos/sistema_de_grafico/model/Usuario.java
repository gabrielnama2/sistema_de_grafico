package projetos.sistema_de_grafico.model;

public class Usuario {
    private String login;
    private String senha;
    public Usuario(String login, String senha){
        this.login = login;
        this.senha = senha;
    }
    public String getLogin(){
        return this.login;
    }
    public String getSenha(){
        return this.senha;
    }
}
