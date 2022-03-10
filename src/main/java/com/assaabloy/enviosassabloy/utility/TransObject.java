package com.assaabloy.enviosassabloy.utility;

import com.assaabloy.enviosassabloy.dto.EnvioDto;
import com.assaabloy.enviosassabloy.entity.Envio;

public final class TransObject {

    public static EnvioDto TransforEnvioEntityToDto(Envio envio)throws Exception {
        EnvioDto envioDto = new EnvioDto();
        envioDto.setId(envio.getId());
        envioDto.setIdPedido(envio.getIdPedido());
        envioDto.setLugarEnvio(envio.getLugarEnvio());
        envioDto.setTransportadora(envio.getTransportadora());
        return envioDto;
    }

    public static Envio TransforDtoEnvioEntity(EnvioDto envioDto){
        Envio envio =new Envio();
        envio.setId(envioDto.getId());
        envio.setIdPedido(envioDto.getIdPedido());
        envio.setLugarEnvio(envioDto.getLugarEnvio());
        envio.setTransportadora(envioDto.getTransportadora());
        return envio;
    }

}

