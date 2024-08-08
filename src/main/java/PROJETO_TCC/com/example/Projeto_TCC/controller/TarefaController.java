package PROJETO_TCC.com.example.Projeto_TCC.controller;

import PROJETO_TCC.com.example.Projeto_TCC.entity.Tarefa;
import PROJETO_TCC.com.example.Projeto_TCC.service.TarefaService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/tarefas")
public class TarefaController {
    private TarefaService tarefaService;

    public TarefaController(TarefaService tarefaService) {
        this.tarefaService = tarefaService;
    }

    List<Tarefa> criarTarefa(Tarefa tarefa) {
        return tarefaService.criarTarefa(tarefa);
    }

    List<Tarefa> listarTarefa() {
    return tarefaService.listarTarefa();
    }

    List<Tarefa> editarTarefa(Tarefa tarefa) {
        return tarefaService.editarTarefa(tarefa);

    }

    List<Tarefa> excluirTarefa(Long id) {
    return tarefaService.excluirTarefa(id);
    }
}
