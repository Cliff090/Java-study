public class Aviao extends Veiculos implements Motorizado{
    private int altitudemx;
    private int capacidade_passageiros;

    public int getAltitudemx() {
        return altitudemx;
    }

    public void setAltitudemx(int altitudemx) {
        this.altitudemx = altitudemx;
    }

    public int getCapacidade_passageiros() {
        return capacidade_passageiros;
    }

    public void setCapacidade_passageiros(int capacidade_passageiros) {
        this.capacidade_passageiros = capacidade_passageiros;
    }


    @Override
    public String toString() {
        return "Aviao{" +
                "altitudemx=" + altitudemx +
                ", capacidade_passageiros=" + capacidade_passageiros +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", cor='" + cor + '\'' +
                ", velocidade=" + velocidade +
                '}';
    }

    @Override
    public void ligar() {

    }

    @Override
    public void desligar() {

    }

    @Override
    public void acelerar() {

    }
}

