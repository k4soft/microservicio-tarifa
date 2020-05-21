package co.com.k4soft.tarifa.entity;


import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Data
@Entity
@Table( name = "tarifa")
@NoArgsConstructor
public class TarifaEntity {

    @Id
    @Column(name="idTarifa")
    private Integer idTarifa;
    @Column(name="nombre")
    private String nombre;
    @Column(name="precio")
    private double precio;

}
