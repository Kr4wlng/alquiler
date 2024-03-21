package com.codigo.alquiler.domain.impl;

import com.codigo.alquiler.domain.aggregates.dto.TipoDocumentoDTO;
import com.codigo.alquiler.domain.aggregates.request.RequestTipoDocumento;
import com.codigo.alquiler.domain.ports.in.TipoDocumentoServiceIn;
import com.codigo.alquiler.domain.ports.out.TipoDocumentoServiceOut;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TipoDocumentoServiceImpl implements TipoDocumentoServiceIn {

    private TipoDocumentoServiceOut tipoDocumentoServiceOut;
    @Override
    public TipoDocumentoDTO crearTipoDocumentoIn(RequestTipoDocumento requestTipoDocumento) {
        return tipoDocumentoServiceOut.crearTipoDocumentoOut(requestTipoDocumento);
    }

    @Override
    public Optional<TipoDocumentoDTO> obtenerTipoDocumentoIn(String codigo) {
        return tipoDocumentoServiceOut.obtenerTipoDocumentoOut(codigo);
    }

    @Override
    public List<TipoDocumentoDTO> obtenerTodosIn() {
        return tipoDocumentoServiceOut.obtenerTodosOut();
    }

    @Override
    public TipoDocumentoDTO actualizarIn(Long id, RequestTipoDocumento requestTipoDocumento) {
        return tipoDocumentoServiceOut.actualizarOut(id, requestTipoDocumento);
    }

    @Override
    public TipoDocumentoDTO deleteIn(Long id) {
        return tipoDocumentoServiceOut.deleteOut(id);
    }
}
