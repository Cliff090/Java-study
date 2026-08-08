public abstract class Pagamento {
    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    protected double valor;
    protected String data;
    protected String status;

    public abstract double calcularTaxa();{
        double v = valor * 0.02;
        setValor(v);

    }

    public abstract void processarPagamento();{
    }

    public static void emitirComprovante() {
    }
}