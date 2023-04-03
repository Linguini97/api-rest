package Portal.BT.api.experiencia;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Objects;


@Embeddable
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class dadosExperiencia {

    private Boolean possui_Experiencia;
    private String empresa;
    private String cargo;
    private String descricao;
    private String data_Entrada;
    private Boolean ativo;
    private String data_Saida;


    public void setAtivo(Boolean ativo){
        this.ativo = ativo;
        if(!ativo){
            this.data_Saida = null;
        }
    }
    public Boolean getAtivo(){
        return ativo;
    }
    public void setDataSaida(String data_Saida){
        if (!Objects.equals(data_Saida,"")){
            this.data_Saida = data_Saida;
        }
    }
    public String getDataSaida(){
        return data_Saida;
    }

    public boolean isHabilitado() {
        if (!possui_Experiencia) {
            empresa = null;
            cargo = null;
            descricao = null;
            data_Entrada = null;
            ativo = null;
            data_Saida = null;
            return false;
        } else {
            empresa = "";
            cargo = "";
            descricao = "";
            data_Entrada = "";
            ativo = false;
            return true;
        }
    }
    public dadosExperiencia(recordExperiencia dados) {
        this.possui_Experiencia = dados.possui_Experiencia();
        this.empresa = dados.empresa();
        this.cargo = dados.cargo();
        this.descricao = dados.descricao();
        this.data_Entrada = dados.data_Entrada();
        this.ativo = dados.ativo();
        this.data_Saida = dados.data_Saida();
    }

    public void atualizarInformacoes(recordExperiencia dados) {
        if(dados.possui_Experiencia() != null){
            this.possui_Experiencia = dados.possui_Experiencia();
        }
        if(dados.empresa() != null){
            this.empresa = dados.empresa();
        }
        if(dados.cargo() != null){
            this.cargo = dados.cargo();
        }
        if(dados.descricao() != null){
            this.descricao = dados.descricao();
        }
        if(dados.data_Entrada() != null){
            this.data_Entrada = dados.data_Entrada();
        }
        if(dados.ativo() != null){
            this.ativo = dados.ativo();
        }
        if(dados.data_Saida() != null){
            this.data_Saida = dados.data_Saida();
        }
    }
}
