
package com.example.demo.cadasterWsdl.producer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SoateData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SoateData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="address" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ate_name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="message" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="propcode" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="soate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SoateData", propOrder = {
    "address",
    "ateName",
    "message",
    "propcode",
    "soate"
})
public class SoateData {

    @XmlElement(required = true)
    protected String address;
    @XmlElement(name = "ate_name", required = true)
    protected String ateName;
    @XmlElement(required = true)
    protected String message;
    protected long propcode;
    @XmlElement(required = true)
    protected String soate;

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
     * Gets the value of the ateName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAteName() {
        return ateName;
    }

    /**
     * Sets the value of the ateName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAteName(String value) {
        this.ateName = value;
    }

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessage(String value) {
        this.message = value;
    }

    /**
     * Gets the value of the propcode property.
     * 
     */
    public long getPropcode() {
        return propcode;
    }

    /**
     * Sets the value of the propcode property.
     * 
     */
    public void setPropcode(long value) {
        this.propcode = value;
    }

    /**
     * Gets the value of the soate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSoate() {
        return soate;
    }

    /**
     * Sets the value of the soate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSoate(String value) {
        this.soate = value;
    }

}
