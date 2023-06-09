package Portal.BT.api.domain.talentos;

import Portal.BT.api.domain.endereço.DadosEndereco;
import Portal.BT.api.domain.formacao.DadosFormacao;

public record DadosListagemTalentos(Long id, String nome, String email, String linkedin, String celular, DadosEndereco endereço, DadosFormacao Formação) {

    public DadosListagemTalentos(Talento talento){
        this(talento.getId(),talento.getNome(), talento.getEmail(), talento.getLinkedin(), talento.getCelular(),talento.getEndereço(), talento.getFormação());
    }
}
