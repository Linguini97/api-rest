package Portal.BT.api.domain.endereço;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class DadosEndereco {
    private String Cep;
    private String Cidade;
    private Estados Estado;
    private String País;

    public DadosEndereco(DadosEndereço dados) {
        this.Cep = dados.Cep();
        this.Cidade = dados.Cidade();
        this.Estado = dados.Estado();
        this.País = dados.País();
    }

    public void atualizarInformacoes(DadosEndereço dados) {
        if(dados.Cep() != null){
            this.Cep = dados.Cep();
        }
        if(dados.Cidade() != null){
            this.Cidade = dados.Cidade();
        }
        if(dados.Estado() != null){
            this.Estado = dados.Estado();
        }
        if(dados.País() != null){
            this.País = dados.País();
        }
    }
}
