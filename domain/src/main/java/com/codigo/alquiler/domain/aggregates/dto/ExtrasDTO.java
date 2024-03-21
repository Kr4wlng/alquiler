package com.codigo.alquiler.domain.aggregates.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;

@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ExtrasDTO {
    private Long idExtras;
    private String codigo;
    private String descripcion;
    private Double costo;
    private Boolean estado;
}
