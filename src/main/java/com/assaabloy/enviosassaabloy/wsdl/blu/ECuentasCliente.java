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
 * <p>Clase Java para ECuentasCliente complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ECuentasCliente"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IdCuentaCliente" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Cuenta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Direccion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CodigoDane" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ECuentasCliente", propOrder = {
    "idCuentaCliente",
    "cuenta",
    "direccion",
    "codigoDane"
})
public class ECuentasCliente {

    @XmlElement(name = "IdCuentaCliente")
    protected int idCuentaCliente;
    @XmlElement(name = "Cuenta")
    protected String cuenta;
    @XmlElement(name = "Direccion")
    protected String direccion;
    @XmlElement(name = "CodigoDane")
    protected String codigoDane;

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
     * Obtiene el valor de la propiedad cuenta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * Define el valor de la propiedad cuenta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCuenta(String value) {
        this.cuenta = value;
    }

    /**
     * Obtiene el valor de la propiedad direccion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * Define el valor de la propiedad direccion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDireccion(String value) {
        this.direccion = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoDane.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoDane() {
        return codigoDane;
    }

    /**
     * Define el valor de la propiedad codigoDane.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoDane(String value) {
        this.codigoDane = value;
    }

}
