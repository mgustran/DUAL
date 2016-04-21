//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2016.04.21 a las 12:22:22 PM CEST 
//


package bicipalma;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para estacionType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="estacionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{https://api.mobipalma.mobi/docs/}idType"/&gt;
 *         &lt;element name="direccion" type="{https://api.mobipalma.mobi/docs/}direccionType"/&gt;
 *         &lt;element name="numeroAnclajes" type="{https://api.mobipalma.mobi/docs/}numeroAnclajesType"/&gt;
 *         &lt;element name="anclajes" type="{https://api.mobipalma.mobi/docs/}anclajesType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "estacionType", propOrder = {
    "id",
    "direccion",
    "numeroAnclajes",
    "anclajes"
})
public class EstacionType {

    @XmlElement(defaultValue = "1")
    protected int id;
    @XmlElement(required = true, defaultValue = "Manacor 50")
    protected String direccion;
    @XmlElement(defaultValue = "10")
    protected int numeroAnclajes;
    @XmlElement(required = true)
    protected static ArrayList<AnclajesType> anclajes;

    
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
     * Obtiene el valor de la propiedad numeroAnclajes.
     * 
     */
    public int getNumeroAnclajes() {
        return numeroAnclajes;
    }

    /**
     * Define el valor de la propiedad numeroAnclajes.
     * 
     */
    public void setNumeroAnclajes(int value) {
        this.numeroAnclajes = value;
    }

    /**
     * Obtiene el valor de la propiedad anclajes.
     * 
     * @return
     *     possible object is
     *     {@link AnclajesType }
     *     
     */
  
    public static ArrayList<AnclajesType> getAnclajes() {
    	  return anclajes;
    	 }
    	 
    	 //adds a wrapper element around the XML representation
    	 @XmlElementWrapper(name = "anclajes")
    	 
    	 //override the name for the XML element
    	 @XmlElement(name = "AnclajeType")
    	 public void setAnclajes(ArrayList<AnclajesType> anclajes) {
    	  this.anclajes = anclajes;
    	 }
    
    
}
    
    
    
    
    
    
    
    
    /*
    
    public List<AnclajesType> getAnclajes() {
        return (List<AnclajesType>) anclajes;
    }

    /**
     * Define el valor de la propiedad anclajes.
     * 
     * @param value
     *     allowed object is
     *     {@link AnclajesType }
     *     
     
    public void setAnclajes(AnclajesType value) {
        this.anclajes = (List<AnclajesType>) value;
    }

}

*/
