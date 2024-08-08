package PROJETO_TCC.com.example.Projeto_TCC.controller;

import PROJETO_TCC.com.example.Projeto_TCC.entity.Tarefa;
import PROJETO_TCC.com.example.Projeto_TCC.service.TarefaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tarefas")
public class TarefaController {
    private TarefaService tarefaService;

    public TarefaController(TarefaService tarefaService) {
        this.tarefaService = tarefaService;
    }

    @PostMapping
    List<Tarefa> criarTarefa(@RequestBody Tarefa tarefa) {
        return tarefaService.criarTarefa(tarefa);
    }

    @GetMapping
    List<Tarefa> listarTarefa() {
    return tarefaService.listarTarefa();
    }

    @PutMapping
    List<Tarefa> editarTarefa(@RequestBody Tarefa tarefa) {
        return tarefaService.editarTarefa(tarefa);

    }

    @DeleteMapping("{id}")
    List<Tarefa> excluirTarefa(@PathVariable("id") Long id) {
    return tarefaService.excluirTarefa(id);
    }
}
