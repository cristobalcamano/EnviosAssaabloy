//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.03.22 a las 07:51:13 AM COT 
//


package com.assaabloy.enviosassaabloy.wsdl.blu;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="getValoresLiquidacionResult" type="{http://tempuri.org/}EError" minOccurs="0"/&gt;
 *         &lt;element name="valorFacturado" type="{http://tempuri.org/}EValorFacturado" minOccurs="0"/&gt;
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
    "getValoresLiquidacionResult",
    "valorFacturado"
})
@XmlRootElement(name = "getValoresLiquidacionResponse")
public class GetValoresLiquidacionResponse {

    protected EError getValoresLiquidacionResult;
    protected EValorFacturado valorFacturado;

    /**
     * Obtiene el valor de la propiedad getValoresLiquidacionResult.
     * 
     * @return
     *     possible object is
     *     {@link EError }
     *     
     */
    public EError getGetValoresLiquidacionResult() {
        return getValoresLiquidacionResult;
    }

    /**
     * Define el valor de la propiedad getValoresLiquidacionResult.
     * 
     * @param value
     *     allowed object is
     *     {@link EError }
     *     
     */
    public void setGetValoresLiquidacionResult(EError value) {
        this.getValoresLiquidacionResult = value;
    }

    /**
     * Obtiene el valor de la propiedad valorFacturado.
     * 
     * @return
     *     possible object is
     *     {@link EValorFacturado }
     *     
     */
    public EValorFacturado getValorFacturado() {
        return valorFacturado;
    }

    /**
     * Define el valor de la propiedad valorFacturado.
     * 
     * @param value
     *     allowed object is
     *     {@link EValorFacturado }
     *     
     */
    public void setValorFacturado(EValorFacturado value) {
        this.valorFacturado = value;
    }

}
