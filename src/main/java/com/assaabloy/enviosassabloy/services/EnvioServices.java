package com.assaabloy.enviosassabloy.services;

import com.assaabloy.enviosassabloy.dto.EnvioDto;
import com.assaabloy.enviosassabloy.dto.RespuestaDto;
import com.assaabloy.enviosassabloy.entity.Envio;

import java.util.List;

public interface EnvioServices {

    public RespuestaDto addEnvio(EnvioDto envioDto)throws Exception;

    public List<Envio>listarEnvios()throws Exception;


}
