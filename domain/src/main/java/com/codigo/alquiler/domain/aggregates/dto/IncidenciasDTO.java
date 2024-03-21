package com.codigo.alquiler.domain.aggregates.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class IncidenciasDTO {
    private Long idIncidencia;
    private String codigo;
    private String descripcion;
    private Boolean estado;
}
