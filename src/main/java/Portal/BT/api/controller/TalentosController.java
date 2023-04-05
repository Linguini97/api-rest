package Portal.BT.api.controller;

import Portal.BT.api.domain.talentos.*;
import Portal.BT.api.domain.talentos.*;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;

@RestController
@RequestMapping("talentos")
public class TalentosController {

    @Autowired
    private TalentoRepository repository;
    @PostMapping
    @Transactional
    public ResponseEntity cadastrar(@RequestBody @Valid DadosCadastroTalentos dados, UriComponentsBuilder uriBuilder){

        var talento = new Talento(dados);
        repository.save(talento);
        var uri = uriBuilder.path("/talentos/{CPF}").buildAndExpand(talento.getCPF()).toUri();
        return ResponseEntity.created(uri).body(new DadosDetalhamentoTalento(talento));
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
    @GetMapping("/{CPF}")
    public ResponseEntity detalhar(@PathVariable String CPF){
        Talento  talento = repository.findByCPF(CPF);
        if (talento != null) {
            return ResponseEntity.ok(new DadosDetalhamentoTalento((talento)));
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    @PutMapping("/{CPF}")
    @Transactional
    public ResponseEntity<DadosDetalhamentoTalento> atualizarDetalhado(@PathVariable String CPF, @RequestBody @Valid DadosAtualizacaoTalentos dadosAtualizacaoTalentos){
        Talento talento = repository.findByCPF(CPF);
            if (talento != null){
                talento.atualizarInformacoes(dadosAtualizacaoTalentos);
                Talento talentoAtualizado = repository.save(talento);
                return ResponseEntity.ok(new DadosDetalhamentoTalento(talentoAtualizado));
            } else {
                return ResponseEntity.notFound().build();
            }
    }
}
