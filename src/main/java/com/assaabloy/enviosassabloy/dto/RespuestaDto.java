package com.assaabloy.enviosassabloy.dto;

public class RespuestaDto {

    private String mensaje;
    private boolean validar;
    
    
    public RespuestaDto() {
    }

    public RespuestaDto(String mensaje, boolean validar) {
        this.mensaje = mensaje;
        this.validar = validar;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public boolean isValidar() {
        return validar;
    }

    public void setValidar(boolean validar) {
        this.validar = validar;
    }

	@Override
	public String toString() {
		return "RespuestaDto [mensaje=" + mensaje + ", validar=" + validar + "]";
	}
    
    
}
