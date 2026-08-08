import java.util.Date;

public class EmpresaVerificada extends Empresa{
    private Date datadeverificacao;

    private void selarVerificacao(){
        System.out.println("verificação feita!");
    }

    public Date getDatadeverificacao() {
        return datadeverificacao;
    }

    public void setDatadeverificacao(Date datadeverificacao) {
        this.datadeverificacao = datadeverificacao;
    }
}
