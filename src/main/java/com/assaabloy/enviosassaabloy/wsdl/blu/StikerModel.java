//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.03.22 a las 07:51:13 AM COT 
//


package com.assaabloy.enviosassaabloy.wsdl.blu;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para StikerModel complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="StikerModel"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Guia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NumeroAlmacenamiento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Cuenta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Remitente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CiudadOrigen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Factura" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DireccionRemitente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Destinatario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DireccionDestino" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TelefonoDestino" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CiudadDestino" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Caja" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="CajaId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="FechaGuia" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="sucursalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Observacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DocumentoExterno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Destino" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Origen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Nit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DIA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Idsucursal" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="DescSucursal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nombre_sucursal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="numeroordencliente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fechastage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="numerordenBlu" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="fechaOrden" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="numeroordenwms" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="almacenBlu" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="localidad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="idCaja" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="numeroTienda" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="referenciaCte" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="observacionesPedido" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="zonaPartida" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pedidoCliente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="articulo" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="cantidad" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Idcliente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fecha" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="cantordenada" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="barrio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ciudad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fechaelaboracion" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="Descripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="documento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Unidades" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="id_destino" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="observaciones" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cliente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DV" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="daneDestino" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ImagenCodeBar" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
 *         &lt;element name="ImagenCodeBar128" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
 *         &lt;element name="ImagenCodeBarGuia128" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
 *         &lt;element name="ImagenCodeMultidimencional" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
 *         &lt;element name="producto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="GuiaId" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="fletesPagos" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="estadar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tobogan" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CodigoBarras" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CostoManejo" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="ValorFlete" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="KilosVolumen" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="Kilos" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="ValorDeclarado" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="EmpresaDireccion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EmpresaTelefono" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EmpresaNombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Peso" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="CodeQr" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
 *         &lt;element name="Recaudo" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="CodPostal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CodPostalEmpresa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ZonaEmpresa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DescSucursalOri" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ZonaPaq" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IsMensajeriaExpresa" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StikerModel", propOrder = {
    "guia",
    "numeroAlmacenamiento",
    "cuenta",
    "remitente",
    "ciudadOrigen",
    "factura",
    "direccionRemitente",
    "destinatario",
    "direccionDestino",
    "telefonoDestino",
    "ciudadDestino",
    "caja",
    "cajaId",
    "fechaGuia",
    "sucursalCode",
    "observacion",
    "documentoExterno",
    "destino",
    "origen",
    "nit",
    "dia",
    "idsucursal",
    "descSucursal",
    "nombreSucursal",
    "numeroordencliente",
    "fechastage",
    "numerordenBlu",
    "fechaOrden",
    "numeroordenwms",
    "almacenBlu",
    "localidad",
    "idCaja",
    "numeroTienda",
    "referenciaCte",
    "observacionesPedido",
    "zonaPartida",
    "pedidoCliente",
    "articulo",
    "cantidad",
    "idcliente",
    "fecha",
    "cantordenada",
    "barrio",
    "ciudad",
    "fechaelaboracion",
    "descripcion",
    "documento",
    "unidades",
    "idDestino",
    "observaciones",
    "cliente",
    "dv",
    "daneDestino",
    "imagenCodeBar",
    "imagenCodeBar128",
    "imagenCodeBarGuia128",
    "imagenCodeMultidimencional",
    "producto",
    "guiaId",
    "fletesPagos",
    "estadar",
    "tobogan",
    "codigoBarras",
    "costoManejo",
    "valorFlete",
    "kilosVolumen",
    "kilos",
    "valorDeclarado",
    "empresaDireccion",
    "empresaTelefono",
    "empresaNombre",
    "peso",
    "codeQr",
    "recaudo",
    "codPostal",
    "codPostalEmpresa",
    "zonaEmpresa",
    "descSucursalOri",
    "zonaPaq",
    "isMensajeriaExpresa"
})
public class StikerModel {

