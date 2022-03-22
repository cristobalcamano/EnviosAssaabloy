//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.03.22 a las 07:51:13 AM COT 
//


package com.assaabloy.enviosassaabloy.wsdl.blu;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para EGuiaCliente complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="EGuiaCliente"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CostoManejo" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="ValorFlete" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="Unidades" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="KilosVolumen" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="Kilos" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="ValorDeclarado" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="Estados" type="{http://tempuri.org/}ArrayOfEEstadoGuia" minOccurs="0"/&gt;
 *         &lt;element name="DestinatarioIdentificacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DestinatarioNombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DestinatarioDireccion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DestinatarioTelefono" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Observacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DestinatarioBarrio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DocumentoExterno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Guia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OtrosNumeros" type="{http://tempuri.org/}ArrayOfString" minOccurs="0"/&gt;
 *         &lt;element name="CiudadOrigen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CiudadDestino" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CuentaCliente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Zona" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CodigoBarras" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Hub" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EGuiaCliente", propOrder = {
    "costoManejo",
    "valorFlete",
    "unidades",
    "kilosVolumen",
    "kilos",
    "valorDeclarado",
    "estados",
    "destinatarioIdentificacion",
    "destinatarioNombre",
    "destinatarioDireccion",
    "destinatarioTelefono",
    "observacion",
    "destinatarioBarrio",
    "documentoExterno",
    "guia",
    "otrosNumeros",
    "ciudadOrigen",
    "ciudadDestino",
    "cuentaCliente",
    "zona",
    "codigoBarras",
    "hub"
})
public class EGuiaCliente {

    @XmlElement(name = "CostoManejo", required = true)
    protected BigDecimal costoManejo;
    @XmlElement(name = "ValorFlete", required = true)
    protected BigDecimal valorFlete;
    @XmlElement(name = "Unidades", required = true)
    protected BigDecimal unidades;
    @XmlElement(name = "KilosVolumen")
    protected double kilosVolumen;
    @XmlElement(name = "Kilos")
    protected double kilos;
    @XmlElement(name = "ValorDeclarado", required = true)
    protected BigDecimal valorDeclarado;
    @XmlElement(name = "Estados")
    protected ArrayOfEEstadoGuia estados;
    @XmlElement(name = "DestinatarioIdentificacion")
    protected String destinatarioIdentificacion;
    @XmlElement(name = "DestinatarioNombre")
    protected String destinatarioNombre;
    @XmlElement(name = "DestinatarioDireccion")
    protected String destinatarioDireccion;
    @XmlElement(name = "DestinatarioTelefono")
    protected String destinatarioTelefono;
    @XmlElement(name = "Observacion")
    protected String observacion;
    @XmlElement(name = "DestinatarioBarrio")
    protected String destinatarioBarrio;
    @XmlElement(name = "DocumentoExterno")
    protected String documentoExterno;
    @XmlElement(name = "Guia")
    protected String guia;
    @XmlElement(name = "OtrosNumeros")
    protected ArrayOfString otrosNumeros;
    @XmlElement(name = "CiudadOrigen")
    protected String ciudadOrigen;
    @XmlElement(name = "CiudadDestino")
    protected String ciudadDestino;
    @XmlElement(name = "CuentaCliente")
    protected String cuentaCliente;
    @XmlElement(name = "Zona")
    protected String zona;
    @XmlElement(name = "CodigoBarras")
    protected String codigoBarras;
    @XmlElement(name = "Hub")
    protected String hub;

    /**
     * Obtiene el valor de la propiedad costoManejo.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCostoManejo() {
        return costoManejo;
    }

    /**
     * Define el valor de la propiedad costoManejo.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCostoManejo(BigDecimal value) {
        this.costoManejo = value;
    }

    /**
     * Obtiene el valor de la propiedad valorFlete.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValorFlete() {
        return valorFlete;
    }

    /**
     * Define el valor de la propiedad valorFlete.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValorFlete(BigDecimal value) {
        this.valorFlete = value;
    }

    /**
     * Obtiene el valor de la propiedad unidades.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getUnidades() {
        return unidades;
    }

    /**
     * Define el valor de la propiedad unidades.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setUnidades(BigDecimal value) {
        this.unidades = value;
    }

    /**
     * Obtiene el valor de la propiedad kilosVolumen.
     * 
     */
    public double getKilosVolumen() {
        return kilosVolumen;
    }

    /**
     * Define el valor de la propiedad kilosVolumen.
     * 
     */
    public void setKilosVolumen(double value) {
        this.kilosVolumen = value;
    }

    /**
     * Obtiene el valor de la propiedad kilos.
     * 
     */
    public double getKilos() {
        return kilos;
    }

    /**
     * Define el valor de la propiedad kilos.
     * 
     */
    public void setKilos(double value) {
        this.kilos = value;
    }

    /**
     * Obtiene el valor de la propiedad valorDeclarado.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValorDeclarado() {
        return valorDeclarado;
    }

    /**
     * Define el valor de la propiedad valorDeclarado.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValorDeclarado(BigDecimal value) {
        this.valorDeclarado = value;
    }

    /**
     * Obtiene el valor de la propiedad estados.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfEEstadoGuia }
     *     
     */
    public ArrayOfEEstadoGuia getEstados() {
        return estados;
    }

    /**
     * Define el valor de la propiedad estados.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfEEstadoGuia }
     *     
     */
    public void setEstados(ArrayOfEEstadoGuia value) {
        this.estados = value;
    }

    /**
     * Obtiene el valor de la propiedad destinatarioIdentificacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinatarioIdentificacion() {
        return destinatarioIdentificacion;
    }

    /**
     * Define el valor de la propiedad destinatarioIdentificacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinatarioIdentificacion(String value) {
        this.destinatarioIdentificacion = value;
    }

    /**
     * Obtiene el valor de la propiedad destinatarioNombre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinatarioNombre() {
        return destinatarioNombre;
    }

    /**
     * Define el valor de la propiedad destinatarioNombre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinatarioNombre(String value) {
        this.destinatarioNombre = value;
    }

    /**
     * Obtiene el valor de la propiedad destinatarioDireccion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinatarioDireccion() {
        return destinatarioDireccion;
    }

    /**
     * Define el valor de la propiedad destinatarioDireccion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinatarioDireccion(String value) {
        this.destinatarioDireccion = value;
    }

    /**
     * Obtiene el valor de la propiedad destinatarioTelefono.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinatarioTelefono() {
        return destinatarioTelefono;
    }

    /**
     * Define el valor de la propiedad destinatarioTelefono.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinatarioTelefono(String value) {
        this.destinatarioTelefono = value;
    }

    /**
     * Obtiene el valor de la propiedad observacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObservacion() {
        return observacion;
    }

    /**
     * Define el valor de la propiedad observacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObservacion(String value) {
        this.observacion = value;
    }

    /**
     * Obtiene el valor de la propiedad destinatarioBarrio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinatarioBarrio() {
        return destinatarioBarrio;
    }

    /**
     * Define el valor de la propiedad destinatarioBarrio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinatarioBarrio(String value) {
        this.destinatarioBarrio = value;
    }

    /**
     * Obtiene el valor de la propiedad documentoExterno.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentoExterno() {
        return documentoExterno;
    }

    /**
     * Define el valor de la propiedad documentoExterno.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentoExterno(String value) {
        this.documentoExterno = value;
    }

    /**
     * Obtiene el valor de la propiedad guia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGuia() {
        return guia;
    }

    /**
     * Define el valor de la propiedad guia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGuia(String value) {
        this.guia = value;
    }

    /**
     * Obtiene el valor de la propiedad otrosNumeros.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getOtrosNumeros() {
        return otrosNumeros;
    }

    /**
     * Define el valor de la propiedad otrosNumeros.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setOtrosNumeros(ArrayOfString value) {
        this.otrosNumeros = value;
    }

    /**
     * Obtiene el valor de la propiedad ciudadOrigen.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCiudadOrigen() {
        return ciudadOrigen;
    }

    /**
     * Define el valor de la propiedad ciudadOrigen.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCiudadOrigen(String value) {
        this.ciudadOrigen = value;
    }

    /**
     * Obtiene el valor de la propiedad ciudadDestino.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCiudadDestino() {
        return ciudadDestino;
    }

    /**
     * Define el valor de la propiedad ciudadDestino.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCiudadDestino(String value) {
        this.ciudadDestino = value;
    }

    /**
     * Obtiene el valor de la propiedad cuentaCliente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCuentaCliente() {
        return cuentaCliente;
    }

    /**
     * Define el valor de la propiedad cuentaCliente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCuentaCliente(String value) {
        this.cuentaCliente = value;
    }

    /**
     * Obtiene el valor de la propiedad zona.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZona() {
        return zona;
    }

    /**
     * Define el valor de la propiedad zona.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZona(String value) {
        this.zona = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoBarras.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoBarras() {
        return codigoBarras;
    }

    /**
     * Define el valor de la propiedad codigoBarras.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoBarras(String value) {
        this.codigoBarras = value;
    }

    /**
     * Obtiene el valor de la propiedad hub.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHub() {
        return hub;
    }

    /**
     * Define el valor de la propiedad hub.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHub(String value) {
        this.hub = value;
    }

}
