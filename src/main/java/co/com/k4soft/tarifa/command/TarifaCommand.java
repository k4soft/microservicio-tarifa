package co.com.k4soft.tarifa.command;


import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Data
@Component
@NoArgsConstructor
public class TarifaCommand {
    private Integer id;
    private String nombre;
    private double precio;

}
