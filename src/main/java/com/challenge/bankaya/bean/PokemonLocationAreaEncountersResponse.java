//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2021.08.10 a las 10:41:13 AM CDT 
//


package com.challenge.bankaya.bean;

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
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="location_area_encounters" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="noEncontrado" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "locationAreaEncounters",
    "noEncontrado"
})
@XmlRootElement(name = "PokemonLocationAreaEncountersResponse")
public class PokemonLocationAreaEncountersResponse {

    @XmlElement(name = "location_area_encounters", required = true)
    protected String locationAreaEncounters;
    @XmlElement(required = true)
    protected String noEncontrado;

    /**
     * Obtiene el valor de la propiedad locationAreaEncounters.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationAreaEncounters() {
        return locationAreaEncounters;
    }

    /**
     * Define el valor de la propiedad locationAreaEncounters.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationAreaEncounters(String value) {
        this.locationAreaEncounters = value;
    }

    /**
     * Obtiene el valor de la propiedad noEncontrado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoEncontrado() {
        return noEncontrado;
    }

    /**
     * Define el valor de la propiedad noEncontrado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoEncontrado(String value) {
        this.noEncontrado = value;
    }

}
