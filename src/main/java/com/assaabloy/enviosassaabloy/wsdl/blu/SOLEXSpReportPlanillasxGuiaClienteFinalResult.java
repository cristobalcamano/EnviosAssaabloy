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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para SOLEX_Sp_Report_PlanillasxGuiaClienteFinal_Result complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="SOLEX_Sp_Report_PlanillasxGuiaClienteFinal_Result"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://tempuri.org/}ComplexObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="GuiaId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="NumeroGuia" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="FechaCreacionGuia" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="FechaRecepcion" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="Empresa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CiudadDestino" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FechaPrimeraCita" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="Destinatario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Direccion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Telefono" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Planilla" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="PlacaSalida1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FechaDespachoPlanilla1" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="Estado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Causal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TipoRuta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Planilla2" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="PlacaSalida2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FechaDespachoPlanilla2" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="Estado2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Causal2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TipoRuta2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Planilla3" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="PlacaSalida3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FechaDespachoPlanilla3" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="Estado3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Causal3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TipoRuta3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Planilla4" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="PlacaSalida4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FechaDespachoPlanilla4" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="Estado4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Causal4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TipoRuta4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Planilla5" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="PlacaSalida5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FechaDespachoPlanilla5" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="Estado5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Causal5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TipoRuta5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PlanillaFinal" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="PlacaSalidaFinal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FechaDespachoPlanillaFinal" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="EstadoFinal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CausalFinal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TipoRutaFinal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fechaEntrega" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="EstadoActual" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SOLEX_Sp_Report_PlanillasxGuiaClienteFinal_Result", propOrder = {
    "id",
    "guiaId",
    "numeroGuia",
    "fechaCreacionGuia",
    "fechaRecepcion",
    "empresa",
    "ciudadDestino",
    "fechaPrimeraCita",
    "destinatario",
    "direccion",
    "telefono",
    "planilla",
    "placaSalida1",
    "fechaDespachoPlanilla1",
    "estado",
    "causal",
    "tipoRuta",
    "planilla2",
    "placaSalida2",
    "fechaDespachoPlanilla2",
    "estado2",
    "causal2",
    "tipoRuta2",
    "planilla3",
    "placaSalida3",
    "fechaDespachoPlanilla3",
    "estado3",
    "causal3",
    "tipoRuta3",
    "planilla4",
    "placaSalida4",
    "fechaDespachoPlanilla4",
    "estado4",
    "causal4",
    "tipoRuta4",
    "planilla5",
    "placaSalida5",
    "fechaDespachoPlanilla5",
    "estado5",
    "causal5",
    "tipoRuta5",
    "planillaFinal",
    "placaSalidaFinal",
    "fechaDespachoPlanillaFinal",
    "estadoFinal",
    "causalFinal",
    "tipoRutaFinal",
    "fechaEntrega",
    "estadoActual"
})
public class SOLEXSpReportPlanillasxGuiaClienteFinalResult
    extends ComplexObject
{

    @XmlElement(name = "Id")
    protected int id;
    @XmlElement(name = "GuiaId", required = true, type = Integer.class, nillable = true)
    protected Integer guiaId;
    @XmlElement(name = "NumeroGuia", required = true, type = Integer.class, nillable = true)
    protected Integer numeroGuia;
    @XmlElement(name = "FechaCreacionGuia", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaCreacionGuia;
    @XmlElement(name = "FechaRecepcion", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaRecepcion;
    @XmlElement(name = "Empresa")
    protected String empresa;
    @XmlElement(name = "CiudadDestino")
    protected String ciudadDestino;
    @XmlElement(name = "FechaPrimeraCita", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaPrimeraCita;
    @XmlElement(name = "Destinatario")
    protected String destinatario;
    @XmlElement(name = "Direccion")
    protected String direccion;
    @XmlElement(name = "Telefono")
    protected String telefono;
    @XmlElement(name = "Planilla", required = true, type = Integer.class, nillable = true)
    protected Integer planilla;
    @XmlElement(name = "PlacaSalida1")
    protected String placaSalida1;
    @XmlElement(name = "FechaDespachoPlanilla1", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaDespachoPlanilla1;
    @XmlElement(name = "Estado")
    protected String estado;
    @XmlElement(name = "Causal")
    protected String causal;
    @XmlElement(name = "TipoRuta")
    protected String tipoRuta;
    @XmlElement(name = "Planilla2", required = true, type = Integer.class, nillable = true)
    protected Integer planilla2;
    @XmlElement(name = "PlacaSalida2")
    protected String placaSalida2;
    @XmlElement(name = "FechaDespachoPlanilla2", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaDespachoPlanilla2;
    @XmlElement(name = "Estado2")
    protected String estado2;
    @XmlElement(name = "Causal2")
    protected String causal2;
    @XmlElement(name = "TipoRuta2")
    protected String tipoRuta2;
    @XmlElement(name = "Planilla3", required = true, type = Integer.class, nillable = true)
    protected Integer planilla3;
    @XmlElement(name = "PlacaSalida3")
    protected String placaSalida3;
    @XmlElement(name = "FechaDespachoPlanilla3", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaDespachoPlanilla3;
    @XmlElement(name = "Estado3")
    protected String estado3;
    @XmlElement(name = "Causal3")
    protected String causal3;
    @XmlElement(name = "TipoRuta3")
    protected String tipoRuta3;
    @XmlElement(name = "Planilla4", required = true, type = Integer.class, nillable = true)
    protected Integer planilla4;
    @XmlElement(name = "PlacaSalida4")
    protected String placaSalida4;
    @XmlElement(name = "FechaDespachoPlanilla4", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaDespachoPlanilla4;
    @XmlElement(name = "Estado4")
    protected String estado4;
    @XmlElement(name = "Causal4")
    protected String causal4;
    @XmlElement(name = "TipoRuta4")
    protected String tipoRuta4;
    @XmlElement(name = "Planilla5", required = true, type = Integer.class, nillable = true)
    protected Integer planilla5;
    @XmlElement(name = "PlacaSalida5")
    protected String placaSalida5;
    @XmlElement(name = "FechaDespachoPlanilla5", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaDespachoPlanilla5;
    @XmlElement(name = "Estado5")
    protected String estado5;
    @XmlElement(name = "Causal5")
    protected String causal5;
    @XmlElement(name = "TipoRuta5")
    protected String tipoRuta5;
    @XmlElement(name = "PlanillaFinal", required = true, type = Integer.class, nillable = true)
    protected Integer planillaFinal;
    @XmlElement(name = "PlacaSalidaFinal")
    protected String placaSalidaFinal;
    @XmlElement(name = "FechaDespachoPlanillaFinal", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaDespachoPlanillaFinal;
    @XmlElement(name = "EstadoFinal")
    protected String estadoFinal;
    @XmlElement(name = "CausalFinal")
    protected String causalFinal;
    @XmlElement(name = "TipoRutaFinal")
    protected String tipoRutaFinal;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaEntrega;
    @XmlElement(name = "EstadoActual")
    protected String estadoActual;

    /**
     * Obtiene el valor de la propiedad id.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Define el valor de la propiedad id.
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

    /**
     * Obtiene el valor de la propiedad guiaId.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getGuiaId() {
        return guiaId;
    }

    /**
     * Define el valor de la propiedad guiaId.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setGuiaId(Integer value) {
        this.guiaId = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroGuia.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumeroGuia() {
        return numeroGuia;
    }

    /**
     * Define el valor de la propiedad numeroGuia.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumeroGuia(Integer value) {
        this.numeroGuia = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaCreacionGuia.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaCreacionGuia() {
        return fechaCreacionGuia;
    }

    /**
     * Define el valor de la propiedad fechaCreacionGuia.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaCreacionGuia(XMLGregorianCalendar value) {
        this.fechaCreacionGuia = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaRecepcion.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaRecepcion() {
        return fechaRecepcion;
    }

    /**
     * Define el valor de la propiedad fechaRecepcion.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaRecepcion(XMLGregorianCalendar value) {
        this.fechaRecepcion = value;
    }

    /**
     * Obtiene el valor de la propiedad empresa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmpresa() {
        return empresa;
    }

    /**
     * Define el valor de la propiedad empresa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmpresa(String value) {
        this.empresa = value;
    }

    /**
     * Obtiene el valor de la propiedad ciudadDestino.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCiudadDestino() {
        return ciudadDestino;
    }

    /**
     * Define el valor de la propiedad ciudadDestino.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCiudadDestino(String value) {
        this.ciudadDestino = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaPrimeraCita.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaPrimeraCita() {
        return fechaPrimeraCita;
    }

    /**
     * Define el valor de la propiedad fechaPrimeraCita.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaPrimeraCita(XMLGregorianCalendar value) {
        this.fechaPrimeraCita = value;
    }

    /**
     * Obtiene el valor de la propiedad destinatario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinatario() {
        return destinatario;
    }

    /**
     * Define el valor de la propiedad destinatario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinatario(String value) {
        this.destinatario = value;
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
     * Obtiene el valor de la propiedad telefono.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * Define el valor de la propiedad telefono.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelefono(String value) {
        this.telefono = value;
    }

    /**
     * Obtiene el valor de la propiedad planilla.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPlanilla() {
        return planilla;
    }

    /**
     * Define el valor de la propiedad planilla.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPlanilla(Integer value) {
        this.planilla = value;
    }

    /**
     * Obtiene el valor de la propiedad placaSalida1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlacaSalida1() {
        return placaSalida1;
    }

    /**
     * Define el valor de la propiedad placaSalida1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlacaSalida1(String value) {
        this.placaSalida1 = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaDespachoPlanilla1.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaDespachoPlanilla1() {
        return fechaDespachoPlanilla1;
    }

    /**
     * Define el valor de la propiedad fechaDespachoPlanilla1.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaDespachoPlanilla1(XMLGregorianCalendar value) {
        this.fechaDespachoPlanilla1 = value;
    }

    /**
     * Obtiene el valor de la propiedad estado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstado() {
        return estado;
    }

    /**
     * Define el valor de la propiedad estado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstado(String value) {
        this.estado = value;
    }

    /**
     * Obtiene el valor de la propiedad causal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCausal() {
        return causal;
    }

    /**
     * Define el valor de la propiedad causal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCausal(String value) {
        this.causal = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoRuta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoRuta() {
        return tipoRuta;
    }

    /**
     * Define el valor de la propiedad tipoRuta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoRuta(String value) {
        this.tipoRuta = value;
    }

    /**
     * Obtiene el valor de la propiedad planilla2.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPlanilla2() {
        return planilla2;
    }

    /**
     * Define el valor de la propiedad planilla2.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPlanilla2(Integer value) {
        this.planilla2 = value;
    }

    /**
     * Obtiene el valor de la propiedad placaSalida2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlacaSalida2() {
        return placaSalida2;
    }

    /**
     * Define el valor de la propiedad placaSalida2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlacaSalida2(String value) {
        this.placaSalida2 = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaDespachoPlanilla2.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaDespachoPlanilla2() {
        return fechaDespachoPlanilla2;
    }

    /**
     * Define el valor de la propiedad fechaDespachoPlanilla2.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaDespachoPlanilla2(XMLGregorianCalendar value) {
        this.fechaDespachoPlanilla2 = value;
    }

    /**
     * Obtiene el valor de la propiedad estado2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstado2() {
        return estado2;
    }

    /**
     * Define el valor de la propiedad estado2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstado2(String value) {
        this.estado2 = value;
    }

    /**
     * Obtiene el valor de la propiedad causal2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCausal2() {
        return causal2;
    }

    /**
     * Define el valor de la propiedad causal2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCausal2(String value) {
        this.causal2 = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoRuta2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoRuta2() {
        return tipoRuta2;
    }

    /**
     * Define el valor de la propiedad tipoRuta2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoRuta2(String value) {
        this.tipoRuta2 = value;
    }

    /**
     * Obtiene el valor de la propiedad planilla3.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPlanilla3() {
        return planilla3;
    }

    /**
     * Define el valor de la propiedad planilla3.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPlanilla3(Integer value) {
        this.planilla3 = value;
    }

    /**
     * Obtiene el valor de la propiedad placaSalida3.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlacaSalida3() {
        return placaSalida3;
    }

    /**
     * Define el valor de la propiedad placaSalida3.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlacaSalida3(String value) {
        this.placaSalida3 = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaDespachoPlanilla3.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaDespachoPlanilla3() {
        return fechaDespachoPlanilla3;
    }

    /**
     * Define el valor de la propiedad fechaDespachoPlanilla3.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaDespachoPlanilla3(XMLGregorianCalendar value) {
        this.fechaDespachoPlanilla3 = value;
    }

    /**
     * Obtiene el valor de la propiedad estado3.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstado3() {
        return estado3;
    }

    /**
     * Define el valor de la propiedad estado3.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstado3(String value) {
        this.estado3 = value;
    }

    /**
     * Obtiene el valor de la propiedad causal3.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCausal3() {
        return causal3;
    }

    /**
     * Define el valor de la propiedad causal3.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCausal3(String value) {
        this.causal3 = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoRuta3.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoRuta3() {
        return tipoRuta3;
    }

    /**
     * Define el valor de la propiedad tipoRuta3.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoRuta3(String value) {
        this.tipoRuta3 = value;
    }

    /**
     * Obtiene el valor de la propiedad planilla4.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPlanilla4() {
        return planilla4;
    }

    /**
     * Define el valor de la propiedad planilla4.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPlanilla4(Integer value) {
        this.planilla4 = value;
    }

    /**
     * Obtiene el valor de la propiedad placaSalida4.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlacaSalida4() {
        return placaSalida4;
    }

    /**
     * Define el valor de la propiedad placaSalida4.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlacaSalida4(String value) {
        this.placaSalida4 = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaDespachoPlanilla4.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaDespachoPlanilla4() {
        return fechaDespachoPlanilla4;
    }

    /**
     * Define el valor de la propiedad fechaDespachoPlanilla4.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaDespachoPlanilla4(XMLGregorianCalendar value) {
        this.fechaDespachoPlanilla4 = value;
    }

    /**
     * Obtiene el valor de la propiedad estado4.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstado4() {
        return estado4;
    }

    /**
     * Define el valor de la propiedad estado4.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstado4(String value) {
        this.estado4 = value;
    }

    /**
     * Obtiene el valor de la propiedad causal4.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCausal4() {
        return causal4;
    }

    /**
     * Define el valor de la propiedad causal4.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCausal4(String value) {
        this.causal4 = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoRuta4.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoRuta4() {
        return tipoRuta4;
    }

    /**
     * Define el valor de la propiedad tipoRuta4.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoRuta4(String value) {
        this.tipoRuta4 = value;
    }

    /**
     * Obtiene el valor de la propiedad planilla5.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPlanilla5() {
        return planilla5;
    }

    /**
     * Define el valor de la propiedad planilla5.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPlanilla5(Integer value) {
        this.planilla5 = value;
    }

    /**
     * Obtiene el valor de la propiedad placaSalida5.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlacaSalida5() {
        return placaSalida5;
    }

    /**
     * Define el valor de la propiedad placaSalida5.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlacaSalida5(String value) {
        this.placaSalida5 = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaDespachoPlanilla5.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaDespachoPlanilla5() {
        return fechaDespachoPlanilla5;
    }

    /**
     * Define el valor de la propiedad fechaDespachoPlanilla5.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaDespachoPlanilla5(XMLGregorianCalendar value) {
        this.fechaDespachoPlanilla5 = value;
    }

    /**
     * Obtiene el valor de la propiedad estado5.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstado5() {
        return estado5;
    }

    /**
     * Define el valor de la propiedad estado5.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstado5(String value) {
        this.estado5 = value;
    }

    /**
     * Obtiene el valor de la propiedad causal5.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCausal5() {
        return causal5;
    }

    /**
     * Define el valor de la propiedad causal5.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCausal5(String value) {
        this.causal5 = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoRuta5.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoRuta5() {
        return tipoRuta5;
    }

    /**
     * Define el valor de la propiedad tipoRuta5.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoRuta5(String value) {
        this.tipoRuta5 = value;
    }

    /**
     * Obtiene el valor de la propiedad planillaFinal.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPlanillaFinal() {
        return planillaFinal;
    }

    /**
     * Define el valor de la propiedad planillaFinal.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPlanillaFinal(Integer value) {
        this.planillaFinal = value;
    }

    /**
     * Obtiene el valor de la propiedad placaSalidaFinal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlacaSalidaFinal() {
        return placaSalidaFinal;
    }

    /**
     * Define el valor de la propiedad placaSalidaFinal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlacaSalidaFinal(String value) {
        this.placaSalidaFinal = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaDespachoPlanillaFinal.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaDespachoPlanillaFinal() {
        return fechaDespachoPlanillaFinal;
    }

    /**
     * Define el valor de la propiedad fechaDespachoPlanillaFinal.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaDespachoPlanillaFinal(XMLGregorianCalendar value) {
        this.fechaDespachoPlanillaFinal = value;
    }

    /**
     * Obtiene el valor de la propiedad estadoFinal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstadoFinal() {
        return estadoFinal;
    }

    /**
     * Define el valor de la propiedad estadoFinal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstadoFinal(String value) {
        this.estadoFinal = value;
    }

    /**
     * Obtiene el valor de la propiedad causalFinal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCausalFinal() {
        return causalFinal;
    }

    /**
     * Define el valor de la propiedad causalFinal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCausalFinal(String value) {
        this.causalFinal = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoRutaFinal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoRutaFinal() {
        return tipoRutaFinal;
    }

    /**
     * Define el valor de la propiedad tipoRutaFinal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoRutaFinal(String value) {
        this.tipoRutaFinal = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaEntrega.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaEntrega() {
        return fechaEntrega;
    }

    /**
     * Define el valor de la propiedad fechaEntrega.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaEntrega(XMLGregorianCalendar value) {
        this.fechaEntrega = value;
    }

    /**
     * Obtiene el valor de la propiedad estadoActual.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstadoActual() {
        return estadoActual;
    }

    /**
     * Define el valor de la propiedad estadoActual.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstadoActual(String value) {
        this.estadoActual = value;
    }

}
