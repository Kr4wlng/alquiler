package com.codigo.alquiler.domain.ports.in;

import com.codigo.alquiler.domain.aggregates.dto.TipoDocumentoDTO;
import com.codigo.alquiler.domain.aggregates.request.RequestTipoDocumento;

import java.util.List;
import java.util.Optional;

public interface TipoDocumentoServiceIn {
    TipoDocumentoDTO crearTipoDocumentoIn(RequestTipoDocumento requestTipoDocumento);

    Optional<TipoDocumentoDTO> obtenerTipoDocumentoIn(String codigo);
    List<TipoDocumentoDTO> obtenerTodosIn();
    TipoDocumentoDTO actualizarIn(Long id, RequestTipoDocumento requestTipoDocumento);
    TipoDocumentoDTO deleteIn(Long id);
}
