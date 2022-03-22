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
 * <p>Clase Java para viewLiquidacion complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="viewLiquidacion"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="valorFlete" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="costoManejo" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="Tarifa" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="Descuento" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="Observacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TotalFlete" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "viewLiquidacion", propOrder = {
    "valorFlete",
    "costoManejo",
    "tarifa",
    "descuento",
    "observacion",
    "totalFlete"
})
public class ViewLiquidacion {

    @XmlElement(required = true)
    protected BigDecimal valorFlete;
    @XmlElement(required = true)
    protected BigDecimal costoManejo;
    @XmlElement(name = "Tarifa", required = true)
    protected BigDecimal tarifa;
    @XmlElement(name = "Descuento", required = true)
    protected BigDecimal descuento;
    @XmlElement(name = "Observacion")
    protected String observacion;
    @XmlElement(name = "TotalFlete", required = true)
    protected BigDecimal totalFlete;

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
     * Obtiene el valor de la propiedad tarifa.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTarifa() {
        return tarifa;
    }

    /**
     * Define el valor de la propiedad tarifa.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTarifa(BigDecimal value) {
        this.tarifa = value;
    }

    /**
     * Obtiene el valor de la propiedad descuento.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDescuento() {
        return descuento;
    }

    /**
     * Define el valor de la propiedad descuento.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDescuento(BigDecimal value) {
        this.descuento = value;
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
     * Obtiene el valor de la propiedad totalFlete.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalFlete() {
        return totalFlete;
    }

    /**
     * Define el valor de la propiedad totalFlete.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalFlete(BigDecimal value) {
        this.totalFlete = value;
    }

}
