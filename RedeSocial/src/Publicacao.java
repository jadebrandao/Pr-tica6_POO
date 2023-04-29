public class Publicacao {

    private String dataPublicacao;
    private String textoPublicado;
    private String linkMidia;

    public Publicacao(String dataPublicacao, String textoPublicado, String linkMidia) {
        this.dataPublicacao = dataPublicacao;
        this.textoPublicado = textoPublicado;
        this.linkMidia = linkMidia;
    }

    public String getDataPublicacao() {
        return dataPublicacao;
    }

    public String getTextoPublicado() {
        return textoPublicado;
    }

    public String getLinkMidia() {
        return linkMidia;
    }

    public static double getContadorPublicacao() {
        return contadorPublicacao;
    }

    public void setTextoPublicado(String textoPublicado) {
        this.textoPublicado = textoPublicado;
    }

    public void setLinkMidia(String linkMidia) {
        this.linkMidia = linkMidia;
    }

    public static  double  contadorPublicacao;
}
