package com.assaabloy.enviosassabloy.service;

import com.assaabloy.enviosassabloy.dto.EnvioDto;
import com.assaabloy.enviosassabloy.dto.RespuestaDto;
import com.assaabloy.enviosassabloy.entity.Envio;

import java.util.List;

public interface EnvioService {

    public RespuestaDto addEnvio(EnvioDto envioDto)throws Exception;

    public List<Envio>listarEnvios()throws Exception;
    
    public void validarTransportadora(EnvioDto envioDto);


}
