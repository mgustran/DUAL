//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2016.04.21 a las 12:22:22 PM CEST 
//


package bicipalma;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the bicipalma package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Estacion_QNAME = new QName("https://api.mobipalma.mobi/docs/", "estacion");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: bicipalma
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link EstacionType }
     * 
     */
    public EstacionType createEstacionType() {
        return new EstacionType();
    }

    /**
     * Create an instance of {@link AnclajesType }
     * 
     */
    public AnclajesType createAnclajesType() {
        return new AnclajesType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EstacionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://api.mobipalma.mobi/docs/", name = "estacion")
    public JAXBElement<EstacionType> createEstacion(EstacionType value) {
        return new JAXBElement<EstacionType>(_Estacion_QNAME, EstacionType.class, null, value);
    }

}
