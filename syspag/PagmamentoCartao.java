public class PagmamentoCartao extends Pagamento {
    public String getNumerocartao() {
        return numerocartao;
    }

    public void setNumerocartao(String numerocartao) {
        this.numerocartao = numerocartao;
    }

    public int getParcelas() {
        return parcelas;
    }

    public void setParcelas(int parcelas) {
        this.parcelas = parcelas;
    }

    private String numerocartao;
  private int parcelas;


    @Override
    public double calcularTaxa() {
        return 0;
    }

    @Override
    public void processarPagamento() {

    }

    public void processarpagamento(){

    }
    public void emitircomprovante(){

    }
}
