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

    private possuiExperiencia possuiExperiencia;
    private String empresa;
    private String cargo;
    private String descricao;
    private String dataEntrada;
    private Boolean ativo;
    private String dataSaida;

    public void setAtivo(Boolean ativo){
        this.ativo = ativo;
        if(!ativo){
            this.dataSaida = null;
        }
    }
    public Boolean getAtivo(){
        return ativo;
    }
    public void setDataSaida(String dataSaida){
        if (!Objects.equals(dataSaida,"")){
            this.dataSaida = dataSaida;
        }
    }
    public String getDataSaida(){
        return dataSaida;
    }
}
