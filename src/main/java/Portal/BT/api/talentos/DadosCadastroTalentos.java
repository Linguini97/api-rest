package Portal.BT.api.talentos;

import Portal.BT.api.endereço.DadosEndereço;
import Portal.BT.api.formacao.Formacao;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public record DadosCadastroTalentos(

        @NotBlank
        String nome,
        @NotBlank
        String CPF,
        @NotBlank
        @Email
        String email,
        @NotBlank
        String celular,
        @NotBlank
        String Data_de_Nascimento,
        @NotNull
        Gênero Gênero,
        @NotNull
        @Valid
        DadosEndereço endereço,
        @NotNull
        @Valid
        Formacao Formação,
        @NotBlank
        String Biografia
) {
}