    @XmlElement(name = "Guia")
    protected String guia;
    @XmlElement(name = "NumeroAlmacenamiento")
    protected String numeroAlmacenamiento;
    @XmlElement(name = "Cuenta")
    protected String cuenta;
    @XmlElement(name = "Remitente")
    protected String remitente;
    @XmlElement(name = "CiudadOrigen")
    protected String ciudadOrigen;
    @XmlElement(name = "Factura")
    protected String factura;
    @XmlElement(name = "DireccionRemitente")
    protected String direccionRemitente;
    @XmlElement(name = "Destinatario")
    protected String destinatario;
    @XmlElement(name = "DireccionDestino")
    protected String direccionDestino;
    @XmlElement(name = "TelefonoDestino")
    protected String telefonoDestino;
    @XmlElement(name = "CiudadDestino")
    protected String ciudadDestino;
    @XmlElement(name = "Caja")
    protected int caja;
    @XmlElement(name = "CajaId")
    protected int cajaId;
    @XmlElement(name = "FechaGuia", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaGuia;
    protected String sucursalCode;
    @XmlElement(name = "Observacion")
    protected String observacion;
    @XmlElement(name = "DocumentoExterno")
    protected String documentoExterno;
    @XmlElement(name = "Destino")
    protected String destino;
    @XmlElement(name = "Origen")
    protected String origen;
    @XmlElement(name = "Nit")
    protected String nit;
    @XmlElement(name = "DIA")
    protected String dia;
    @XmlElement(name = "Idsucursal")
    protected int idsucursal;
    @XmlElement(name = "DescSucursal")
    protected String descSucursal;
    @XmlElement(name = "nombre_sucursal")
    protected String nombreSucursal;
    protected String numeroordencliente;
    protected String fechastage;
    protected int numerordenBlu;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaOrden;
    protected String numeroordenwms;
    protected String almacenBlu;
    protected String localidad;
    protected int idCaja;
    protected int numeroTienda;
    protected int referenciaCte;
    protected String observacionesPedido;
    protected String zonaPartida;
    protected String pedidoCliente;
    protected int articulo;
    protected int cantidad;
    @XmlElement(name = "Idcliente")
    protected String idcliente;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fecha;
    protected String cantordenada;
    protected String barrio;
    protected String ciudad;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaelaboracion;
    @XmlElement(name = "Descripcion")
    protected String descripcion;
    protected String documento;
    @XmlElement(name = "Unidades")
    protected int unidades;
    @XmlElement(name = "id_destino")
    protected int idDestino;
    protected String observaciones;
    protected String cliente;
    @XmlElement(name = "DV")
    protected String dv;
    protected String daneDestino;
    @XmlElement(name = "ImagenCodeBar")
    protected byte[] imagenCodeBar;
    @XmlElement(name = "ImagenCodeBar128")
    protected byte[] imagenCodeBar128;
    @XmlElement(name = "ImagenCodeBarGuia128")
    protected byte[] imagenCodeBarGuia128;
    @XmlElement(name = "ImagenCodeMultidimencional")
    protected byte[] imagenCodeMultidimencional;
    protected String producto;
    @XmlElement(name = "GuiaId", required = true)
    protected BigDecimal guiaId;
    protected String fletesPagos;
    protected String estadar;
    protected String tobogan;
    @XmlElement(name = "CodigoBarras")
    protected String codigoBarras;
    @XmlElement(name = "CostoManejo", required = true)
    protected BigDecimal costoManejo;
    @XmlElement(name = "ValorFlete", required = true)
    protected BigDecimal valorFlete;
    @XmlElement(name = "KilosVolumen")
    protected double kilosVolumen;
    @XmlElement(name = "Kilos")
    protected double kilos;
    @XmlElement(name = "ValorDeclarado", required = true)
    protected BigDecimal valorDeclarado;
    @XmlElement(name = "EmpresaDireccion")
    protected String empresaDireccion;
    @XmlElement(name = "EmpresaTelefono")
    protected String empresaTelefono;
    @XmlElement(name = "EmpresaNombre")
    protected String empresaNombre;
    @XmlElement(name = "Peso", required = true, type = Double.class, nillable = true)
    protected Double peso;
    @XmlElement(name = "CodeQr")
    protected byte[] codeQr;
    @XmlElement(name = "Recaudo", required = true)
    protected BigDecimal recaudo;
    @XmlElement(name = "CodPostal")
    protected String codPostal;
    @XmlElement(name = "CodPostalEmpresa")
    protected String codPostalEmpresa;
    @XmlElement(name = "ZonaEmpresa")
    protected String zonaEmpresa;
    @XmlElement(name = "DescSucursalOri")
    protected String descSucursalOri;
    @XmlElement(name = "ZonaPaq")
    protected String zonaPaq;
    @XmlElement(name = "IsMensajeriaExpresa")
    protected boolean isMensajeriaExpresa;

    /**
     * Obtiene el valor de la propiedad guia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGuia() {
        return guia;
    }

    /**
     * Define el valor de la propiedad guia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGuia(String value) {
        this.guia = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroAlmacenamiento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroAlmacenamiento() {
        return numeroAlmacenamiento;
    }

    /**
     * Define el valor de la propiedad numeroAlmacenamiento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroAlmacenamiento(String value) {
        this.numeroAlmacenamiento = value;
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
     * Obtiene el valor de la propiedad remitente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemitente() {
        return remitente;
    }

    /**
     * Define el valor de la propiedad remitente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemitente(String value) {
        this.remitente = value;
    }

    /**
     * Obtiene el valor de la propiedad ciudadOrigen.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCiudadOrigen() {
        return ciudadOrigen;
    }

    /**
     * Define el valor de la propiedad ciudadOrigen.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCiudadOrigen(String value) {
        this.ciudadOrigen = value;
    }

    /**
     * Obtiene el valor de la propiedad factura.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFactura() {
        return factura;
    }

    /**
     * Define el valor de la propiedad factura.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFactura(String value) {
        this.factura = value;
    }

    /**
     * Obtiene el valor de la propiedad direccionRemitente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDireccionRemitente() {
        return direccionRemitente;
    }

    /**
     * Define el valor de la propiedad direccionRemitente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDireccionRemitente(String value) {
        this.direccionRemitente = value;
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
     * Obtiene el valor de la propiedad direccionDestino.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDireccionDestino() {
        return direccionDestino;
    }

    /**
     * Define el valor de la propiedad direccionDestino.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDireccionDestino(String value) {
        this.direccionDestino = value;
    }

    /**
     * Obtiene el valor de la propiedad telefonoDestino.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelefonoDestino() {
        return telefonoDestino;
    }

    /**
     * Define el valor de la propiedad telefonoDestino.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelefonoDestino(String value) {
        this.telefonoDestino = value;
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
     * Obtiene el valor de la propiedad caja.
     * 
     */
    public int getCaja() {
        return caja;
    }

    /**
     * Define el valor de la propiedad caja.
     * 
     */
    public void setCaja(int value) {
        this.caja = value;
    }

    /**
     * Obtiene el valor de la propiedad cajaId.
     * 
     */
    public int getCajaId() {
        return cajaId;
    }

    /**
     * Define el valor de la propiedad cajaId.
     * 
     */
    public void setCajaId(int value) {
        this.cajaId = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaGuia.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaGuia() {
        return fechaGuia;
    }

    /**
     * Define el valor de la propiedad fechaGuia.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaGuia(XMLGregorianCalendar value) {
        this.fechaGuia = value;
    }

    /**
     * Obtiene el valor de la propiedad sucursalCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSucursalCode() {
        return sucursalCode;
    }

    /**
     * Define el valor de la propiedad sucursalCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSucursalCode(String value) {
        this.sucursalCode = value;
    }

    /**
     * Obtiene el valor de la propiedad observacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObservacion() {
        return observacion;
    }

    /**
     * Define el valor de la propiedad observacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObservacion(String value) {
        this.observacion = value;
    }

    /**
     * Obtiene el valor de la propiedad documentoExterno.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentoExterno() {
        return documentoExterno;
    }

    /**
     * Define el valor de la propiedad documentoExterno.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentoExterno(String value) {
        this.documentoExterno = value;
    }

    /**
     * Obtiene el valor de la propiedad destino.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestino() {
        return destino;
    }

    /**
     * Define el valor de la propiedad destino.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestino(String value) {
        this.destino = value;
    }

    /**
     * Obtiene el valor de la propiedad origen.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrigen() {
        return origen;
    }

    /**
     * Define el valor de la propiedad origen.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrigen(String value) {
        this.origen = value;
    }

    /**
     * Obtiene el valor de la propiedad nit.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNit() {
        return nit;
    }

    /**
     * Define el valor de la propiedad nit.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNit(String value) {
        this.nit = value;
    }

    /**
     * Obtiene el valor de la propiedad dia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDIA() {
        return dia;
    }

    /**
     * Define el valor de la propiedad dia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDIA(String value) {
        this.dia = value;
    }

    /**
     * Obtiene el valor de la propiedad idsucursal.
     * 
     */
    public int getIdsucursal() {
        return idsucursal;
    }

    /**
     * Define el valor de la propiedad idsucursal.
     * 
     */
    public void setIdsucursal(int value) {
        this.idsucursal = value;
    }

    /**
     * Obtiene el valor de la propiedad descSucursal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescSucursal() {
        return descSucursal;
    }

    /**
     * Define el valor de la propiedad descSucursal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescSucursal(String value) {
        this.descSucursal = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreSucursal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreSucursal() {
        return nombreSucursal;
    }

    /**
     * Define el valor de la propiedad nombreSucursal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreSucursal(String value) {
        this.nombreSucursal = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroordencliente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroordencliente() {
        return numeroordencliente;
    }

    /**
     * Define el valor de la propiedad numeroordencliente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroordencliente(String value) {
        this.numeroordencliente = value;
    }

    /**
     * Obtiene el valor de la propiedad fechastage.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechastage() {
        return fechastage;
    }

    /**
     * Define el valor de la propiedad fechastage.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechastage(String value) {
        this.fechastage = value;
    }

    /**
     * Obtiene el valor de la propiedad numerordenBlu.
     * 
     */
    public int getNumerordenBlu() {
        return numerordenBlu;
    }

    /**
     * Define el valor de la propiedad numerordenBlu.
     * 
     */
    public void setNumerordenBlu(int value) {
        this.numerordenBlu = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaOrden.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaOrden() {
        return fechaOrden;
    }

    /**
     * Define el valor de la propiedad fechaOrden.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaOrden(XMLGregorianCalendar value) {
        this.fechaOrden = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroordenwms.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroordenwms() {
        return numeroordenwms;
    }

    /**
     * Define el valor de la propiedad numeroordenwms.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroordenwms(String value) {
        this.numeroordenwms = value;
    }

    /**
     * Obtiene el valor de la propiedad almacenBlu.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlmacenBlu() {
        return almacenBlu;
    }

    /**
     * Define el valor de la propiedad almacenBlu.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlmacenBlu(String value) {
        this.almacenBlu = value;
    }

    /**
     * Obtiene el valor de la propiedad localidad.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalidad() {
        return localidad;
    }

    /**
     * Define el valor de la propiedad localidad.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalidad(String value) {
        this.localidad = value;
    }

    /**
     * Obtiene el valor de la propiedad idCaja.
     * 
     */
    public int getIdCaja() {
        return idCaja;
    }

    /**
     * Define el valor de la propiedad idCaja.
     * 
     */
    public void setIdCaja(int value) {
        this.idCaja = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroTienda.
     * 
     */
    public int getNumeroTienda() {
        return numeroTienda;
    }

    /**
     * Define el valor de la propiedad numeroTienda.
     * 
     */
    public void setNumeroTienda(int value) {
        this.numeroTienda = value;
    }

    /**
     * Obtiene el valor de la propiedad referenciaCte.
     * 
     */
    public int getReferenciaCte() {
        return referenciaCte;
    }

    /**
     * Define el valor de la propiedad referenciaCte.
     * 
     */
    public void setReferenciaCte(int value) {
        this.referenciaCte = value;
    }

    /**
     * Obtiene el valor de la propiedad observacionesPedido.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObservacionesPedido() {
        return observacionesPedido;
    }

    /**
     * Define el valor de la propiedad observacionesPedido.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObservacionesPedido(String value) {
        this.observacionesPedido = value;
    }

    /**
     * Obtiene el valor de la propiedad zonaPartida.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZonaPartida() {
        return zonaPartida;
    }

    /**
     * Define el valor de la propiedad zonaPartida.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZonaPartida(String value) {
        this.zonaPartida = value;
    }

    /**
     * Obtiene el valor de la propiedad pedidoCliente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPedidoCliente() {
        return pedidoCliente;
    }

    /**
     * Define el valor de la propiedad pedidoCliente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPedidoCliente(String value) {
        this.pedidoCliente = value;
    }

    /**
     * Obtiene el valor de la propiedad articulo.
     * 
     */
    public int getArticulo() {
        return articulo;
    }

    /**
     * Define el valor de la propiedad articulo.
     * 
     */
    public void setArticulo(int value) {
        this.articulo = value;
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
     * Obtiene el valor de la propiedad idcliente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdcliente() {
        return idcliente;
    }

    /**
     * Define el valor de la propiedad idcliente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdcliente(String value) {
        this.idcliente = value;
    }

    /**
     * Obtiene el valor de la propiedad fecha.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFecha() {
        return fecha;
    }

    /**
     * Define el valor de la propiedad fecha.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFecha(XMLGregorianCalendar value) {
        this.fecha = value;
    }

    /**
     * Obtiene el valor de la propiedad cantordenada.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCantordenada() {
        return cantordenada;
    }

    /**
     * Define el valor de la propiedad cantordenada.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCantordenada(String value) {
        this.cantordenada = value;
    }

    /**
     * Obtiene el valor de la propiedad barrio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBarrio() {
        return barrio;
    }

    /**
     * Define el valor de la propiedad barrio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBarrio(String value) {
        this.barrio = value;
    }

    /**
     * Obtiene el valor de la propiedad ciudad.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCiudad() {
        return ciudad;
    }

    /**
     * Define el valor de la propiedad ciudad.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCiudad(String value) {
        this.ciudad = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaelaboracion.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaelaboracion() {
        return fechaelaboracion;
    }

    /**
     * Define el valor de la propiedad fechaelaboracion.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaelaboracion(XMLGregorianCalendar value) {
        this.fechaelaboracion = value;
    }

    /**
     * Obtiene el valor de la propiedad descripcion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Define el valor de la propiedad descripcion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcion(String value) {
        this.descripcion = value;
    }

    /**
     * Obtiene el valor de la propiedad documento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumento() {
        return documento;
    }

    /**
     * Define el valor de la propiedad documento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumento(String value) {
        this.documento = value;
    }

    /**
     * Obtiene el valor de la propiedad unidades.
     * 
     */
    public int getUnidades() {
        return unidades;
    }

    /**
     * Define el valor de la propiedad unidades.
     * 
     */
    public void setUnidades(int value) {
        this.unidades = value;
    }

    /**
     * Obtiene el valor de la propiedad idDestino.
     * 
     */
    public int getIdDestino() {
        return idDestino;
    }

    /**
     * Define el valor de la propiedad idDestino.
     * 
     */
    public void setIdDestino(int value) {
        this.idDestino = value;
    }

    /**
     * Obtiene el valor de la propiedad observaciones.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObservaciones() {
        return observaciones;
    }

    /**
     * Define el valor de la propiedad observaciones.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObservaciones(String value) {
        this.observaciones = value;
    }

    /**
     * Obtiene el valor de la propiedad cliente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCliente() {
        return cliente;
    }

    /**
     * Define el valor de la propiedad cliente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCliente(String value) {
        this.cliente = value;
    }

    /**
     * Obtiene el valor de la propiedad dv.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDV() {
        return dv;
    }

    /**
     * Define el valor de la propiedad dv.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDV(String value) {
        this.dv = value;
    }

    /**
     * Obtiene el valor de la propiedad daneDestino.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDaneDestino() {
        return daneDestino;
    }

    /**
     * Define el valor de la propiedad daneDestino.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDaneDestino(String value) {
        this.daneDestino = value;
    }

    /**
     * Obtiene el valor de la propiedad imagenCodeBar.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getImagenCodeBar() {
        return imagenCodeBar;
    }

    /**
     * Define el valor de la propiedad imagenCodeBar.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setImagenCodeBar(byte[] value) {
        this.imagenCodeBar = value;
    }

    /**
     * Obtiene el valor de la propiedad imagenCodeBar128.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getImagenCodeBar128() {
        return imagenCodeBar128;
    }

    /**
     * Define el valor de la propiedad imagenCodeBar128.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setImagenCodeBar128(byte[] value) {
        this.imagenCodeBar128 = value;
    }

    /**
     * Obtiene el valor de la propiedad imagenCodeBarGuia128.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getImagenCodeBarGuia128() {
        return imagenCodeBarGuia128;
    }

    /**
     * Define el valor de la propiedad imagenCodeBarGuia128.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setImagenCodeBarGuia128(byte[] value) {
        this.imagenCodeBarGuia128 = value;
    }

    /**
     * Obtiene el valor de la propiedad imagenCodeMultidimencional.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getImagenCodeMultidimencional() {
        return imagenCodeMultidimencional;
    }

    /**
     * Define el valor de la propiedad imagenCodeMultidimencional.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setImagenCodeMultidimencional(byte[] value) {
        this.imagenCodeMultidimencional = value;
    }

    /**
     * Obtiene el valor de la propiedad producto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProducto() {
        return producto;
    }

    /**
     * Define el valor de la propiedad producto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProducto(String value) {
        this.producto = value;
    }

    /**
     * Obtiene el valor de la propiedad guiaId.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getGuiaId() {
        return guiaId;
    }

    /**
     * Define el valor de la propiedad guiaId.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setGuiaId(BigDecimal value) {
        this.guiaId = value;
    }

    /**
     * Obtiene el valor de la propiedad fletesPagos.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFletesPagos() {
        return fletesPagos;
    }

    /**
     * Define el valor de la propiedad fletesPagos.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFletesPagos(String value) {
        this.fletesPagos = value;
    }

    /**
     * Obtiene el valor de la propiedad estadar.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstadar() {
        return estadar;
    }

    /**
     * Define el valor de la propiedad estadar.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstadar(String value) {
        this.estadar = value;
    }

    /**
     * Obtiene el valor de la propiedad tobogan.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTobogan() {
        return tobogan;
    }

    /**
     * Define el valor de la propiedad tobogan.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTobogan(String value) {
        this.tobogan = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoBarras.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoBarras() {
        return codigoBarras;
    }

    /**
     * Define el valor de la propiedad codigoBarras.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoBarras(String value) {
        this.codigoBarras = value;
    }

    /**
     * Obtiene el valor de la propiedad costoManejo.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCostoManejo() {
        return costoManejo;
    }

    /**
     * Define el valor de la propiedad costoManejo.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCostoManejo(BigDecimal value) {
        this.costoManejo = value;
    }

    /**
     * Obtiene el valor de la propiedad valorFlete.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValorFlete() {
        return valorFlete;
    }

    /**
     * Define el valor de la propiedad valorFlete.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValorFlete(BigDecimal value) {
        this.valorFlete = value;
    }

    /**
     * Obtiene el valor de la propiedad kilosVolumen.
     * 
     */
    public double getKilosVolumen() {
        return kilosVolumen;
    }

    /**
     * Define el valor de la propiedad kilosVolumen.
     * 
     */
    public void setKilosVolumen(double value) {
        this.kilosVolumen = value;
    }

    /**
     * Obtiene el valor de la propiedad kilos.
     * 
     */
    public double getKilos() {
        return kilos;
    }

    /**
     * Define el valor de la propiedad kilos.
     * 
     */
    public void setKilos(double value) {
        this.kilos = value;
    }

    /**
     * Obtiene el valor de la propiedad valorDeclarado.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValorDeclarado() {
        return valorDeclarado;
    }

    /**
     * Define el valor de la propiedad valorDeclarado.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValorDeclarado(BigDecimal value) {
        this.valorDeclarado = value;
    }

    /**
     * Obtiene el valor de la propiedad empresaDireccion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmpresaDireccion() {
        return empresaDireccion;
    }

    /**
     * Define el valor de la propiedad empresaDireccion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmpresaDireccion(String value) {
        this.empresaDireccion = value;
    }

    /**
     * Obtiene el valor de la propiedad empresaTelefono.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmpresaTelefono() {
        return empresaTelefono;
    }

    /**
     * Define el valor de la propiedad empresaTelefono.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmpresaTelefono(String value) {
        this.empresaTelefono = value;
    }

    /**
     * Obtiene el valor de la propiedad empresaNombre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmpresaNombre() {
        return empresaNombre;
    }

    /**
     * Define el valor de la propiedad empresaNombre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmpresaNombre(String value) {
        this.empresaNombre = value;
    }

    /**
     * Obtiene el valor de la propiedad peso.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPeso() {
        return peso;
    }

    /**
     * Define el valor de la propiedad peso.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPeso(Double value) {
        this.peso = value;
    }

    /**
     * Obtiene el valor de la propiedad codeQr.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getCodeQr() {
        return codeQr;
    }

    /**
     * Define el valor de la propiedad codeQr.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setCodeQr(byte[] value) {
        this.codeQr = value;
    }

    /**
     * Obtiene el valor de la propiedad recaudo.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRecaudo() {
        return recaudo;
    }

    /**
     * Define el valor de la propiedad recaudo.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRecaudo(BigDecimal value) {
        this.recaudo = value;
    }

    /**
     * Obtiene el valor de la propiedad codPostal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodPostal() {
        return codPostal;
    }

    /**
     * Define el valor de la propiedad codPostal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodPostal(String value) {
        this.codPostal = value;
    }

    /**
     * Obtiene el valor de la propiedad codPostalEmpresa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodPostalEmpresa() {
        return codPostalEmpresa;
    }

    /**
     * Define el valor de la propiedad codPostalEmpresa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodPostalEmpresa(String value) {
        this.codPostalEmpresa = value;
    }

    /**
     * Obtiene el valor de la propiedad zonaEmpresa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZonaEmpresa() {
        return zonaEmpresa;
    }

    /**
     * Define el valor de la propiedad zonaEmpresa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZonaEmpresa(String value) {
        this.zonaEmpresa = value;
    }

    /**
     * Obtiene el valor de la propiedad descSucursalOri.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescSucursalOri() {
        return descSucursalOri;
    }

    /**
     * Define el valor de la propiedad descSucursalOri.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescSucursalOri(String value) {
        this.descSucursalOri = value;
    }

    /**
     * Obtiene el valor de la propiedad zonaPaq.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZonaPaq() {
        return zonaPaq;
    }

    /**
     * Define el valor de la propiedad zonaPaq.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZonaPaq(String value) {
        this.zonaPaq = value;
    }

    /**
     * Obtiene el valor de la propiedad isMensajeriaExpresa.
     * 
     */
    public boolean isIsMensajeriaExpresa() {
        return isMensajeriaExpresa;
    }

    /**
     * Define el valor de la propiedad isMensajeriaExpresa.
     * 
     */
    public void setIsMensajeriaExpresa(boolean value) {
        this.isMensajeriaExpresa = value;
    }

}
