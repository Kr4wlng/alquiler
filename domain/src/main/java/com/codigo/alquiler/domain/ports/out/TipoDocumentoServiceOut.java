package com.codigo.alquiler.domain.ports.out;

import com.codigo.alquiler.domain.aggregates.dto.TipoDocumentoDTO;
import com.codigo.alquiler.domain.aggregates.request.RequestTipoDocumento;

import java.util.List;
import java.util.Optional;

public interface TipoDocumentoServiceOut {
    TipoDocumentoDTO crearTipoDocumentoOut(RequestTipoDocumento requestTipoDocumento);
    Optional<TipoDocumentoDTO> obtenerTipoDocumentoOut(String codigo);
    List<TipoDocumentoDTO> obtenerTodosOut();
    TipoDocumentoDTO actualizarOut(Long id, RequestTipoDocumento requestTipoDocumento);
    TipoDocumentoDTO deleteOut(Long id);
}
