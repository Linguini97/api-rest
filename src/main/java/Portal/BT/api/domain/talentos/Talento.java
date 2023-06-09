package Portal.BT.api.domain.talentos;

import Portal.BT.api.domain.endereço.DadosEndereco;
import Portal.BT.api.domain.formacao.DadosFormacao;
import Portal.BT.api.domain.experiencia.dadosExperiencia;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "Talentos")
@Entity(name = "Talento")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Talento {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nome;
    private @NotNull String CPF;
    private String email;
    private String celular;
    private String Data_de_Nascimento;
    @Enumerated(EnumType.STRING)
    private Gênero Gênero;
    @Embedded
    private DadosEndereco endereço;
    @Embedded
    private DadosFormacao Formação;
    private String Biografia;

    private dadosExperiencia experiencia;

    private String linkedin;

    public Talento(DadosCadastroTalentos dados) {
        this.nome = dados.nome();
        this.CPF = dados.CPF();
        this.email = dados.email();
        this.celular = dados.celular();
        this.Data_de_Nascimento = dados.Data_de_Nascimento();
        this.Gênero = dados.Gênero();
        this.endereço = new DadosEndereco(dados.endereço());
        this.Formação = new DadosFormacao(dados.Formação());
        this.Biografia = dados.Biografia();
        this.experiencia = new dadosExperiencia(dados.experiencia());
        this.linkedin = dados.linkedin();
    }

    public void atualizarInformacoes(DadosAtualizacaoTalentos dados) {
        if(dados.linkedin() != null){
            this.linkedin = dados.linkedin();
        }
        if(dados.celular() != null){
            this.celular = dados.celular();
        }
        if(dados.endereço() != null){
            this.endereço.atualizarInformacoes(dados.endereço());
        }
        if(dados.Formação() != null){
            this.Formação.atualizarInformacoes(dados.Formação());
        }
        if(dados.Biografia() != null){
            this.Biografia = dados.Biografia();
        }
        if(dados.experiencia() != null){
            this.experiencia.atualizarInformacoes(dados.experiencia());
        }
    }
}
