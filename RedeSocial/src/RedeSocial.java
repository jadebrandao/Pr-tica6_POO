import java.util.ArrayList;
public class RedeSocial {
    ArrayList<Publicacao> publicacoes = new ArrayList<> ();


    private String nomeUsuario;
    private String DataCriacao;
    private String senha;

    public RedeSocial(ArrayList<Publicacao> publicacoes, String dataCriacao, String nomeUsuario, String dataCriacao1, String senha) {
        this.publicacoes = publicacoes;
        this.nomeUsuario = nomeUsuario;
        DataCriacao = dataCriacao1;
        this.senha = senha;
    }

    void inserePublicacao(Publicacao publi) {

    }
    void imprimePublicacoes(){

    }

    void getContadorPublicacao() {

    }
}

