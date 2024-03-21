package com.codigo.alquiler.domain.aggregates.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;

@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AuditoriaDTO {
    private Long idAuditoria;
    private UsuariosDTO usuariosDTO;
    private Timestamp fraAuditoria;
    private String entidad;
    private IncidenciasDTO incidenciasDTO;
}
