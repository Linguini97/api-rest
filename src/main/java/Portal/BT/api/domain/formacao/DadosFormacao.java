package Portal.BT.api.domain.formacao;

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

    public void atualizarInformacoes(Formacao dados) {
        if(dados.Curso() != null){
            this.Curso = dados.Curso();
        }
        if(dados.Instituição() != null){
            this.Instituição = dados.Instituição();
        }
        if(dados.Situação() != null){
            this.Situação = dados.Situação();
        }
        if(dados.Ano_de_Formação() != null){
            this.Ano_de_Formação = dados.Ano_de_Formação();
        }
    }
}
