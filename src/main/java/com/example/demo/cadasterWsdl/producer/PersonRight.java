
package com.example.demo.cadasterWsdl.producer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PersonRight complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PersonRight"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://producer.x-road.eu}PropertyRegInfo"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PropFor" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PropForUse" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Share" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TypeName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonRight", propOrder = {
    "propFor",
    "propForUse",
    "share",
    "typeName"
})
public class PersonRight
    extends PropertyRegInfo
{

    @XmlElement(name = "PropFor", required = true)
    protected String propFor;
    @XmlElement(name = "PropForUse", required = true)
    protected String propForUse;
    @XmlElement(name = "Share", required = true)
    protected String share;
    @XmlElement(name = "TypeName", required = true)
    protected String typeName;

    /**
     * Gets the value of the propFor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPropFor() {
        return propFor;
    }

    /**
     * Sets the value of the propFor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPropFor(String value) {
        this.propFor = value;
    }

    /**
     * Gets the value of the propForUse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPropForUse() {
        return propForUse;
    }

    /**
     * Sets the value of the propForUse property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPropForUse(String value) {
        this.propForUse = value;
    }

    /**
     * Gets the value of the share property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShare() {
        return share;
    }

    /**
     * Sets the value of the share property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShare(String value) {
        this.share = value;
    }

    /**
     * Gets the value of the typeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeName() {
        return typeName;
    }

    /**
     * Sets the value of the typeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeName(String value) {
        this.typeName = value;
    }

}
