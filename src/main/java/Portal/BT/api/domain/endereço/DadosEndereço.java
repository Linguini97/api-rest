package Portal.BT.api.domain.endereço;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DadosEndereço(
        @NotNull
        String Cep,
        @NotBlank
        String Cidade,
        @NotNull
        Estados Estado,
        @NotBlank
        String País
) {
}
