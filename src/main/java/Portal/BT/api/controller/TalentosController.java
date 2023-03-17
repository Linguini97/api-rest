package Portal.BT.api.controller;

import Portal.BT.api.endereço.DadosEndereco;
import Portal.BT.api.talentos.DadosCadastroTalentos;
import Portal.BT.api.talentos.Talento;
import Portal.BT.api.talentos.TalentoRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("talentos")
public class TalentosController {

    @Autowired
    private TalentoRepository repository;
    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody @Valid DadosCadastroTalentos dados){

        repository.save(new Talento(dados));
    }
}
