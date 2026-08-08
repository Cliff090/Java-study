public class Fotografo extends ContentCreator implements Transmitivel {
    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    private String especialidade;


    public void publicarfotos(){
        System.out.println("faça upload de suas fotos ");
        System.out.println("upload completo");

    }
}
