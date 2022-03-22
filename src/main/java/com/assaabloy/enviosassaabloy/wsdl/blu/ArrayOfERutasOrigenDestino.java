//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.03.22 a las 07:51:13 AM COT 
//


package com.assaabloy.enviosassaabloy.wsdl.blu;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ArrayOfERutasOrigenDestino complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfERutasOrigenDestino"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ERutasOrigenDestino" type="{http://tempuri.org/}ERutasOrigenDestino" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfERutasOrigenDestino", propOrder = {
    "eRutasOrigenDestino"
})
public class ArrayOfERutasOrigenDestino {

    @XmlElement(name = "ERutasOrigenDestino", nillable = true)
    protected List<ERutasOrigenDestino> eRutasOrigenDestino;

    /**
     * Gets the value of the eRutasOrigenDestino property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the eRutasOrigenDestino property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getERutasOrigenDestino().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ERutasOrigenDestino }
     * 
     * 
     */
    public List<ERutasOrigenDestino> getERutasOrigenDestino() {
        if (eRutasOrigenDestino == null) {
            eRutasOrigenDestino = new ArrayList<ERutasOrigenDestino>();
        }
        return this.eRutasOrigenDestino;
    }

}
