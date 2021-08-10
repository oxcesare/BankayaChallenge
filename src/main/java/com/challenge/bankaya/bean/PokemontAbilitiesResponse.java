//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2021.08.10 a las 10:41:13 AM CDT 
//


package com.challenge.bankaya.bean;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="Habilidades" type="{http://www.challenge.com/Bankaya/Bean}Habilidades" maxOccurs="unbounded" minOccurs="0"/>
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
    "habilidades",
    "noEncontrado"
})
@XmlRootElement(name = "PokemontAbilitiesResponse")
public class PokemontAbilitiesResponse {

    @XmlElement(name = "Habilidades")
    protected List<Habilidades> habilidades;
    @XmlElement(required = true)
    protected String noEncontrado;

    /**
     * Gets the value of the habilidades property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the habilidades property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHabilidades().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Habilidades }
     * 
     * 
     */
    public List<Habilidades> getHabilidades() {
        if (habilidades == null) {
            habilidades = new ArrayList<Habilidades>();
        }
        return this.habilidades;
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
