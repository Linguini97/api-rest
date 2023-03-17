package Portal.BT.api.endereço;

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
}
