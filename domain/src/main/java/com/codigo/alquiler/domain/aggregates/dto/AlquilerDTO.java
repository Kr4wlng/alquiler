package com.codigo.alquiler.domain.aggregates.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;

@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AlquilerDTO {
    private Long idAlquiler;
    private String nroAlquiler;
    private UsuariosDTO usuariosDTO;
    private VehiculosDTO vehiculosDTO;
    private Timestamp fraInicio;
    private Timestamp fraFin;
    private String lugarRecojo;
    private String latitudRecojo;
    private String longitudRecojo;
}
