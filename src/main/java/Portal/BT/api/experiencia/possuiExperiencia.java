package Portal.BT.api.experiencia;
import Portal.BT.api.experiencia.possuiExperiencia;

public enum possuiExperiencia {
    Sim("Tem experiência"),
    Não("Não tem experiência");

    private String text;
    private possuiExperiencia(String text){
        this.text = text;
    }
    public String getText(){
        return  text;
    }
}
