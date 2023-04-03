package Portal.BT.api.controller;

import Portal.BT.api.endereço.DadosEndereco;
import Portal.BT.api.talentos.*;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    @GetMapping
    public List<DadosListagemTalentos> listar(){

        return repository.findAll().stream().map(DadosListagemTalentos::new).toList();
    }
@PutMapping
@Transactional
    public  void atualizar(@RequestBody @Valid DadosAtualizacaoTalentos dados){
        var talento = repository.findByCPF(dados.CPF());
        if (talento != null){
            talento.atualizarInformacoes(dados);
        } else {
            throw new RuntimeException("Talento não encontrado");
        }
}
}
