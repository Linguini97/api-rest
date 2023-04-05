package Portal.BT.api.domain.talentos;

import Portal.BT.api.domain.endereço.DadosEndereço;
import Portal.BT.api.domain.experiencia.recordExperiencia;
import Portal.BT.api.domain.formacao.Formacao;
import jakarta.validation.constraints.NotNull;

public record DadosAtualizacaoTalentos(
        @NotNull
        String CPF,
        String linkedin,
        String celular,
        DadosEndereço endereço,
        Formacao Formação,
        String Biografia,
        recordExperiencia experiencia
)
{
}
