package co.com.k4soft.tarifa.service;


import co.com.k4soft.tarifa.command.TarifaCommand;

import java.util.List;

public interface TarifaService {

    List<TarifaCommand> findAll();

    TarifaCommand findById(int idTarifa);
}
