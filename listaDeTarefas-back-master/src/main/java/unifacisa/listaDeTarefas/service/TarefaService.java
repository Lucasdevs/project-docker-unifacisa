package unifacisa.listaDeTarefas.service;

import unifacisa.listaDeTarefas.controller.dto.mapper.TarefaMapper;
import unifacisa.listaDeTarefas.controller.dto.request.TarefaRequest;
import unifacisa.listaDeTarefas.domain.Tarefa;
import unifacisa.listaDeTarefas.repository.TarefaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TarefaService {

    @Autowired
    private TarefaMapper mapper;

    @Autowired
    private TarefaRepository repository;

    public TarefaService(TarefaRepository repository) {
        this.repository = repository;
    }

    public List<Tarefa> listarTodas() {
        return repository.findAll();
    }

    public Optional<Tarefa> buscarPorId(Long id) {
        return repository.findById(id);
    }

    public Tarefa salvar(Long id, TarefaRequest tarefa) {
        Optional<Tarefa> tarefaExistente = repository.findById(id);
        if (tarefaExistente.isPresent()) {
            Tarefa tarefaAtualizada = tarefaExistente.get();
            tarefaAtualizada.setDescricao(tarefa.descricao());
            tarefaAtualizada.setConcluida(tarefa.concluida());
            return repository.save(tarefaAtualizada);
        }
        return mapper.toTarefa(tarefa);
    }

    public Tarefa criar(TarefaRequest tarefa) {
        return repository.save(mapper.toTarefa(tarefa));
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}

