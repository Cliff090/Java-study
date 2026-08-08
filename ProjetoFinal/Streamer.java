import java.util.Enumeration;

public class Streamer extends ContentCreator implements Patrocinado{
    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    private String plataforma;



    public void iniciarlive(){
        System.out.println("Ligue sua webcam e sua plataforma");
        System.out.println("Online");
    }

    public void encerrarlive(){
        System.out.println("desligando...");
        System.out.println("offline");
    }

    @Override
    public void receberpatrocionio() {

    }

    @Override
    public void cancelarpatrocionio() {

    }
}
