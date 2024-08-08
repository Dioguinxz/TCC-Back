package PROJETO_TCC.com.example.Projeto_TCC.service;

import PROJETO_TCC.com.example.Projeto_TCC.entity.Tarefa;
import PROJETO_TCC.com.example.Projeto_TCC.repository.TarefaRepository;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TarefaService {
    private TarefaRepository tarefaRepository;

    public TarefaService(TarefaRepository tarefaRepository) {
        this.tarefaRepository = tarefaRepository;
    }

    public List<Tarefa> criarTarefa(Tarefa tarefa) {
        tarefaRepository.save(tarefa);
        return listarTarefa();
    }

    public List<Tarefa> listarTarefa() {
        Sort sort = Sort.by("nome").ascending();
        return tarefaRepository.findAll(sort);
    }

    public List<Tarefa> editarTarefa(Tarefa tarefa) {
        tarefaRepository.save(tarefa);
        return listarTarefa();
    }

    public List<Tarefa> excluirTarefa(Long id) {
        tarefaRepository.deleteById(id);
        return listarTarefa();
    }

}
