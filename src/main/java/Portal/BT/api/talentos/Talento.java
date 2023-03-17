package Portal.BT.api.talentos;

import Portal.BT.api.endereço.DadosEndereco;
import Portal.BT.api.formacao.DadosFormacao;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.*;
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
    private String CPF;
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
    }
}
