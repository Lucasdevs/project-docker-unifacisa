package unifacisa.listaDeTarefas.controller.dto.mapper;

import unifacisa.listaDeTarefas.controller.dto.request.TarefaRequest;
import unifacisa.listaDeTarefas.domain.Tarefa;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TarefaMapper {
    Tarefa toTarefa(TarefaRequest request);
}
