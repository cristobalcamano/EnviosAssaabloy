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
 * <p>Clase Java para Solex_View_RelacionDespacho complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Solex_View_RelacionDespacho"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://tempuri.org/}EntityObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Contador" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Cuenta" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="Guia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Unidades" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="Documento_Externo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Destinatario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Ciudad_Destino" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Fecha_Creacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Solex_View_RelacionDespacho", propOrder = {
    "contador",
    "cuenta",
    "guia",
    "unidades",
    "documentoExterno",
    "destinatario",
    "ciudadDestino",
    "fechaCreacion"
})
public class SolexViewRelacionDespacho
    extends EntityObject
{

    @XmlElement(name = "Contador")
    protected int contador;
    @XmlElement(name = "Cuenta", required = true)
    protected BigDecimal cuenta;
    @XmlElement(name = "Guia")
    protected String guia;
    @XmlElement(name = "Unidades", required = true)
    protected BigDecimal unidades;
    @XmlElement(name = "Documento_Externo")
    protected String documentoExterno;
    @XmlElement(name = "Destinatario")
    protected String destinatario;
    @XmlElement(name = "Ciudad_Destino")
    protected String ciudadDestino;
    @XmlElement(name = "Fecha_Creacion")
    protected String fechaCreacion;

    /**
     * Obtiene el valor de la propiedad contador.
     * 
     */
    public int getContador() {
        return contador;
    }

    /**
     * Define el valor de la propiedad contador.
     * 
     */
    public void setContador(int value) {
        this.contador = value;
    }

    /**
     * Obtiene el valor de la propiedad cuenta.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCuenta() {
        return cuenta;
    }

    /**
     * Define el valor de la propiedad cuenta.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCuenta(BigDecimal value) {
        this.cuenta = value;
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
     * Obtiene el valor de la propiedad destinatario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinatario() {
        return destinatario;
    }

    /**
     * Define el valor de la propiedad destinatario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinatario(String value) {
        this.destinatario = value;
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
     * Obtiene el valor de la propiedad fechaCreacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaCreacion() {
        return fechaCreacion;
    }

    /**
     * Define el valor de la propiedad fechaCreacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaCreacion(String value) {
        this.fechaCreacion = value;
    }

}
