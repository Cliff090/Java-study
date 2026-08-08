public class Bicicleta extends Veiculos {
    private int marchas;

    public int getMarchas() {
        return marchas;
    }

    public void setMarchas(int marchas) {
        this.marchas = marchas;
    }

    public String getFreio() {
        return freio;
    }

    public void setFreio(String freio) {
        this.freio = freio;
    }

    public boolean isPossuiCesta() {
        return possuiCesta;
    }


    private String freio;

    public void setPossuiCesta(boolean possuiCesta) {
        this.possuiCesta = possuiCesta;
    }

    private boolean possuiCesta;

    public void possuicesta(){
        if (!possuiCesta) {System.out.print("não possui cesta");} else {System.out.print("possui cesta");}
    }

    @Override
    public String toString() {
        return "Bicicleta{" +
                "marchas=" + marchas +
                ", freio='" + freio + '\'' +
                ", possuiCesta=" + possuiCesta +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", cor='" + cor + '\'' +
                ", velocidade=" + velocidade +
                '}';
    }



    @Override
    public void acelerar() {

    }
}

