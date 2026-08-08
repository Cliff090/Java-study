public class Empresa extends Usuario{
    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getRazaosocial() {
        return razaosocial;
    }

    public void setRazaosocial(String razaosocial) {
        this.razaosocial = razaosocial;
    }

    protected String cnpj;
    protected String razaosocial;

    public void exibirinformacoes(){
        System.out.println(getCnpj());
        System.out.println(getRazaosocial());
    }

}
