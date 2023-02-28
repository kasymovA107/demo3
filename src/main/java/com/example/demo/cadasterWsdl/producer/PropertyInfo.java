
package com.example.demo.cadasterWsdl.producer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PropertyInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PropertyInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Address" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ForType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ForUseType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="OwnForm" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PropCode" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PropertyInfo", propOrder = {
    "address",
    "forType",
    "forUseType",
    "ownForm",
    "propCode",
    "type"
})
public class PropertyInfo {

    @XmlElement(name = "Address", required = true)
    protected String address;
    @XmlElement(name = "ForType", required = true)
    protected String forType;
    @XmlElement(name = "ForUseType", required = true)
    protected String forUseType;
    @XmlElement(name = "OwnForm", required = true)
    protected String ownForm;
    @XmlElement(name = "PropCode")
    protected long propCode;
    @XmlElement(name = "Type", required = true)
    protected String type;

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress(String value) {
        this.address = value;
    }

    /**
     * Gets the value of the forType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForType() {
        return forType;
    }

    /**
     * Sets the value of the forType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForType(String value) {
        this.forType = value;
    }

    /**
     * Gets the value of the forUseType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForUseType() {
        return forUseType;
    }

    /**
     * Sets the value of the forUseType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForUseType(String value) {
        this.forUseType = value;
    }

    /**
     * Gets the value of the ownForm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnForm() {
        return ownForm;
    }

    /**
     * Sets the value of the ownForm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnForm(String value) {
        this.ownForm = value;
    }

    /**
     * Gets the value of the propCode property.
     * 
     */
    public long getPropCode() {
        return propCode;
    }

    /**
     * Sets the value of the propCode property.
     * 
     */
    public void setPropCode(long value) {
        this.propCode = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

}
