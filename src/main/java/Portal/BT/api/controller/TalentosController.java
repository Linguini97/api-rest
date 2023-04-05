package Portal.BT.api.controller;

import Portal.BT.api.endereço.DadosEndereco;
import Portal.BT.api.talentos.*;
import jakarta.validation.Valid;
import org.hibernate.validator.constraints.br.CPF;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity cadastrar(@RequestBody @Valid DadosCadastroTalentos dados){

        repository.save(new Talento(dados));
    }
    @GetMapping
    public ResponseEntity<List<DadosListagemTalentos>> listar(){

        var page = repository.findAll().stream().map(DadosListagemTalentos::new).toList();
        return ResponseEntity.ok(page);
    }
    @PutMapping
    @Transactional
    public  ResponseEntity atualizar(@RequestBody @Valid DadosAtualizacaoTalentos dados){
        var talento = repository.findByCPF(dados.CPF());
        if (talento != null){
            talento.atualizarInformacoes(dados);
            return ResponseEntity.ok(new DadosDetalhamentoTalento(talento));

        } else {
            throw new RuntimeException("Talento não encontrado");
        }
}
    @DeleteMapping("/{CPF}")
    @Transactional
    public ResponseEntity excluir(@PathVariable String CPF){
        repository.deleteByCPF(CPF);

        return ResponseEntity.noContent().build();
}
}
