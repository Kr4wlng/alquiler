package com.codigo.alquiler.domain.aggregates.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class VehiculosDTO {
    private Long idVehiculo;
    private String codigo;
    private String placa;
    private Integer asientos;
    private Integer anioFabricacion;
    private String color;
    private String transmision;
    private TipoVehiculoDTO tipoVehiculoDTO;
    private MarcasDTO marcasDTO;
    private Double costoAlquiler;
    private Boolean estado;
}
