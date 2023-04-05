package Portal.BT.api.talentos;

import Portal.BT.api.endereço.DadosEndereco;
import Portal.BT.api.endereço.DadosEndereço;
import Portal.BT.api.experiencia.dadosExperiencia;
import Portal.BT.api.experiencia.recordExperiencia;
import Portal.BT.api.formacao.DadosFormacao;
import Portal.BT.api.formacao.Formacao;
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
