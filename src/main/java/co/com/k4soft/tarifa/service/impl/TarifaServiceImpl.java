package co.com.k4soft.tarifa.service.impl;


import co.com.k4soft.tarifa.command.TarifaCommand;
import co.com.k4soft.tarifa.entity.TarifaEntity;
import co.com.k4soft.tarifa.fabrica.TipoTarifaFabrica;
import co.com.k4soft.tarifa.repository.TarifaRepository;
import co.com.k4soft.tarifa.service.TarifaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class TarifaServiceImpl implements TarifaService {

    @Autowired
    private TarifaRepository tarifaRepository;

    @Autowired
    private TipoTarifaFabrica tipoTarifaFabrica;



    @Override
    public List<TarifaCommand> findAll() {
        return tipoTarifaFabrica.entityToCommand(tarifaRepository.findAll());
    }

    @Override
    public TarifaCommand findById(int idTarifa) {
        return tipoTarifaFabrica.entityToCommand(tarifaRepository.findById(idTarifa).orElse(null));
    }
}
