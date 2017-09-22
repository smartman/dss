//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.09.22 at 11:15:48 AM CEST 
//


package eu.europa.esig.dss.jaxb.detailedreport;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SubXCV complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubXCV">
 *   &lt;complexContent>
 *     &lt;extension base="{http://dss.esig.europa.eu/validation/detailed-report}ConstraintsConclusion">
 *       &lt;sequence>
 *         &lt;element name="RFC" type="{http://dss.esig.europa.eu/validation/detailed-report}RFC" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="TrustAnchor" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubXCV", propOrder = {
    "rfc"
})
public class XmlSubXCV
    extends XmlConstraintsConclusion
{

    @XmlElement(name = "RFC")
    protected XmlRFC rfc;
    @XmlAttribute(name = "Id", required = true)
    protected String id;
    @XmlAttribute(name = "TrustAnchor")
    protected Boolean trustAnchor;

    /**
     * Gets the value of the rfc property.
     * 
     * @return
     *     possible object is
     *     {@link XmlRFC }
     *     
     */
    public XmlRFC getRFC() {
        return rfc;
    }

    /**
     * Sets the value of the rfc property.
     * 
     * @param value
     *     allowed object is
     *     {@link XmlRFC }
     *     
     */
    public void setRFC(XmlRFC value) {
        this.rfc = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the trustAnchor property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTrustAnchor() {
        return trustAnchor;
    }

    /**
     * Sets the value of the trustAnchor property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTrustAnchor(Boolean value) {
        this.trustAnchor = value;
    }

}
