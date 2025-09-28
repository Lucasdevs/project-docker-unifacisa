package unifacisa.listaDeTarefas.repository;

import unifacisa.listaDeTarefas.domain.Tarefa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TarefaRepository extends JpaRepository<Tarefa, Long> {
}
