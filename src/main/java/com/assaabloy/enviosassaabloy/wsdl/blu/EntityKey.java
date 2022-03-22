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
 * <p>Clase Java para EntityKey complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="EntityKey"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EntitySetName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EntityContainerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EntityKeyValues" type="{http://tempuri.org/}ArrayOfEntityKeyMember" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EntityKey", propOrder = {
    "entitySetName",
    "entityContainerName",
    "entityKeyValues"
})
public class EntityKey {

    @XmlElement(name = "EntitySetName")
    protected String entitySetName;
    @XmlElement(name = "EntityContainerName")
    protected String entityContainerName;
    @XmlElement(name = "EntityKeyValues")
    protected ArrayOfEntityKeyMember entityKeyValues;

    /**
     * Obtiene el valor de la propiedad entitySetName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntitySetName() {
        return entitySetName;
    }

    /**
     * Define el valor de la propiedad entitySetName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntitySetName(String value) {
        this.entitySetName = value;
    }

    /**
     * Obtiene el valor de la propiedad entityContainerName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntityContainerName() {
        return entityContainerName;
    }

    /**
     * Define el valor de la propiedad entityContainerName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntityContainerName(String value) {
        this.entityContainerName = value;
    }

    /**
     * Obtiene el valor de la propiedad entityKeyValues.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfEntityKeyMember }
     *     
     */
    public ArrayOfEntityKeyMember getEntityKeyValues() {
        return entityKeyValues;
    }

    /**
     * Define el valor de la propiedad entityKeyValues.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfEntityKeyMember }
     *     
     */
    public void setEntityKeyValues(ArrayOfEntityKeyMember value) {
        this.entityKeyValues = value;
    }

}
