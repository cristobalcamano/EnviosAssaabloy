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
 *         &lt;element name="SolicitarCuentasResult" type="{http://tempuri.org/}EError" minOccurs="0"/&gt;
 *         &lt;element name="cuentas" type="{http://tempuri.org/}ArrayOfECuentasCliente" minOccurs="0"/&gt;
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
    "solicitarCuentasResult",
    "cuentas"
})
@XmlRootElement(name = "SolicitarCuentasResponse")
public class SolicitarCuentasResponse {

    @XmlElement(name = "SolicitarCuentasResult")
    protected EError solicitarCuentasResult;
    protected ArrayOfECuentasCliente cuentas;

    /**
     * Obtiene el valor de la propiedad solicitarCuentasResult.
     * 
     * @return
     *     possible object is
     *     {@link EError }
     *     
     */
    public EError getSolicitarCuentasResult() {
        return solicitarCuentasResult;
    }

    /**
     * Define el valor de la propiedad solicitarCuentasResult.
     * 
     * @param value
     *     allowed object is
     *     {@link EError }
     *     
     */
    public void setSolicitarCuentasResult(EError value) {
        this.solicitarCuentasResult = value;
    }

    /**
     * Obtiene el valor de la propiedad cuentas.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfECuentasCliente }
     *     
     */
    public ArrayOfECuentasCliente getCuentas() {
        return cuentas;
    }

    /**
     * Define el valor de la propiedad cuentas.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfECuentasCliente }
     *     
     */
    public void setCuentas(ArrayOfECuentasCliente value) {
        this.cuentas = value;
    }

}
