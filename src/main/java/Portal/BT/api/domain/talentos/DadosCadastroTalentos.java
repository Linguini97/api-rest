package Portal.BT.api.domain.talentos;

import Portal.BT.api.domain.endereço.DadosEndereço;
import Portal.BT.api.domain.experiencia.recordExperiencia;
import Portal.BT.api.domain.formacao.Formacao;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DadosCadastroTalentos(

        @NotBlank
        String nome,
        @NotNull
        String CPF,
        @NotBlank
        @Email
        String email,
        String linkedin,

        String celular,

        String Data_de_Nascimento,

        Gênero Gênero,

        DadosEndereço endereço,


        Formacao Formação,

        String Biografia,

        recordExperiencia experiencia

) {
}
