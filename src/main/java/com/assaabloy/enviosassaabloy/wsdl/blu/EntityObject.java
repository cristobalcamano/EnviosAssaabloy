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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para EntityObject complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="EntityObject"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://tempuri.org/}StructuralObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EntityKey" type="{http://tempuri.org/}EntityKey" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EntityObject", propOrder = {
    "entityKey"
})
@XmlSeeAlso({
    SolexViewRelacionDespacho.class
})
public abstract class EntityObject
    extends StructuralObject
{

    @XmlElement(name = "EntityKey")
    protected EntityKey entityKey;

    /**
     * Obtiene el valor de la propiedad entityKey.
     * 
     * @return
     *     possible object is
     *     {@link EntityKey }
     *     
     */
    public EntityKey getEntityKey() {
        return entityKey;
    }

    /**
     * Define el valor de la propiedad entityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityKey }
     *     
     */
    public void setEntityKey(EntityKey value) {
        this.entityKey = value;
    }

}
