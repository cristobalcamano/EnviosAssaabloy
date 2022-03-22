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
 * <p>Clase Java para CotizadorEstandarResponseViewModel complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CotizadorEstandarResponseViewModel"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ValorFlete" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="CostoManejo" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ValorTotal" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CotizadorEstandarResponseViewModel", propOrder = {
    "valorFlete",
    "costoManejo",
    "valorTotal"
})
public class CotizadorEstandarResponseViewModel {

    @XmlElement(name = "ValorFlete", required = true, type = Integer.class, nillable = true)
    protected Integer valorFlete;
    @XmlElement(name = "CostoManejo", required = true, type = Integer.class, nillable = true)
    protected Integer costoManejo;
    @XmlElement(name = "ValorTotal", required = true, type = Integer.class, nillable = true)
    protected Integer valorTotal;

    /**
     * Obtiene el valor de la propiedad valorFlete.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getValorFlete() {
        return valorFlete;
    }

    /**
     * Define el valor de la propiedad valorFlete.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setValorFlete(Integer value) {
        this.valorFlete = value;
    }

    /**
     * Obtiene el valor de la propiedad costoManejo.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCostoManejo() {
        return costoManejo;
    }

    /**
     * Define el valor de la propiedad costoManejo.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCostoManejo(Integer value) {
        this.costoManejo = value;
    }

    /**
     * Obtiene el valor de la propiedad valorTotal.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getValorTotal() {
        return valorTotal;
    }

    /**
     * Define el valor de la propiedad valorTotal.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setValorTotal(Integer value) {
        this.valorTotal = value;
    }

}
