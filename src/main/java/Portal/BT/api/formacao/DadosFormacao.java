package Portal.BT.api.formacao;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class DadosFormacao {
    private String Curso;
    private String Instituição;
    private Situacao Situação;
    private String Ano_de_Formação;

    public DadosFormacao(Formacao dados) {
        this.Curso = dados.Curso();
        this.Instituição = dados.Instituição();
        this.Situação = dados.Situação();
        this.Ano_de_Formação = dados.Ano_de_Formação();
    }
}
