package exemplo01;

public class Carro {
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    private String marca;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    private String modelo;

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    private String cor;

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    private String placa;
    private int velocidade;

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    private int ano;

         public void setVelocidade(int velocidade){
             this.velocidade= velocidade;
         }
         public int getVelocidade(){
             return velocidade;
         }

         public void ligar() {
                 System.out.println("ligado.");
         }
         public void desligar(){
                 System.out.println("desligado.");
         }
         public void acelerar(){
                 System.out.println("acelerando.");
         }
         public void frear(){
                 System.out.println("freando.") ;
         }
}
