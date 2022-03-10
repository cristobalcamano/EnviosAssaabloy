package com.assaabloy.enviosassabloy.services.impl;

import com.assaabloy.enviosassabloy.dto.EnvioDto;
import com.assaabloy.enviosassabloy.dto.RespuestaDto;
import com.assaabloy.enviosassabloy.entity.Envio;
import com.assaabloy.enviosassabloy.repository.EnvioRepository;
import com.assaabloy.enviosassabloy.services.EnvioServices;
import com.assaabloy.enviosassabloy.utility.TransObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class EnvioServicesImpl implements EnvioServices {

    @Autowired
    private EnvioRepository envioRepository;

    @Override
    public RespuestaDto addEnvio(EnvioDto envioDto)throws Exception {
        RespuestaDto respuestaDto=new RespuestaDto();
        Envio envio =TransObject.TransforDtoEnvioEntity(envioDto);
        List<Envio> envio1=new ArrayList<>();
        envio1=envioRepository.findByIdPedido(envioDto.getIdPedido());
        if(envio1.isEmpty()){
            Envio nuevoEnvio = envioRepository.save(envio);
            EnvioDto respuesta= TransObject.TransforEnvioEntityToDto(nuevoEnvio);
            respuestaDto.setMensaje("Se envio el Pedido");
            return respuestaDto;
        }else{
            respuestaDto.setMensaje("Este pedido ya se encuentra enviado");
            respuestaDto.setValidar(false);
            return  respuestaDto;
        }



    }

    @Override
    public List<Envio> listarEnvios() throws Exception {
        return envioRepository.findAll();
    }



}
