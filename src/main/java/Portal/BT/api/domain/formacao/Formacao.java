package Portal.BT.api.domain.formacao;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record Formacao(
        @NotBlank
        String Curso,
        @NotBlank
        String Instituição,
        @NotNull
        Situacao Situação,
        @NotBlank
        String Ano_de_Formação
)
{
}
