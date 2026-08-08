public class Carro extends Veiculos implements Motorizado{
    private String placa;
    private int portas;

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getPortas() {
        return portas;
    }

    public void setPortas(int portas) {
        this.portas = portas;
    }

    public void abrirPortaMalas() {
        System.out.println("Porta-malas aberto.");
    }


    @Override
    public String toString() {
        return "Carro{" +
                "placa='" + placa + '\'' +
                ", portas=" + portas +
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
    public  void desligar() {

    }

    @Override
    public void acelerar() {

    }
}

