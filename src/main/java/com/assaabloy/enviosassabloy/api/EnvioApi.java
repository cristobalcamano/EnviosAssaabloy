package com.assaabloy.enviosassabloy.api;

import com.assaabloy.enviosassabloy.dto.EnvioDto;
import com.assaabloy.enviosassabloy.services.EnvioServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*",allowedHeaders = "*")
@RequestMapping("/Envios/")
@RestController
public class EnvioApi {
    @Autowired
    private EnvioServices envioServices;

    @GetMapping("")
    public ResponseEntity<?>listarEnvios(){
        try {

            return new ResponseEntity<>(envioServices.listarEnvios(), HttpStatus.CREATED);
        } catch (Exception error){
            return new ResponseEntity<>("Error", HttpStatus.BAD_REQUEST);
        }

    }

    @PostMapping("addEnvios")
    public ResponseEntity<?> agregarEnvioController(@RequestBody EnvioDto envioDto){
        try {
            return new ResponseEntity<>(envioServices.addEnvio(envioDto), HttpStatus.CREATED);
        } catch (Exception error){
            return new ResponseEntity<>("Error", HttpStatus.BAD_REQUEST);
        }
    }

}
