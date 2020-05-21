package co.com.k4soft.tarifa.fabrica;



import co.com.k4soft.tarifa.command.TarifaCommand;
import co.com.k4soft.tarifa.entity.TarifaEntity;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class TipoTarifaFabrica {


    public List<TarifaCommand> entityToCommand(List<TarifaEntity> listaTatifaEntity) {
        List<TarifaCommand> listaTarifaCommand = new ArrayList<>();
        listaTatifaEntity.forEach(e -> listaTarifaCommand.add(entityToCommand(e)));
        return listaTarifaCommand;
    }

    public TarifaCommand entityToCommand(TarifaEntity tarifaEntity) {
        TarifaCommand tarifaCommand = new TarifaCommand();
        tarifaCommand.setId(tarifaEntity.getIdTarifa());
        tarifaCommand.setNombre(tarifaEntity.getNombre());
        tarifaCommand.setPrecio(tarifaEntity.getPrecio());
        return tarifaCommand;
    }
}
