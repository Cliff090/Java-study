public class Influenciador extends ContentCreator implements Patrocinado{
    public String getNicho() {
        return nicho;
    }

    public void setNicho(String nicho) {
        this.nicho = nicho;
    }

    private String nicho;

    public void fazerparceria(){
        System.out.println("veja as empresas disponiveis....");
    }


    @Override
    public void receberpatrocionio() {

    }

    @Override
    public void cancelarpatrocionio() {

    }
}
