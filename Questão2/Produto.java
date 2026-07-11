package Questão2;

public class Produto {
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }


    private int quantidade;
    private double preçouni;

    public double getPreçouni() {
        return preçouni;
    }

    public void setPreçouni(double preçouni) {
        this.preçouni = preçouni;
    }


}
