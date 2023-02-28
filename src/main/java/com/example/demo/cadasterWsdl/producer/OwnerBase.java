
package com.example.demo.cadasterWsdl.producer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OwnerBase complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OwnerBase"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Address" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="OwnerName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Pin" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="Propcode" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OwnerBase", propOrder = {
    "address",
    "ownerName",
    "pin",
    "propcode"
})
@XmlSeeAlso({
    Owner.class
})
public class OwnerBase {

    @XmlElement(name = "Address", required = true)
    protected String address;
    @XmlElement(name = "OwnerName", required = true)
    protected String ownerName;
    @XmlElement(name = "Pin")
    protected long pin;
    @XmlElement(name = "Propcode")
    protected long propcode;

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
     * Gets the value of the ownerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnerName() {
        return ownerName;
    }

    /**
     * Sets the value of the ownerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnerName(String value) {
        this.ownerName = value;
    }

    /**
     * Gets the value of the pin property.
     * 
     */
    public long getPin() {
        return pin;
    }

    /**
     * Sets the value of the pin property.
     * 
     */
    public void setPin(long value) {
        this.pin = value;
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

}
