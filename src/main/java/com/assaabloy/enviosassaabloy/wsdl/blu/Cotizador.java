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
 *         &lt;element name="user" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="empresaId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="valorDeclarado" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="cantidad" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="peso" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="volumen" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ruta" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="responseCotizador" type="{http://tempuri.org/}CotizadorEstandarResponseViewModel" minOccurs="0"/&gt;
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
    "user",
    "password",
    "empresaId",
    "valorDeclarado",
    "cantidad",
    "peso",
    "volumen",
    "ruta",
    "responseCotizador"
})
@XmlRootElement(name = "Cotizador")
public class Cotizador {

    protected String user;
    protected String password;
    protected int empresaId;
    protected int valorDeclarado;
    protected int cantidad;
    protected int peso;
    protected int volumen;
    protected int ruta;
    protected CotizadorEstandarResponseViewModel responseCotizador;

    /**
     * Obtiene el valor de la propiedad user.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUser() {
        return user;
    }

    /**
     * Define el valor de la propiedad user.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUser(String value) {
        this.user = value;
    }

    /**
     * Obtiene el valor de la propiedad password.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassword() {
        return password;
    }

    /**
     * Define el valor de la propiedad password.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassword(String value) {
        this.password = value;
    }

    /**
     * Obtiene el valor de la propiedad empresaId.
     * 
     */
    public int getEmpresaId() {
        return empresaId;
    }

    /**
     * Define el valor de la propiedad empresaId.
     * 
     */
    public void setEmpresaId(int value) {
        this.empresaId = value;
    }

    /**
     * Obtiene el valor de la propiedad valorDeclarado.
     * 
     */
    public int getValorDeclarado() {
        return valorDeclarado;
    }

    /**
     * Define el valor de la propiedad valorDeclarado.
     * 
     */
    public void setValorDeclarado(int value) {
        this.valorDeclarado = value;
    }

    /**
     * Obtiene el valor de la propiedad cantidad.
     * 
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * Define el valor de la propiedad cantidad.
     * 
     */
    public void setCantidad(int value) {
        this.cantidad = value;
    }

    /**
     * Obtiene el valor de la propiedad peso.
     * 
     */
    public int getPeso() {
        return peso;
    }

    /**
     * Define el valor de la propiedad peso.
     * 
     */
    public void setPeso(int value) {
        this.peso = value;
    }

    /**
     * Obtiene el valor de la propiedad volumen.
     * 
     */
    public int getVolumen() {
        return volumen;
    }

    /**
     * Define el valor de la propiedad volumen.
     * 
     */
    public void setVolumen(int value) {
        this.volumen = value;
    }

    /**
     * Obtiene el valor de la propiedad ruta.
     * 
     */
    public int getRuta() {
        return ruta;
    }

    /**
     * Define el valor de la propiedad ruta.
     * 
     */
    public void setRuta(int value) {
        this.ruta = value;
    }

    /**
     * Obtiene el valor de la propiedad responseCotizador.
     * 
     * @return
     *     possible object is
     *     {@link CotizadorEstandarResponseViewModel }
     *     
     */
    public CotizadorEstandarResponseViewModel getResponseCotizador() {
        return responseCotizador;
    }

    /**
     * Define el valor de la propiedad responseCotizador.
     * 
     * @param value
     *     allowed object is
     *     {@link CotizadorEstandarResponseViewModel }
     *     
     */
    public void setResponseCotizador(CotizadorEstandarResponseViewModel value) {
        this.responseCotizador = value;
    }

}
