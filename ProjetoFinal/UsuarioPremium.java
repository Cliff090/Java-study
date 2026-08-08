import java.util.Date;

public class UsuarioPremium extends CommonUser implements Monetizacao{
    private Date iniciodopremium;

    public Date getIniciodopremium() {
        return iniciodopremium;
    }

    public void setIniciodopremium(Date iniciodopremium) {
        this.iniciodopremium = iniciodopremium;
    }

    public Date getFimdopremium() {
        return fimdopremium;
    }

    public void setFimdopremium(Date fimdopremium) {
        this.fimdopremium = fimdopremium;
    }

    public boolean isPremium() {
        return premium;
    }

    public void setPremium(boolean premium) {
        this.premium = premium;
    }

    private Date fimdopremium;
    private boolean premium;


    public void ativarpremium(Date iniciodopremium) {
        boolean premium = false;
        while (this.iniciodopremium != fimdopremium) {
            if (this.iniciodopremium != fimdopremium) break;
            premium = true;
        }
    }
        public void cancelarpremium(){
        if (premium){
            System.out.println("deseja mesmo cancelar premium?");
        } else {
            System.out.println("você não possui premium ainda.");
        }

        }

        }

