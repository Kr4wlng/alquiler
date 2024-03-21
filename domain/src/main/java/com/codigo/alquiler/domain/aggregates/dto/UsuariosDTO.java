package com.codigo.alquiler.domain.aggregates.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UsuariosDTO {
    private Long idUsuario;
    private String usuario;
    private String password;
    private String nombres;
    private String apellidos;
    private TipoDocumentoDTO tipoDocumentoDTO;
    private String nroDocumento;
    private String direccion;
    private String telefono;
    private String correo;
    private RolesDTO rolesDTO;
    private Boolean estado;

}
