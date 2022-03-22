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
 * <p>Clase Java para ERutasOrigenDestino complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ERutasOrigenDestino"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="idRuta" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="CodciudadOrigen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CodciudadDestino" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ERutasOrigenDestino", propOrder = {
    "idRuta",
    "codciudadOrigen",
    "codciudadDestino"
})
public class ERutasOrigenDestino {

    protected int idRuta;
    @XmlElement(name = "CodciudadOrigen")
    protected String codciudadOrigen;
    @XmlElement(name = "CodciudadDestino")
    protected String codciudadDestino;

    /**
     * Obtiene el valor de la propiedad idRuta.
     * 
     */
    public int getIdRuta() {
        return idRuta;
    }

    /**
     * Define el valor de la propiedad idRuta.
     * 
     */
    public void setIdRuta(int value) {
        this.idRuta = value;
    }

    /**
     * Obtiene el valor de la propiedad codciudadOrigen.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodciudadOrigen() {
        return codciudadOrigen;
    }

    /**
     * Define el valor de la propiedad codciudadOrigen.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodciudadOrigen(String value) {
        this.codciudadOrigen = value;
    }

    /**
     * Obtiene el valor de la propiedad codciudadDestino.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodciudadDestino() {
        return codciudadDestino;
    }

    /**
     * Define el valor de la propiedad codciudadDestino.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodciudadDestino(String value) {
        this.codciudadDestino = value;
    }

}
