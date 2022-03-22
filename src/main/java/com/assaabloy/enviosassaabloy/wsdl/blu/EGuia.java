//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.03.22 a las 07:51:13 AM COT 
//


package com.assaabloy.enviosassaabloy.wsdl.blu;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para EGuia complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="EGuia"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DestinatarioIdentificacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DestinatarioNombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DestinatarioDireccion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DestinatarioTelefono" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Ruta" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Observacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DestinatarioBarrio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Kilos" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ValorDeclarado" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Cantidad" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="IdCuentaCliente" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="DocumentoExterno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Guia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OtrosNumeros" type="{http://tempuri.org/}ArrayOfString" minOccurs="0"/&gt;
 *         &lt;element name="Correo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EGuia", propOrder = {
    "destinatarioIdentificacion",
    "destinatarioNombre",
    "destinatarioDireccion",
    "destinatarioTelefono",
    "ruta",
    "observacion",
    "destinatarioBarrio",
    "kilos",
    "valorDeclarado",
    "cantidad",
    "idCuentaCliente",
    "documentoExterno",
    "guia",
    "otrosNumeros",
    "correo"
})
public class EGuia {

    @XmlElement(name = "DestinatarioIdentificacion")
    protected String destinatarioIdentificacion;
    @XmlElement(name = "DestinatarioNombre")
    protected String destinatarioNombre;
    @XmlElement(name = "DestinatarioDireccion")
    protected String destinatarioDireccion;
    @XmlElement(name = "DestinatarioTelefono")
    protected String destinatarioTelefono;
    @XmlElement(name = "Ruta")
    protected int ruta;
    @XmlElement(name = "Observacion")
    protected String observacion;
    @XmlElement(name = "DestinatarioBarrio")
    protected String destinatarioBarrio;
    @XmlElement(name = "Kilos")
    protected int kilos;
    @XmlElement(name = "ValorDeclarado")
    protected int valorDeclarado;
    @XmlElement(name = "Cantidad")
    protected int cantidad;
    @XmlElement(name = "IdCuentaCliente")
    protected int idCuentaCliente;
    @XmlElement(name = "DocumentoExterno")
    protected String documentoExterno;
    @XmlElement(name = "Guia")
    protected String guia;
    @XmlElement(name = "OtrosNumeros")
    protected ArrayOfString otrosNumeros;
    @XmlElement(name = "Correo")
    protected String correo;

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
     * Obtiene el valor de la propiedad ruta.
     * 
     */
    public int getRuta() {
        return ruta;
    }

    /**
     * Define el valor de la propiedad ruta.
     * 
     */
    public void setRuta(int value) {
        this.ruta = value;
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
     * Obtiene el valor de la propiedad kilos.
     * 
     */
    public int getKilos() {
        return kilos;
    }

    /**
     * Define el valor de la propiedad kilos.
     * 
     */
    public void setKilos(int value) {
        this.kilos = value;
    }

    /**
     * Obtiene el valor de la propiedad valorDeclarado.
     * 
     */
    public int getValorDeclarado() {
        return valorDeclarado;
    }

    /**
     * Define el valor de la propiedad valorDeclarado.
     * 
     */
    public void setValorDeclarado(int value) {
        this.valorDeclarado = value;
    }

    /**
     * Obtiene el valor de la propiedad cantidad.
     * 
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * Define el valor de la propiedad cantidad.
     * 
     */
    public void setCantidad(int value) {
        this.cantidad = value;
    }

    /**
     * Obtiene el valor de la propiedad idCuentaCliente.
     * 
     */
    public int getIdCuentaCliente() {
        return idCuentaCliente;
    }

    /**
     * Define el valor de la propiedad idCuentaCliente.
     * 
     */
    public void setIdCuentaCliente(int value) {
        this.idCuentaCliente = value;
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
     * Obtiene el valor de la propiedad correo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * Define el valor de la propiedad correo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorreo(String value) {
        this.correo = value;
    }

}
