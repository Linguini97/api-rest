package Portal.BT.api.domain.talentos;

import Portal.BT.api.domain.endereço.DadosEndereco;
import Portal.BT.api.domain.experiencia.dadosExperiencia;
import Portal.BT.api.domain.formacao.DadosFormacao;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DadosDetalhamentoTalento(
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

        DadosEndereco endereço,


        DadosFormacao Formação,

        String Biografia,

        dadosExperiencia experiencia

) {
    public DadosDetalhamentoTalento(Talento talento){
        this(talento.getNome(),talento.getCPF(), talento.getEmail(), talento.getLinkedin(), talento.getCelular(), talento.getData_de_Nascimento(), talento.getGênero(), talento.getEndereço(),talento.getFormação(),talento.getBiografia(),talento.getExperiencia());
    }
}
