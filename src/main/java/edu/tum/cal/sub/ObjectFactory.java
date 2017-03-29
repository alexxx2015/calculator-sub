//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2017.03.28 um 05:12:29 PM CEST 
//


package edu.tum.cal.sub;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the edu.tum.cal.sub package. 
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


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: edu.tum.cal.sub
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SubNumbersRequest }
     * 
     */
    public SubNumbersRequest createSubNumbersRequest() {
        return new SubNumbersRequest();
    }

    /**
     * Create an instance of {@link SubNumbersResponse }
     * 
     */
    public SubNumbersResponse createSubNumbersResponse() {
        return new SubNumbersResponse();
    }

}
