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
 *         &lt;element name="GetGeoreferenciacionResult" type="{http://tempuri.org/}EError" minOccurs="0"/&gt;
 *         &lt;element name="ubicacion" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
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
    "getGeoreferenciacionResult",
    "ubicacion"
})
@XmlRootElement(name = "GetGeoreferenciacionResponse")
public class GetGeoreferenciacionResponse {

    @XmlElement(name = "GetGeoreferenciacionResult")
    protected EError getGeoreferenciacionResult;
    protected Object ubicacion;

    /**
     * Obtiene el valor de la propiedad getGeoreferenciacionResult.
     * 
     * @return
     *     possible object is
     *     {@link EError }
     *     
     */
    public EError getGetGeoreferenciacionResult() {
        return getGeoreferenciacionResult;
    }

    /**
     * Define el valor de la propiedad getGeoreferenciacionResult.
     * 
     * @param value
     *     allowed object is
     *     {@link EError }
     *     
     */
    public void setGetGeoreferenciacionResult(EError value) {
        this.getGeoreferenciacionResult = value;
    }

    /**
     * Obtiene el valor de la propiedad ubicacion.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getUbicacion() {
        return ubicacion;
    }

    /**
     * Define el valor de la propiedad ubicacion.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setUbicacion(Object value) {
        this.ubicacion = value;
    }

}
