package co.com.k4soft.tarifa.controller;

import co.com.k4soft.tarifa.command.TarifaCommand;
import co.com.k4soft.tarifa.service.TarifaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/tipo-tarifa")
public class TarifaController {

    @Autowired
    private TarifaService tarifaService;


    @GetMapping("/v1/listado-tarifas")
    public List<TarifaCommand> findAll() {
        return tarifaService.findAll();
    }

    @GetMapping("/v1/{id}/tarifa")
    private TarifaCommand findById(@PathVariable  int id){
        return tarifaService.findById(id);
    }

}
