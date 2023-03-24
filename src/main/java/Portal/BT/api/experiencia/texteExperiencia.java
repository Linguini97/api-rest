package Portal.BT.api.experiencia;

public class texteExperiencia {
    public static void main(String[] args){
        for (possuiExperiencia valor : possuiExperiencia.values()){
            String text = valor.name();
            System.out.println(text);
        }
    }
}
