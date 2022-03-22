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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="user" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cuentaId" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="valorDeclarado" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="unidades" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="kilos" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="volumen" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="ciudadOrigenDane" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ciudadDestinoDane" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="objLiquidacion" type="{http://tempuri.org/}viewLiquidacion" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "user",
    "password",
    "cuentaId",
    "valorDeclarado",
    "unidades",
    "kilos",
    "volumen",
    "ciudadOrigenDane",
    "ciudadDestinoDane",
    "objLiquidacion"
})
@XmlRootElement(name = "getPreLiquidacion")
public class GetPreLiquidacion {

    protected String user;
    protected String password;
    @XmlElement(required = true)
    protected BigDecimal cuentaId;
    @XmlElement(required = true)
    protected BigDecimal valorDeclarado;
    @XmlElement(required = true)
    protected BigDecimal unidades;
    @XmlElement(required = true)
    protected BigDecimal kilos;
    @XmlElement(required = true)
    protected BigDecimal volumen;
    protected String ciudadOrigenDane;
    protected String ciudadDestinoDane;
    protected ViewLiquidacion objLiquidacion;

    /**
     * Obtiene el valor de la propiedad user.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUser() {
        return user;
    }

    /**
     * Define el valor de la propiedad user.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUser(String value) {
        this.user = value;
    }

    /**
     * Obtiene el valor de la propiedad password.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassword() {
        return password;
    }

    /**
     * Define el valor de la propiedad password.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassword(String value) {
        this.password = value;
    }

    /**
     * Obtiene el valor de la propiedad cuentaId.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCuentaId() {
        return cuentaId;
    }

    /**
     * Define el valor de la propiedad cuentaId.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCuentaId(BigDecimal value) {
        this.cuentaId = value;
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
     * Obtiene el valor de la propiedad kilos.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getKilos() {
        return kilos;
    }

    /**
     * Define el valor de la propiedad kilos.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setKilos(BigDecimal value) {
        this.kilos = value;
    }

    /**
     * Obtiene el valor de la propiedad volumen.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVolumen() {
        return volumen;
    }

    /**
     * Define el valor de la propiedad volumen.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVolumen(BigDecimal value) {
        this.volumen = value;
    }

    /**
     * Obtiene el valor de la propiedad ciudadOrigenDane.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCiudadOrigenDane() {
        return ciudadOrigenDane;
    }

    /**
     * Define el valor de la propiedad ciudadOrigenDane.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCiudadOrigenDane(String value) {
        this.ciudadOrigenDane = value;
    }

    /**
     * Obtiene el valor de la propiedad ciudadDestinoDane.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCiudadDestinoDane() {
        return ciudadDestinoDane;
    }

    /**
     * Define el valor de la propiedad ciudadDestinoDane.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCiudadDestinoDane(String value) {
        this.ciudadDestinoDane = value;
    }

    /**
     * Obtiene el valor de la propiedad objLiquidacion.
     * 
     * @return
     *     possible object is
     *     {@link ViewLiquidacion }
     *     
     */
    public ViewLiquidacion getObjLiquidacion() {
        return objLiquidacion;
    }

    /**
     * Define el valor de la propiedad objLiquidacion.
     * 
     * @param value
     *     allowed object is
     *     {@link ViewLiquidacion }
     *     
     */
    public void setObjLiquidacion(ViewLiquidacion value) {
        this.objLiquidacion = value;
    }

}
