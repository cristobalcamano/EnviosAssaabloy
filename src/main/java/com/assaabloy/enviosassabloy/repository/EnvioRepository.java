package com.assaabloy.enviosassabloy.repository;

import com.assaabloy.enviosassabloy.dto.EnvioDto;
import com.assaabloy.enviosassabloy.entity.Envio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EnvioRepository  extends JpaRepository<Envio,Integer> {

      List<Envio> findByIdPedido(String s);

    
}
