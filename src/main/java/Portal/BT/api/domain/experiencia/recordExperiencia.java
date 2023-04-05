package Portal.BT.api.domain.experiencia;
import jakarta.validation.constraints.NotBlank;
public record recordExperiencia(
        @NotBlank
        Boolean possui_Experiencia,
        String empresa,
        String cargo,
        String descricao,
        String data_Entrada,
        Boolean ativo,
        String data_Saida
) {

}
