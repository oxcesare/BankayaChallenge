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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Habilidades complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Habilidades">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="is_hidden" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="slot" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Habilidad" type="{http://www.challenge.com/Bankaya/Bean}Habilidad"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Habilidades", propOrder = {
    "isHidden",
    "slot",
    "habilidad"
})
public class Habilidades {

    @XmlElement(name = "is_hidden")
    protected boolean isHidden;
    protected int slot;
    @XmlElement(name = "Habilidad", required = true)
    protected Habilidad habilidad;

    /**
     * Obtiene el valor de la propiedad isHidden.
     * 
     */
    public boolean isIsHidden() {
        return isHidden;
    }

    /**
     * Define el valor de la propiedad isHidden.
     * 
     */
    public void setIsHidden(boolean value) {
        this.isHidden = value;
    }

    /**
     * Obtiene el valor de la propiedad slot.
     * 
     */
    public int getSlot() {
        return slot;
    }

    /**
     * Define el valor de la propiedad slot.
     * 
     */
    public void setSlot(int value) {
        this.slot = value;
    }

    /**
     * Obtiene el valor de la propiedad habilidad.
     * 
     * @return
     *     possible object is
     *     {@link Habilidad }
     *     
     */
    public Habilidad getHabilidad() {
        return habilidad;
    }

    /**
     * Define el valor de la propiedad habilidad.
     * 
     * @param value
     *     allowed object is
     *     {@link Habilidad }
     *     
     */
    public void setHabilidad(Habilidad value) {
        this.habilidad = value;
    }

}
