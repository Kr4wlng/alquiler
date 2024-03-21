package com.codigo.alquiler.domain.aggregates.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CalificacionDTO {
    private Long idCalificacion;
    private UsuariosDTO usuariosDTO;
    private VehiculosDTO vehiculosDTO;
    private Integer puntaje;
    private String comentario;
    private Boolean estado;
}
