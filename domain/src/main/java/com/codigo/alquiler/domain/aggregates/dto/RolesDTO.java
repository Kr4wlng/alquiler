package com.codigo.alquiler.domain.aggregates.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RolesDTO {
    private Long idRol;
    private String codigo;
    private String descripcion;
    private Boolean estado;
}
