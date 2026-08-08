public class PagamentoPix extends Pagamento {
    public String getChavepix() {
        return chavepix;
    }

    public void setChavepix(String chavepix) {
        this.chavepix = chavepix;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    private String chavepix;
    private String banco;


    @Override
    public double calcularTaxa() {
        return getValor()*0.02;
    }

    @Override
    public void processarPagamento() {

    }
}
