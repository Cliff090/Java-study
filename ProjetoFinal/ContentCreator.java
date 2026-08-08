public class ContentCreator extends Usuario implements Transmitivel{
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getSeguidores() {
        return seguidores;
    }

    public void setSeguidores(int seguidores) {
        this.seguidores = seguidores;
    }

    private String descricao;
    private int seguidores;


    public void criarconteudo(){
        System.out.println("Ligue a camera e esta na hora de começar");


    }
    public void gerenciarconteudo(){
        System.out.println("Veja seus conteudos salvos ");
    }


    @Override
    public void visualizarperfis() {
        super.visualizarperfis();
    }

    @Override
    public void iniciarlive() {

    }

    @Override
    public void desligarlive() {

    }
}
