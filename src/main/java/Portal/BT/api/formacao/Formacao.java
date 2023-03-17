package Portal.BT.api.formacao;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

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
