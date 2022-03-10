package com.assaabloy.enviosassabloy.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "envios")
public class Envio  implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "ID")
    private  Integer id;
    /* ------ Tabla envios relacionada con la tabla Pedidos ----- */
    @Column(name = "id_pedido")
    private String idPedido;
    @Column(name = "lugar_envio")
    private String lugarEnvio;
    @Column(name = "transportadora")
    private String transportadora;

    public Envio() {
    }

    public Envio(String idPedido, String lugarEnvio, String transportadora) {
        this.idPedido = idPedido;
        this.lugarEnvio = lugarEnvio;
        this.transportadora = transportadora;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(String idPedido) {
        this.idPedido = idPedido;
    }

    public String getLugarEnvio() {
        return lugarEnvio;
    }

    public void setLugarEnvio(String lugarEnvio) {
        this.lugarEnvio = lugarEnvio;
    }

    public String getTransportadora() {
        return transportadora;
    }

    public void setTransportadora(String transportadora) {
        this.transportadora = transportadora;
    }

    @Override
    public String toString() {
        return "Envio{" +
                "id=" + id +
                ", idPedido='" + idPedido + '\'' +
                ", lugarEnvio='" + lugarEnvio + '\'' +
                ", transportadora='" + transportadora + '\'' +
                '}';
    }
}
