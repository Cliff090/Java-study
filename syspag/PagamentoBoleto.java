public class PagamentoBoleto extends Pagamento {
    private String codigoBarras;
    private String datavencimento;


    public String getCodigoBarras() {
        return codigoBarras;
    }

    public void setCodigoBarras(String codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    public String getDatavencimento() {
        return datavencimento;
    }

    public void setDatavencimento(String datavencimento) {
        this.datavencimento = datavencimento;
    }

    @Override
    public double calcularTaxa() {
        return getValor()* 0.02;
    }

    @Override
    public void processarPagamento() {

    }
}
