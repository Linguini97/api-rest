package Portal.BT.api.talentos;

import Portal.BT.api.endereço.DadosEndereço;
import Portal.BT.api.experiencia.recordExperiencia;
import Portal.BT.api.formacao.Formacao;
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
